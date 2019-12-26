package com.shenruan.domain;

import java.io.Serializable;

/**
 * 账户的实体类
 */
public class Account implements Serializable {
    private Integer user_id;
    private String name;
    private Float money;

    @Override
    public String toString() {
        return "user_t{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
