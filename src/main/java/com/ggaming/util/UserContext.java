package com.ggaming.util;

import com.ggaming.domain.AccountInfo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 14148 on 2018/1/18.
 */

public class UserContext {
    public static final String USER_IN_SESSION="accountinfo";
    public static final String SESSIONID="sessionid";
    public static HttpServletRequest getRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }
    public static void setCurrent(AccountInfo accountInfo) {
        getRequest().getSession().setAttribute(USER_IN_SESSION,accountInfo);
    }
    public static AccountInfo getSession() {
        return (AccountInfo) getRequest().getSession().getAttribute(USER_IN_SESSION);
    }
    public static void setSessionId(String sessionId) {
        getRequest().getSession().setAttribute(SESSIONID,sessionId);
    }
    public static String getSessionId() {

        return  (String) getRequest().getSession().getAttribute(SESSIONID);
    }

}