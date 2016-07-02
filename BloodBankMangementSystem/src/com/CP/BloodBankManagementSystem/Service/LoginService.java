/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.Impl.LoginDAOImpl;
import com.CP.BloodBankManagementSystem.DAO.LoginDAO;
import com.CP.BloodBankManagementSystem.entity.Login;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public class LoginService {
     private final LoginDAO loginDAO;

    public LoginService() throws ClassNotFoundException {
        loginDAO=new LoginDAOImpl();
    }
    public void insert(Login l) throws ClassNotFoundException, SQLException
    {
        loginDAO.insert(l);
    }
    
            
    
}
