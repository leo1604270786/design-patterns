package com.zys.design.pattern.chainofresponsibility;

/**
 * @Description 经理抽象类
 * @Author leo
 * @Date 2020/8/27 14:52
 */
public abstract class Manager {
    /**
     * 持有后续责任对象的引用
     */
    protected Manager successor;

    public Manager() {
    }

    public Manager(Manager successor) {
        this.successor = successor;
    }

    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     * @param requestParam 请求参数
     */
    public abstract void handlerRequest(RequestParam requestParam);
}
