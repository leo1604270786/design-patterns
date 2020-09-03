package com.zys.design.pattern.builder;

import java.util.Collection;

/**
 * @Description txt格式builder
 * @Author leo
 * @Date 2020/8/24 14:57
 */
public class TxtBuilder implements Builder{

    private StringBuilder sb = new StringBuilder();

    @Override
    public void buildHeader(Header header) {
        sb.append(header.getFileName())
                .append("\n")
                .append(header.getCreateDate());
    }

    @Override
    public void buildBody(Collection<Body> bodies) {
        sb.append("\n");
        for (Body body : bodies) {
            sb.append(body.getId())
                    .append(",")
                    .append(body.getCount())
                    .append("\n");
        }
    }

    @Override
    public void buildFooter(Footer footer) {
        sb.append(footer.getUserName());
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
