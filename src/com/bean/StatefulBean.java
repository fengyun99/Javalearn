package com.bean;

import com.dao.User;

public class StatefulBean {
    public int state;
    //由于多线程环境下，user是引用对象，是非线程安全的
    public User user;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
