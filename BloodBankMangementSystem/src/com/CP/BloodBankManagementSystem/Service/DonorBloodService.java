/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.DonorBloodDAO;
import com.CP.BloodBankManagementSystem.DAO.Impl.DonorBloodDAOImpl;
import com.CP.BloodBankManagementSystem.entity.Donor;
import com.CP.BloodBankManagementSystem.entity.DonorBlood;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public class DonorBloodService {
     private final DonorBloodDAO donorBloodDAO;

   
     

    public DonorBloodService() throws ClassNotFoundException
    {
        donorBloodDAO =new DonorBloodDAOImpl();
    }
    
    public void insert(DonorBlood db) throws SQLException, ClassNotFoundException
    {
        donorBloodDAO.insert(db);
    }
    public Donor searchDonor(String name) throws ClassNotFoundException, SQLException
    {
       return donorBloodDAO.searchDonor(name);
    }
     public List<DonorBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException {
         return donorBloodDAO.getListOfDonorBlood();
     }
}
