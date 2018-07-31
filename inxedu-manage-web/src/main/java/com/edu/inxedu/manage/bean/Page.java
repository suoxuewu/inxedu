package com.edu.inxedu.manage.bean;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
    private List<T> datas;
    private int totalno;//总页数
    private int pageno;
    private int totalsize;//总条数
    private int pagesize;

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public int getTotalno() {
        return this.getTotalsize()%(this.getPagesize()==0?this.getTotalsize()/this.getPagesize():(this.getTotalsize()/this.getPagesize()+1));
    }
    //总页数=总记录数totalsize/pageSize
//    public void setTotalno(int totalno) {
//        this.totalno = totalno;
//    }
//    public int getTotalsize() {
//        return this.getTotalno()%(this.getPagesize()==0?this.getTotalno()/this.getPagesize():(this.getTotalno()/this.getPagesize()+1));
//    }
//
    public Integer getStartIndex() {
        //可以得到start = (currentPage - 1) * pageSize

        return (this.getPageno()-1>0?this.getPageno()-1:1)*(this.getPagesize());
    }
    public int getPageno() {

        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public int getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(int totalsize) {
        this.totalsize = totalsize;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public Page(int pageno, int pagesize) {
        this.pageno = pageno;
        this.pagesize = pagesize;
    }
}
