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
public class HospitalBlood {
    String hospitalName, patientName, bloodGrp;
    int bloodPacket;

    public HospitalBlood() {
    }

    public HospitalBlood(String hospitalName, String patientName, String bloodGrp, int bloodPacket) {
        this.hospitalName = hospitalName;
        this.patientName = patientName;
        this.bloodGrp = bloodGrp;
        this.bloodPacket = bloodPacket;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public int getBloodPacket() {
        return bloodPacket;
    }

    public void setBloodPacket(int bloodPacket) {
        this.bloodPacket = bloodPacket;
    }
    
}
