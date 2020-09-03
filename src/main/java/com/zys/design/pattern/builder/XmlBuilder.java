package com.zys.design.pattern.builder;

import java.util.Collection;

/**
 * @Description xml格式builder
 * @Author leo
 * @Date 2020/8/24 15:04
 */
public class XmlBuilder implements Builder{

    private StringBuilder sb = new StringBuilder();

    @Override
    public void buildHeader(Header header) {
        sb.append("<?xml version='1.0' encoding='utf-8' ?>\n")
                .append("<header>\n")
                .append("  <filename> ").append(header.getFileName()).append(" </header>\n")
                .append("  <createdate> ").append(header.getCreateDate()).append(" </createdate>\n")
                .append("</header>\n");
    }

    @Override
    public void buildBody(Collection<Body> bodies) {
        sb.append("<body>\n");
        for (Body body : bodies) {
            sb.append("  <id> ").append(body.getId()).append(" </id>\n")
                    .append("  <count> ").append(body.getCount()).append(" </count>\n");
        }
        sb.append("</body>\n");
    }

    @Override
    public void buildFooter(Footer footer) {
        sb.append("<footer>\n")
                .append("  <username> ").append(footer.getUserName()).append(" </username>\n")
                .append("</footer>");
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
