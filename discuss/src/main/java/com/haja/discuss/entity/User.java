package com.haja.discuss.entity;

import com.haja.discuss.DiscussContants;
import com.haja.discuss.util.DateUtils;
import org.springframework.util.MultiValueMap;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uid;
    private String password;
    private String phone;
    private String address;
    private String email;
    private String role;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public User(){}
    public User(String uid, String password, String phone, String address,  String email){
        this.uid = uid;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.created = DateUtils.now();
        this.role = DiscussContants.ROLE_USER;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", created=" + created +
                '}';
    }
}