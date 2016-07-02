/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.LoginDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Login;
import com.CP.BloodBankMangementSystem.UI.Loginform;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Satish
 */
public class LoginDAOImpl implements LoginDAO{
    private DBConnection conn;   

    public LoginDAOImpl() throws ClassNotFoundException {
        conn=new DBConnection();
    }
    
    @Override
    public void insert(Login l) throws ClassNotFoundException, SQLException {
        String sql="Insert into tbl_login(User_Name, Password, U_Id) Values(?,?,?)";
        conn.open();
        PreparedStatement stmt=conn.initStatement(sql);
        stmt.setString(1, l.getUserName());
        stmt.setString(2, l.getPassword());
        stmt.setInt(3, l.getUserId());
        conn.executeUpdate();
        conn.close();                
    }

    
    
}
