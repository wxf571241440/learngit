package com.xf.bean;

import java.util.Date;

/**
 * @program: Demo0921
 * @description:
 * @author: wxf
 * @create: 2020-09-22 17:29
 */
public class Book {
    private int id;
    private String name ;
    private Date outDate;
    private String mark;

    public Book() {
    }

    public Book(int id, String name, Date outDate, String mark) {
        this.id = id;
        this.name = name;
        this.outDate = outDate;
        this.mark = mark;
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

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
