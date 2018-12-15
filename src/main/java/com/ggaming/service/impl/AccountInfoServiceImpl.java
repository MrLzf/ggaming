package com.ggaming.service.impl;

import com.ggaming.domain.AccountInfo;
import com.ggaming.mapper.AccountInfoMapper;
import com.ggaming.service.AccountInfoService;
import com.ggaming.util.MD5;
import com.ggaming.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoMapper accountInfoMapper;
    @Override
    public int add(AccountInfo accountInfo) {
        return accountInfoMapper.insert(accountInfo);
    }

    @Override
    public int delete(String id) {
        return accountInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int update(AccountInfo accountInfo) {
        return accountInfoMapper.updateByPrimaryKey(accountInfo);
    }

    @Override
    public AccountInfo find(String id) {
        return accountInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AccountInfo> all() {
        return null;
    }

    @Override
    public AccountInfo accountAndPwdSelect(String accountid, String password) {
        AccountInfo accountInfo = accountInfoMapper.accountAndPwdSelect(accountid,MD5.encryption(password));
        if(accountInfo!=null){
            //1.登录成功,把当前对象封装到session中
            UserContext.setCurrent(accountInfo);
        }else {
            System.out.println("登录失败");
        }
        return accountInfo;
        //return accountInfoMapper.accountAndPwdSelect(accountid,password);
    }
}
