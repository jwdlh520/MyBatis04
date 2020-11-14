package com.itlaobing.vo;

public class StudentAndClassVo {
    //学生信息
    private String sid;
    private Integer sage;
    private String sname;
    private String saddress;
    private String sclassId;

    //班级信息
    private String cid;
    private String cname;

    @Override
    public String toString() {
        return "StudentAndClassVo{" +
                "sid='" + sid + '\'' +
                ", sage=" + sage +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                ", sclassId='" + sclassId + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSclassId() {
        return sclassId;
    }

    public void setSclassId(String sclassId) {
        this.sclassId = sclassId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
