/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO;

import com.CP.BloodBankManagementSystem.entity.Hospital;
import com.CP.BloodBankManagementSystem.entity.HospitalBlood;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public interface HospitalBloodDAO {
    void insert(HospitalBlood hb)throws SQLException, ClassNotFoundException;
     Patient searchPatient(String name) throws ClassNotFoundException, SQLException;
     List<HospitalBlood> getListOfDonorBlood() throws ClassNotFoundException, SQLException;
}
