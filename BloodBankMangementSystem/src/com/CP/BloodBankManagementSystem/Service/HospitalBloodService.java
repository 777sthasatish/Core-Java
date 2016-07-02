/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.HospitalBloodDAO;
import com.CP.BloodBankManagementSystem.DAO.Impl.HospitalBloodDAOImpl;
import com.CP.BloodBankManagementSystem.entity.HospitalBlood;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public class HospitalBloodService {
    HospitalBloodDAO hospitalBloodDAO;

    public HospitalBloodService() throws ClassNotFoundException {
        hospitalBloodDAO=new HospitalBloodDAOImpl();
    }
    
    public void insert(HospitalBlood hb) throws SQLException, ClassNotFoundException
    {
        hospitalBloodDAO.insert(hb);
    }
    public Patient searchPatient(String name) throws ClassNotFoundException, SQLException {
        return hospitalBloodDAO.searchPatient(name);
    }
    
   public List<HospitalBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException {
       return hospitalBloodDAO.getListOfDonorBlood();
   }
  
}
