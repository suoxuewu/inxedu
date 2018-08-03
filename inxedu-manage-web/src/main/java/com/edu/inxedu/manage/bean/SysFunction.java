package com.edu.inxedu.manage.bean;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFunction implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer functionId;
    @Column
    private Integer parentId;
    @Column
    private String functionName;
    @Column
    private String functionUrl;
    @Column
    private Integer functionType;//权限类型1.菜单，2，功能
    @Column
    private Date createTime;
    @Column
    private Integer sort;
    @Column
    private String imageUrl;
    @Transient
    private List<SysFunction> children = new ArrayList<>();
    @Transient
    private boolean open = true;
    @Transient
    private boolean checked = false;

    public List<SysFunction> getChildren() {
        return children;
    }

    public void setChildren(List<SysFunction> children) {
        this.children = children;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }

    public Integer getFunctionType() {
        return functionType;
    }

    public void setFunctionType(Integer functionType) {
        this.functionType = functionType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imgageUrl) {
        this.imageUrl = imgageUrl;
    }
}
