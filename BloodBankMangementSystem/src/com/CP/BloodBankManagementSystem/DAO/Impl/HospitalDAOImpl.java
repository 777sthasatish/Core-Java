/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.HospitalDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Hospital;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public class HospitalDAOImpl implements HospitalDAO {
    private final DBConnection conn;

    public HospitalDAOImpl() throws ClassNotFoundException {
        conn=new DBConnection();
    }
    

    @Override
    public void insert(Hospital h) throws ClassNotFoundException, SQLException {
         String sql = "Insert into tbl_hospital(Hospital_Name,Location,Ph_No,EMail)"
                + "Values(?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, h.getName());
        stmt.setString(2, h.getLocation());
        stmt.setString(3, h.getPhNo());
        stmt.setString(4, h.getEmail());        
        conn.executeUpdate();
        conn.close();

    }
    
}
