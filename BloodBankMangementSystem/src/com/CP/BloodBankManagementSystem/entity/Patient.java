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
public class Patient {
    private String name, gender, homeAddr, offAddr,  phNo, offNo, moNo, eMail, bloodGrp, hospitalName;
    private int age, weight,pid;

    public Patient() {
    }

    public String getHospitalName() {
        return hospitalName;
    }   

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Patient(String name, String bloodGrp) {
        this.bloodGrp = bloodGrp;
        this.name=name;
    }
    

    public Patient(int pid,String name, String gender, String homeAddr, String offAddr, String phNo, String offNo, String moNo, String eMail, String bloodGrp, int age, int weight, String hospitalName) {
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
        this.pid = pid;
        this.hospitalName=hospitalName;
    }

    public Patient(String name, String gender, String homeAddr, String offAddr, String phNo, String offNo, String moNo, String eMail, String bloodGrp, int age, int weight, String hospitalName) {
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
        this.hospitalName=hospitalName;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
}
