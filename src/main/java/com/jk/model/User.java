package com.jk.model;

import java.io.Serializable;

public class User implements Serializable{

    private Integer pid;

    private String pname;

    private  String type;

    private String url;

    private Integer parentid;

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
