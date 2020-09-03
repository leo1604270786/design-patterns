package com.zys.design.pattern.chainofresponsibility;

/**
 * @Description 总经理
 * @Author leo
 * @Date 2020/8/27 15:05
 */
public class GeneralManager extends Manager{
    public GeneralManager() {
    }

    public GeneralManager(Manager successor) {
        super(successor);
    }

    @Override
    public void handlerRequest(RequestParam requestParam) {
        //同意所有人的申请
        System.out.println("GeneralManager 同意 " + requestParam.getUserName() +
                " 的申请，费用为 " + requestParam.getFee() + "，申请时间：" + requestParam.getRequestTime());
    }
}
