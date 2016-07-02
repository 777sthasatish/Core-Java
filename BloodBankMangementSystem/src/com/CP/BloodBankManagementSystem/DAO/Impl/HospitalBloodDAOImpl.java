/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.HospitalBloodDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Hospital;
import com.CP.BloodBankManagementSystem.entity.HospitalBlood;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class HospitalBloodDAOImpl implements HospitalBloodDAO {
    DBConnection conn;

    public HospitalBloodDAOImpl() throws ClassNotFoundException {
        conn=new DBConnection();
    }
    

    @Override
    public void insert(HospitalBlood hb) throws SQLException, ClassNotFoundException {
         String sql = "Insert into tbl_blood_hospital(Hospital_Name,Name,Blood_Group,Blood_Packet)"
                + "Values(?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, hb.getHospitalName());
        stmt.setString(2, hb.getPatientName());
        stmt.setString(3, hb.getBloodGrp());
        stmt.setInt(4, hb.getBloodPacket());        
        conn.executeUpdate();
        conn.close();
    }

    @Override
    public Patient searchPatient(String name) throws ClassNotFoundException, SQLException {
    String sql = "Select * From tbl_patient where Name='" + name + "'";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();        
        if (rst.next()) {
            Patient newPatient = new Patient(name,rst.getString("Blood_Group"));
            return newPatient;
        } else {
            return null;
        }
    }

    @Override
    public List<HospitalBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException {
         String sql = "Select Hospital_Name, Name, Blood_Group, Blood_Packet from tbl_blood_hospital";
        conn.open();
        PreparedStatement stmt=conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        List<HospitalBlood> donorBloodRegister = new ArrayList<HospitalBlood>();
        while (rst.next()) {
            if (!rst.getString("Name").endsWith("-")) {
                
                HospitalBlood record = new HospitalBlood(rst.getString("Hospital_Name"), rst.getString("Name"), rst.getString("Blood_Group"), rst.getInt("Blood_Packet"));
                
                donorBloodRegister.add(record);
            }

        }
        return donorBloodRegister;
    }

    

   
    
}
