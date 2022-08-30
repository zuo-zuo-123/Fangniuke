package com.zuo.entity;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
/*封装分页相关的信息*/
public class Page {
    //当前页码(current与limit后台向前台传)
    private Integer current = 1;
    /*一页闲适的总条数*/
    private Integer limit = 10;
    /*评论总数*/
    private Integer rows;
    /*查询路径（用于复用分页链接）*/
    private String path;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /*获取当前页的起始行*/
    public int getOffset() {
        return limit * (current - 1) + 1;
    }

    /*获取总页数*/
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /*获取起始页码*/
    public int getFrom() {
        int from = current - 2;
        return from < 1 ? 1 : from;
    }

    /*获取结束页码*/
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }
}
