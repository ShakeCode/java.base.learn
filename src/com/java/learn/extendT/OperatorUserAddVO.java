package com.java.learn.extendT;

/**
 * The type Operator user add vo. 新增实体
 * 2020-12-16
 */
public class OperatorUserAddVO extends OperatorUserBaseVO {

    private String createDate;

    private String createUser;

    private String gridCode;

    /**
     * Gets create date.
     * @return the create date
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets create date.
     * @param createDate the create date
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets create user.
     * @return the create user
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets create user.
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * Gets grid code.
     * @return the grid code
     */
    public String getGridCode() {
        return gridCode;
    }

    /**
     * Sets grid code.
     * @param gridCode the grid code
     */
    public void setGridCode(String gridCode) {
        this.gridCode = gridCode;
    }

    @Override
    public String toString() {
        // super.toString();
        return "OperatorUserAddVO{" +
                "createDate='" + createDate + '\'' +
                ", createUser='" + createUser + '\'' +
                ", gridCode='" + gridCode + '\'' +
                '}';
    }
}
