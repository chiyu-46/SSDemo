package com.chiyu.user.action;

import com.chiyu.user.bo.UserBo;

// 这是一个 Spring 的 Bean。
public class UserSpringAction {
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
        return "success";

    }
}
