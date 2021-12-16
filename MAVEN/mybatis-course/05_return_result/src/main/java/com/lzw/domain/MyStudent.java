package com.lzw.domain;

public class MyStudent {

    private Integer stuid;
    private String stuname;
    private String stuemail;
    private Integer stuage;

    public MyStudent() {
    }

    public MyStudent(Integer stuid, String stuname, String sturmail, Integer stuage) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuemail = sturmail;
        this.stuage = stuage;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSturmail() {
        return stuemail;
    }

    public void setSturmail(String sturmail) {
        this.stuemail = sturmail;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", sturmail='" + stuemail + '\'' +
                ", stuage=" + stuage +
                '}';
    }
}
