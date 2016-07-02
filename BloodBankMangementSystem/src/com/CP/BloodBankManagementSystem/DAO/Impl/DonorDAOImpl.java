/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.DonorDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Donor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Satish
 */
public class DonorDAOImpl implements DonorDAO {

    private final DBConnection conn;
    private static final String DELETE = "DELETE FROM tbl_donor WHERE DID=?";
    ArrayList<Donor> donorList;
    public DonorDAOImpl() throws ClassNotFoundException {
        this.donorList = new ArrayList<>();
        conn = new DBConnection();
    }

    @Override
    public void insert(Donor d) throws ClassNotFoundException, SQLException {
        String sql = "Insert into tbl_donor(Name, Gender, Age, Weight, Home_Address, Official_Address, Ph_No, Office_No, Mobile_No,EMail, Blood_Group)"
                + "Values(?,?,?,?,?,?,?,?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, d.getName());
        stmt.setString(2, d.getGender());
        stmt.setInt(3, d.getAge());
        stmt.setInt(4, d.getWeight());
        stmt.setString(5, d.getHomeAddr());
        stmt.setString(6, d.getOffAddr());
        stmt.setString(7, d.getPhNo());
        stmt.setString(8, d.getOffNo());
        stmt.setString(9, d.getMoNo());
        stmt.setString(10, d.geteMail());
        stmt.setString(11, d.getBloodGrp());
       
        conn.executeUpdate();
        conn.close();

    }

    @Override
    public int update(Donor d) throws SQLException, ClassNotFoundException {
        String sql = "Update tbl_donor set Name=?, Gender=?,Age=?,Weight=?,Home_Address=?,Official_Address=?,Ph_No=?,Office_No=?,Mobile_No=?,Email=?,Blood_Group=? Where DID =?";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, d.getName());
        stmt.setString(2, d.getGender());
        stmt.setInt(3, d.getAge());
        stmt.setInt(4, d.getWeight());
        stmt.setString(5, d.getHomeAddr());
        stmt.setString(6, d.getOffAddr());
        stmt.setString(7, d.getPhNo());
        stmt.setString(8, d.getOffNo());
        stmt.setString(9, d.getMoNo());
        stmt.setString(10, d.geteMail());
        stmt.setString(11, d.getBloodGrp());
       
        stmt.setInt(12, d.getDid());
        conn.executeUpdate();
        conn.close();
        return 0;
        
    }

 
    @Override
    public Donor searchDonor(int did) throws ClassNotFoundException, SQLException {
       
        String sql = "Select * From tbl_donor where DID=" + did + "";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();        
        if (rst.next()) {
            Donor newDonor = new Donor(did,rst.getString("Name"), rst.getString("Gender"), rst.getString("Home_Address"), rst.getString("Official_Address"), rst.getString("Ph_No"), rst.getString("Office_No"), rst.getString("Mobile_No"), rst.getString("Email"),rst.getString("Blood_Group"),rst.getInt("Age"), rst.getInt("Weight"));
            return newDonor;
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteDonor(int did) throws ClassNotFoundException, SQLException {
        
        boolean delete=false;
        conn.open(); 
        PreparedStatement stmt = conn.initStatement(DELETE);
        stmt.setInt(1, did);
        stmt.executeUpdate();
        conn.close();
        return delete;
    }

    @Override
    public List<Donor> getListOfDonors() throws SQLException, ClassNotFoundException {
        String sql = "Select Name, Gender, Age, Weight, Home_Address, Official_Address, Ph_No, Office_No, Mobile_No, EMail, Blood_Group from tbl_donor";
        conn.open();
        PreparedStatement stmt=conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        List<Donor> donorRegister = new ArrayList<Donor>();
        while (rst.next()) {
            if (!rst.getString("Name").endsWith("-")) {
                
                Donor record = new Donor(rst.getString("Name"), rst.getString("Gender"), rst.getString("Home_Address"), rst.getString("Official_Address"), rst.getString("Ph_No"), rst.getString("Office_No"), rst.getString("Mobile_No"), rst.getString("Email"),rst.getString("Blood_Group"),rst.getInt("Age"), rst.getInt("Weight"));
                
                donorRegister.add(record);
            }

        }
        return donorRegister;
        
    }

    @Override
    public ResultSet getListOfDID() throws ClassNotFoundException, SQLException {
        conn.open();
        String sql = "Select DID From tbl_donor";
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        return rst;
    }

    
}

   