package com.ggaming.controller;

import com.ggaming.domain.AccountInfo;
import com.ggaming.domain.ApiCustomer;
import com.ggaming.service.AccountInfoService;
import com.ggaming.service.AcctBalanceService;
import com.ggaming.service.ApiCustomerService;
import com.ggaming.service.GameService;
import com.ggaming.util.GgFiseUtil;
import com.ggaming.util.JSONResult;
import com.ggaming.util.UserContext;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lzf
 */
@Controller
public class UserController {
    private static final String ggUrl = "http://testapisw.gg626.com/api/doSingle.do";
    @Autowired
    private AccountInfoService accountInfoService;
    @Autowired
    private AcctBalanceService balanceService;
    @Autowired
    private GameService gameService;
    @Autowired
    private ApiCustomerService apiCustomerService;

    @RequestMapping("/")
    public String toChange(Model model) {
        return "index";
    }
    @RequestMapping("index")
    public String index(Model model) {
        //获取游戏列表
        model.addAttribute("game", gameService.queryPage());
        //独立查询出gg2的image
        model.addAttribute("image", gameService.fineByGameId("110"));
        return "pcindex";
    }
    @RequestMapping("mobileindex")
    public String noLoginindex(Model model) {
        //获取游戏列表
        model.addAttribute("game", gameService.queryPage());
        //独立查询出gg2的image
        model.addAttribute("image", gameService.fineByGameId("110"));
        return "mobileindex";
    }

    @RequestMapping("/pc/index")
    public String loginSuccess(Model model, HttpServletResponse response) throws Exception {
        //登录成功后
        //获取游戏列表
        //model.addAttribute("game",gameService.getList());
        model.addAttribute("game", gameService.queryPage());
        //独立查询出gg2的image
        model.addAttribute("image", gameService.fineByGameId("110"));
        if (UserContext.getSession() == null) {
            //没有登录
            response.sendRedirect("/index.do");
        } else {
            //登录后的
            String accountName = UserContext.getSession().getAccountno();
            model.addAttribute("account", accountInfoService.find(accountName));
            //获取余额
            model.addAttribute("balance", balanceService.getBalance(accountName));
        }

        return "pcindex";
    }
    @RequestMapping("/mobile/index")
    public String mobile(Model model, HttpServletResponse response) throws Exception {
        //登录成功后
        //获取游戏列表
        //model.addAttribute("game",gameService.getList());
        model.addAttribute("game", gameService.queryPage());
        //独立查询出gg2的image
        model.addAttribute("image", gameService.fineByGameId("110"));
        if (UserContext.getSession() == null) {
            //没有登录
            response.sendRedirect("/mobileindex.do");
        } else {
            //登录后的
            String accountName = UserContext.getSession().getAccountno();
            model.addAttribute("account", accountInfoService.find(accountName));
            //获取余额
            model.addAttribute("balance", balanceService.getBalance(accountName));
        }

        return "mobileindex";
    }

    @RequestMapping("playGame")
    public String playGame(Model model, HttpServletResponse response, HttpServletRequest request, String gameid) throws Exception {
        if (UserContext.getSession() == null) {
           // response.sendRedirect("/");
            return "redirect:/";
        } else {
            //登录后的
            //String accountno = UserContext.getSession().getAccountname();
            String accountno = UserContext.getSession().getAccountno();
            String cagentId = UserContext.getSession().getApicode();
            String passw = UserContext.getSession().getPwd();
            String sessionId = UserContext.getSession().getSessiondId();
            //如果直接用密码登录就选择Accountname
            //如果直接用数据库的pwd,选择accountno
           // String passw = "123456";
            //检查gg捕鱼是否已经创建  des
            //根据cagentId获取des 在apicustomer表中
            ApiCustomer apiCustomer=apiCustomerService.selectByPrimaryKey(cagentId);
            String password = GgFiseUtil.getPassWord("cagent=" + cagentId + "/\\\\/loginname=" + accountno + "/\\\\/password=" + passw + "/\\\\/method=ca/\\\\/cur=CNY/\\\\/actype=1",apiCustomer.getDeskey());
            String md5Value = GgFiseUtil.getMd5_(password,apiCustomer.getMd5key());
            String url = ggUrl + "?params=" + password + "&key=" + md5Value;
            String json = GgFiseUtil.toPost(url,cagentId);
            JSONObject jsonObject = new JSONObject(json);
            //直接获取
            //String sessionId=request.getSession().getId();
            //String sessionId="3ED5AC84AB770D0D41E3C2EC28F6153459256823627240521EFE0FD66FC1AE58099541AFA50AF746";
            //通过调用获取
            String sessionId2=UserContext.getSessionId();
            if ("0".equals(String.valueOf(jsonObject.get("code")))) {
                //TODO
                String sid = cagentId + String.valueOf(System.currentTimeMillis());
                String ip = request.getHeader("x-real-ip");

                password = GgFiseUtil.getPassWord("cagent=" + cagentId + "/\\\\/loginname=" + accountno + "/\\\\/password=" + passw + "/\\\\/method=fw/\\\\/sid=" + sid + "/\\\\/lang=zh-CN/\\\\/gametype="+gameid+"/\\\\/ip=" + ip + "/\\\\/sessionId=" + sessionId + "/\\\\/ishttps=1",apiCustomer.getDeskey());
                md5Value = GgFiseUtil.getMd5_(password,apiCustomer.getMd5key());
                url = ggUrl + "?params=" + password + "&key=" + md5Value;
                json = GgFiseUtil.toPost(url,cagentId);
                JSONObject jsonObject2 = new JSONObject(json);
                System.out.println(jsonObject2.get("url"));
                model.addAttribute("myUrl", jsonObject2.get("url"));
            } else {
                return "fail";
            }


        }
        return "iframe";
    }

    @RequestMapping("/userLogin")
    @ResponseBody
    public JSONResult userLogin(String username, String password, HttpSession session, HttpServletRequest request) {
        JSONResult jsonResult = null;
        AccountInfo accountInfo = accountInfoService.accountAndPwdSelect(username, password);
        if (accountInfo != null) {
            //登录成功
            String sessionId=request.getSession().getId();
            UserContext.setSessionId(sessionId);
            //DefaultMessage R=new DefaultMessage();
            //session.setAttribute("sessionId", R.getSessionId());
            jsonResult = new JSONResult("登录成功");
        } else {
            //登录失败
            jsonResult = new JSONResult(false, "用户名或密码错误!");
        }
        return jsonResult;
    }


}
