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
public class Donor {
    private String name, gender, homeAddr, offAddr,  phNo, offNo, moNo, eMail, bloodGrp;
    private int age, weight,did;

    public Donor() {
    }

    public Donor(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }
    

    public Donor(int did,String name, String gender, String homeAddr, String offAddr, String phNo, String offNo, String moNo, String eMail, String bloodGrp, int age, int weight) {
        this.did=did;
        this.name = name;
        this.gender = gender;
        this.homeAddr = homeAddr;
        this.offAddr = offAddr;
        this.phNo = phNo;
        this.offNo = offNo;
        this.moNo = moNo;
        this.eMail = eMail;
        this.bloodGrp = bloodGrp;
        this.age = age;
        this.weight = weight;
        
    }


    public Donor(String name, String gender, String homeAddr, String offAddr, String phNo, String offNo, String moNo, String eMail, String bloodGrp, int age, int weight) {
        
        this.name = name;
        this.gender = gender;
        this.homeAddr = homeAddr;
        this.offAddr = offAddr;
        this.phNo = phNo;
        this.offNo = offNo;
        this.moNo = moNo;
        this.eMail = eMail;
        this.bloodGrp = bloodGrp;
        this.age = age;
        this.weight = weight;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getOffAddr() {
        return offAddr;
    }

    public void setOffAddr(String offAddr) {
        this.offAddr = offAddr;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getOffNo() {
        return offNo;
    }

    public void setOffNo(String offNo) {
        this.offNo = offNo;
    }

    public String getMoNo() {
        return moNo;
    }

    public void setMoNo(String moNo) {
        this.moNo = moNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
