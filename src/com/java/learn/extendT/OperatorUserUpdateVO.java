package com.java.learn.extendT;

/**
 * The type Operator user update vo.  更新实体
 * 2020-12-16
 */
public class OperatorUserUpdateVO extends OperatorUserBaseVO {
    private Integer id;

    private String code;

    private String oldDemandCode;

    private String newDemandCode;

    private Boolean isDemandUpdate;

    private String updateDate;

    private String updateUser;

    /**
     * Gets id.
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets code.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets old demand code.
     * @return the old demand code
     */
    public String getOldDemandCode() {
        return oldDemandCode;
    }

    /**
     * Sets old demand code.
     * @param oldDemandCode the old demand code
     */
    public void setOldDemandCode(String oldDemandCode) {
        this.oldDemandCode = oldDemandCode;
    }

    /**
     * Gets new demand code.
     * @return the new demand code
     */
    public String getNewDemandCode() {
        return newDemandCode;
    }

    /**
     * Sets new demand code.
     * @param newDemandCode the new demand code
     */
    public void setNewDemandCode(String newDemandCode) {
        this.newDemandCode = newDemandCode;
    }

    /**
     * Gets demand update.
     * @return the demand update
     */
    public Boolean getDemandUpdate() {
        return isDemandUpdate;
    }

    /**
     * Sets demand update.
     * @param demandUpdate the demand update
     */
    public void setDemandUpdate(Boolean demandUpdate) {
        isDemandUpdate = demandUpdate;
    }

    /**
     * Gets update date.
     * @return the update date
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets update date.
     * @param updateDate the update date
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Gets update user.
     * @return the update user
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets update user.
     * @param updateUser the update user
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "OperatorUserUpdateVO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", oldDemandCode='" + oldDemandCode + '\'' +
                ", newDemandCode='" + newDemandCode + '\'' +
                ", isDemandUpdate=" + isDemandUpdate +
                ", updateDate='" + updateDate + '\'' +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }
}
