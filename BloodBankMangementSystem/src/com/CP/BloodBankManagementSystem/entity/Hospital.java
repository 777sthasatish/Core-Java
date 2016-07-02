/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.entity;

/**
 *
 * @author Satish
 */
public class Hospital {
    int hospitalId;
    String name, location, email, phNo;

    public Hospital() {
    }

    public Hospital(int hospitalId, String name, String location, String email, String phNo) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.location = location;
        this.email = email;
        this.phNo=phNo;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
    
}
