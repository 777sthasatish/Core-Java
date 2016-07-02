/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.entity;

import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public class Login {

    private DBConnection conn;
    private String userName;
    private String password; 
    private int userId;

    public Login() throws ClassNotFoundException {
        conn = new DBConnection();
    }

    public Login(String userName, String password, int userId) {
        this.userName = userName;
        this.password = password;
        this.userId=userId;
        
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

   

   
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
