package com.zys.design.pattern.chainofresponsibility;

/**
 * @Description 项目经理
 * @Author leo
 * @Date 2020/8/27 14:53
 */
public class ProjectManager extends Manager{
    public ProjectManager() {
    }

    public ProjectManager(Manager successor) {
        super(successor);
    }

    @Override
    public void handlerRequest(RequestParam requestParam) {
        //费用<500
        if (requestParam.getFee() < 500) {
            //模拟，只允许leo申请
            if ("leo".equals(requestParam.getUserName())) {
                System.out.println("ProjectManager 同意 " + requestParam.getUserName() +
                        " 的申请，费用为 " + requestParam.getFee() + "，申请时间：" + requestParam.getRequestTime());
            } else {
                System.out.println("ProjectManager 不同意 " + requestParam.getUserName() +
                        " 的申请，费用为 " + requestParam.getFee() + "，申请时间：" + requestParam.getRequestTime());
            }
        } else {
            //费用>=500，交给其他人处理
            if (successor != null) {
                successor.handlerRequest(requestParam);
            }
        }
    }

}
