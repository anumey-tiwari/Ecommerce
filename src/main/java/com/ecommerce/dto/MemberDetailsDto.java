/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.dto;

/**
 *
 * @author Anumey
 */
public class MemberDetailsDto {
    
    private long memberID;
    private String password;
    private String emailId;
    private boolean admin;

    public long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "MemberDetailsDto{" + "memberID=" + memberID + ", password=" + password + ", emailId=" + emailId + ", admin=" + admin + '}';
    }
   
    
}