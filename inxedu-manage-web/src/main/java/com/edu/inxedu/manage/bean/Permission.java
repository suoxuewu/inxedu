package com.edu.inxedu.manage.bean;

import java.util.ArrayList;
import java.util.List;

public class Permission {

    private Integer id;
    private String name;
    private List<Permission> children = new ArrayList<>();
    private Integer pid;
    private String icon;
    private String url;
    private Boolean open = true;

    private Boolean checked = false;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Permission> getChildren() {
        return children;
    }
    public void setChildren(List<Permission> children) {
        this.children = children;
    }
    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
