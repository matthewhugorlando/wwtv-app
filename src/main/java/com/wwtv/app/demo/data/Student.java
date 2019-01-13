package com.wwtv.demo.data;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private Date dob;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String first_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String id) {
        this.dob = dob;
    }

}
