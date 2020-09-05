package com.java.learn.genericT;

import java.util.List;

public class RequestVO<T> {


    private String objectCode;


    private String operation;


    private List<T> data;


    private String city;

    private String userName;


    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestVO{" +
                "objectCode='" + objectCode + '\'' +
                ", operation='" + operation + '\'' +
                ", data=" + data +
                ", city='" + city + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public RequestVO(String objectCode, String operation, List<T> data) {
        this.objectCode = objectCode;
        this.operation = operation;
        this.data = data;
    }

    public RequestVO() {
    }


    public String getCity() {
        return city;
    }

    // 模版设计模式原理
    public RequestVO<T> setCity(String city) {
        this.city = city;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public RequestVO<T> setUserName(String userName) {
        this.userName = userName;
        return this;  // 返回当前实例
    }
}
