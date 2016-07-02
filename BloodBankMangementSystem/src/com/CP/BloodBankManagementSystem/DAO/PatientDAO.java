/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO;

import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public interface PatientDAO {
    void insert(Patient p)throws ClassNotFoundException, SQLException;
    int update(Patient p)throws ClassNotFoundException, SQLException;  
    ResultSet getListOfPID() throws ClassNotFoundException, SQLException;
    Patient searchPatient(int pid)throws ClassNotFoundException, SQLException;
    boolean deletePatient(int pid)throws ClassNotFoundException, SQLException;
    List<Patient> getListOfPatient()throws ClassNotFoundException, SQLException;
}
