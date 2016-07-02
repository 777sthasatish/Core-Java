/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.HospitalDAO;
import com.CP.BloodBankManagementSystem.DAO.Impl.HospitalDAOImpl;
import com.CP.BloodBankManagementSystem.entity.Hospital;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public class HospitalService {
    private final HospitalDAO hospitalDAO;
    public HospitalService() throws ClassNotFoundException {
        hospitalDAO=new HospitalDAOImpl();
    }  
    public void insert(Hospital h)throws ClassNotFoundException, SQLException
    {
        hospitalDAO.insert(h);
    }
}
