package com.java.learn.extendT;

/**
 * The type Test operator user.
 * 2020-12-16
 */
public class TestOperatorUser {

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        OperatorUserAddVO addVO = new OperatorUserAddVO();
        addVO.setAddress("东莞市");
        // 传入新增实体子类
        System.out.println(dealScore(addVO));

        OperatorUserUpdateVO updateVO = new OperatorUserUpdateVO();
        updateVO.setAddress("深圳市");
        // 传入修改实体子类
        System.out.println(dealScore(updateVO));

        OperatorUserQueryVO queryVO = new OperatorUserQueryVO();
        queryVO.setPageIndex(1);
        queryVO.setPageSize(10);
    }


    /**
     * 新增修改时校验参数
     * @param operatorUserVO 新增修改实体的父类，使用基类的公共属性校验业务数据
     * @return
     */
    private static int dealScore(OperatorUserBaseVO operatorUserVO) {
        if (operatorUserVO.getAddress() != null) {
            return 100;
        }
        return 0;
    }
}
