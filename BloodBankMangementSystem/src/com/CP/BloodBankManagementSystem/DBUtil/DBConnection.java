/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public class DBConnection {
    
    private Connection conn=null;
    private PreparedStatement stmt=null;
    
    
    public DBConnection() throws ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
    }  
  
  public void open() throws SQLException, ClassNotFoundException
  {     
      conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_mgmt_sys", "root", "");
  }
  
  public PreparedStatement initStatement(String sql) throws SQLException
  {
      stmt=conn.prepareCall(sql);
      return stmt;
  }
 
  public ResultSet executeQuery() throws SQLException
  {
     return stmt.executeQuery();
  }
  
  public int executeUpdate() throws SQLException
  {
      return stmt.executeUpdate();
  }  
  
  
  public void close() throws SQLException
  {
      if(conn!=null && !conn.isClosed())
      {
          conn.close();
          conn=null;
      }
  }        
}
