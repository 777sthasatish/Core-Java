/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.Impl.PatientDAOImpl;
import com.CP.BloodBankManagementSystem.DAO.PatientDAO;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public class PatientService {

    private final PatientDAO patientDAO;

    public PatientService() throws ClassNotFoundException {
        patientDAO = new PatientDAOImpl();
    }

    public void insert(Patient p) throws ClassNotFoundException, SQLException {
        patientDAO.insert(p);
    }

    public int update(Patient p) throws ClassNotFoundException, SQLException {
        return patientDAO.update(p);
    }

    public Patient searchPatient(int pid) throws ClassNotFoundException, SQLException {
        return patientDAO.searchPatient(pid);
    }

    public boolean deletePatient(int pid) throws ClassNotFoundException, SQLException
    {
        return patientDAO.deletePatient(pid);        
    }
     public List<Patient> getListOfPatient() throws ClassNotFoundException, SQLException {
         return patientDAO.getListOfPatient();
     }
      public ResultSet getListOfDID()throws ClassNotFoundException, SQLException
    {
       return patientDAO.getListOfPID();
    }

}
