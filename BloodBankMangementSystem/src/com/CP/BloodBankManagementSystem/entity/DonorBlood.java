/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.entity;

import java.sql.Date;

/**
 *
 * @author Satish
 */
public class DonorBlood {
    String donorName, bloodGrp;
    int bloodPacket;
    Date donotedDate;

    public DonorBlood() {
    }   

    public DonorBlood(String donorName, String bloodGrp, int bloodPacket, Date donotedDate) {
        this.donorName = donorName;
        this.bloodGrp = bloodGrp;
        this.bloodPacket = bloodPacket;
        this.donotedDate = donotedDate;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
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
    
    public Date getDonotedDate() {
        return donotedDate;
    }

    public void setDonotedDate(Date donotedDate) {
        this.donotedDate = donotedDate;
    }
    
}
