package com.imnu.pojo;

public class dingdanbean {
    public int id;
    public int userid;
    public String username;
    public int coachid;
    public String coachname;
    public int dingdanid;
    public String ispay;
    public String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCoachid() {
        return coachid;
    }

    public void setCoachid(int coachid) {
        this.coachid = coachid;
    }

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname;
    }

    public int getDingdanid() {
        return dingdanid;
    }

    public void setDingdanid(int dingdanid) {
        this.dingdanid = dingdanid;
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public dingdanbean(int id, int userid, String username, int coachid, String coachname, int dingdanid, String ispay, String comments) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.coachid = coachid;
        this.coachname = coachname;
        this.dingdanid = dingdanid;
        this.ispay = ispay;
        this.comments = comments;
    }

    public dingdanbean(){}

    @Override
    public String toString() {
        return "dingdanbean{" +
                "id=" + id +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", coachid=" + coachid +
                ", coachname='" + coachname + '\'' +
                ", dingdanid=" + dingdanid +
                ", ispay='" + ispay + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
