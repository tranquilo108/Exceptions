package com.example.hw3;

public class Person {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String name;
    private String phone;
    private String date;
    private String sex;

    @Override
    public String toString() {
        return name + " " + phone + " " + date + " " + sex + "\n";
    }

    public Person(String name, String phone, String date, String sex) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.sex = sex;
    }
}
