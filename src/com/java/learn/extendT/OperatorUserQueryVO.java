package com.java.learn.extendT;

import java.util.List;

/**
 * The type Operator user query vo.  查询实体
 * 2020-12-16
 */
public class OperatorUserQueryVO extends QueryParamVO {

    private List<String> codeList;

    private String phone;

    /**
     * Gets code list.
     * @return the code list
     */
    public List<String> getCodeList() {
        return codeList;
    }

    /**
     * Sets code list.
     * @param codeList the code list
     */
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    /**
     * Gets phone.
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
