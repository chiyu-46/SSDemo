package com.chiyu.user.action;

import com.chiyu.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

// 这是一个 Struts2 的 Action。
public class UserAnotherAction extends ActionSupport {

    public String execute() throws Exception {
        //使用 Spring 的通用WebApplicationContextUtils类直接获取 Spring 的 bean。
        WebApplicationContext context =
                WebApplicationContextUtils.getRequiredWebApplicationContext(
                        ServletActionContext.getServletContext()
                );
        UserBo userBo1 = (UserBo)context.getBean("userBo");
        userBo1.printUser();

        return SUCCESS;

    }
}
