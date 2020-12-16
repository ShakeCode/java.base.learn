package com.java.learn.extendT;

/**
 * The type Operator user base vo.基础信息实体
 * 2020-12-16
 */
public class OperatorUserBaseVO {
    private String phone;

    private String operator;

    private String address;

    private String location;

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

    /**
     * Gets operator.
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets operator.
     * @param operator the operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * Gets address.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets location.
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "OperatorUserBaseVO{" +
                "phone='" + phone + '\'' +
                ", operator='" + operator + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
