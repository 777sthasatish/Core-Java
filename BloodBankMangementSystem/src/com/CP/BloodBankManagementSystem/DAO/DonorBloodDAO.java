/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO;

import com.CP.BloodBankManagementSystem.entity.Donor;
import com.CP.BloodBankManagementSystem.entity.DonorBlood;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public interface DonorBloodDAO {
    void insert(DonorBlood db)throws SQLException, ClassNotFoundException;
     Donor searchDonor(String name) throws ClassNotFoundException, SQLException;
     List<DonorBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException;
}
 