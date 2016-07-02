/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.DonorBloodDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Donor;
import com.CP.BloodBankManagementSystem.entity.DonorBlood;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class DonorBloodDAOImpl implements DonorBloodDAO{
    private final DBConnection conn;
    public DonorBloodDAOImpl() throws ClassNotFoundException {
         conn=new DBConnection();
    }

    @Override
    public void insert(DonorBlood db) throws ClassNotFoundException, SQLException{
         String sql = "Insert into tbl_donor_blood(Name, Blood_Group , Blood_Packet, Date)"
                + "Values(?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, db.getDonorName());
        stmt.setString(2, db.getBloodGrp());
        stmt.setInt(3, db.getBloodPacket());
        stmt.setDate(4, db.getDonotedDate());         
        conn.executeUpdate();
        conn.close();
    }

    @Override
    public Donor searchDonor(String name) throws ClassNotFoundException, SQLException {
        
        String sql = "Select * From tbl_donor where Name='" + name + "'";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();        
        if (rst.next()) {
            Donor newDonor = new Donor(rst.getString("Blood_Group"));
            return newDonor;
        } else {
            return null;
        }
    }

    @Override
    public List<DonorBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException {
       String sql = "Select Name, Blood_Group, Blood_Packet, Date from tbl_donor_blood";
        conn.open();
        PreparedStatement stmt=conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        List<DonorBlood> donorBloodRegister = new ArrayList<DonorBlood>();
        while (rst.next()) {
            if (!rst.getString("Name").endsWith("-")) {
                
                DonorBlood record = new DonorBlood(rst.getString("Name"), rst.getString("Blood_Group"), rst.getInt("Blood_Packet"), rst.getDate("Date"));
                
                donorBloodRegister.add(record);
            }

        }
        return donorBloodRegister;
    }
    
}
