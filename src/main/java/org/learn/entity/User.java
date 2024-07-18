package org.learn.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false, name = "UserName")
    private String name;
    @Column(nullable = false, name = "UserAddress")
    private String address;
    @Column(nullable = false ,unique = true, name = "UserMobileNumber")
    private long MobileNumber;
    @Column(nullable = false, name = "Education")
    private String Education;

    public User(long userId, String name, String address, long mobileNumber, String education) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        MobileNumber = mobileNumber;
        Education = education;
    }

    public User() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}
