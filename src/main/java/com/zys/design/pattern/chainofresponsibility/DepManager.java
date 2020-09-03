package com.zys.design.pattern.chainofresponsibility;

/**
 * @Description 部门经理
 * @Author leo
 * @Date 2020/8/27 15:00
 */
public class DepManager extends Manager{
    public DepManager() {
    }

    public DepManager(Manager successor) {
        super(successor);
    }

    @Override
    public void handlerRequest(RequestParam requestParam) {
        //费用<2000
        if (requestParam.getFee() < 2000) {
            //模拟，只允许leo申请
            if ("leo".equals(requestParam.getUserName())) {
                System.out.println("DepManager 同意 " + requestParam.getUserName() +
                        " 的申请，费用为 " + requestParam.getFee() + "，申请时间：" + requestParam.getRequestTime());
            } else {
                System.out.println("DepManager 不同意 " + requestParam.getUserName() +
                        " 的申请，费用为 " + requestParam.getFee() + "，申请时间：" + requestParam.getRequestTime());
            }
        } else {
            //费用>=2000，交给其他人处理
            if (successor != null) {
                successor.handlerRequest(requestParam);
            }
        }
    }
}
