package com.imnu.pojo;

public class userbean {
    //用户信息表：id（主键）、用户名、密码、电话、地址、性别、姓名、会员积分、训练计划、是否教练、创建时间、修改时间
    public int id;
    public String name;
    public String password;
    public String phone;
    public String address;
    public String sex;
    public String realname;
    public String score;
    public String plan;
    public String is_coach;

    public userbean(int id, String name, String password, String phone, String address, String sex, String realname, String score, String plan, String is_coach) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
        this.realname = realname;
        this.score = score;
        this.plan = plan;
        this.is_coach = is_coach;
    }

    public userbean(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String isIs_coach() {
        return is_coach;
    }

    public void setIs_coach(String is_coach) {
        this.is_coach = is_coach;
    }

    @Override
    public String toString() {
        return "userbean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", realname='" + realname + '\'' +
                ", score='" + score + '\'' +
                ", plan='" + plan + '\'' +
                ", is_coach='" + is_coach + '\'' +
                '}';
    }
}
