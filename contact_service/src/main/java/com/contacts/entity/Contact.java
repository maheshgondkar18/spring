package com.contacts.entity;



public class Contact {

    private Long cId;
    private String email;
    private String cName;
    private Long userId;


    public Contact(Long cId, String email, String cName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.cName = cName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
