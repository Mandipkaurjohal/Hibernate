package com.Hibernate.HiberneteDemo.UserEntity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;



@Entity // to tell hibernete to create table in database
@Table(name="users") // to set name of the table


public class User {


    @Id
// to set primary key in table id is column name
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private     String email;
    private String phoneNumber;
    public User() {
    }

    public User(Long id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
