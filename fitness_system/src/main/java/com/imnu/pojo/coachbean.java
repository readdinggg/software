package com.imnu.pojo;

public class coachbean {
    public int id;
    public String name;
    public String sex;
    public int age;
    public String height;
    public String weight;
    public String worktime;
    public String remark;
    public int lessontime;
    public int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getLessontime() {
        return lessontime;
    }

    public void setLessontime(int lessontime) {
        this.lessontime = lessontime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "coachbean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", worktime='" + worktime + '\'' +
                ", remark='" + remark + '\'' +
                ", lessontime=" + lessontime +
                ", price=" + price +
                '}';
    }

    public coachbean(int id, String name, String sex, int age, String height, String weight, String worktime, String remark, int lessontime, int price) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.worktime = worktime;
        this.remark = remark;
        this.lessontime = lessontime;
        this.price = price;
    }
    public coachbean(){

    }
}
