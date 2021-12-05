package com.chiyu.user.action;

import com.chiyu.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;

// 这是一个 Struts2 的 Action。
public class UserAction extends ActionSupport {
    //这个有Get与Set方法的变量不需要赋值，他的值在Spring配置文件中对应的bean定义
    UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public String execute() throws Exception {
        //正如所见，我们没有为它赋值，但我们可以使用它。
        userBo.printUser();
        return SUCCESS;

    }
}
