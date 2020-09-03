package com.zys.design.pattern.builder;

/**
 * @Description 产品主体
 * @Author leo
 * @Date 2020/8/24 14:45
 */
public class Body {
    /**
     * id
     */
    private String id;
    /**
     * 数量
     */
    private String count;

    public Body(String id, String count) {
        this.id = id;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
