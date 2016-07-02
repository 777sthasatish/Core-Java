/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO.Impl;

import com.CP.BloodBankManagementSystem.DAO.PatientDAO;
import com.CP.BloodBankManagementSystem.DBUtil.DBConnection;
import com.CP.BloodBankManagementSystem.entity.Patient;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class PatientDAOImpl implements PatientDAO {

    private final DBConnection conn;
    private static final String DELETE = "DELETE FROM tbl_patient WHERE PID=?";
    ArrayList<Patient> patientList;

    public PatientDAOImpl() throws ClassNotFoundException {
        this.patientList = new ArrayList<>();
        conn = new DBConnection();
    }

    @Override
    public void insert(Patient p) throws ClassNotFoundException, SQLException {
        String sql = "Insert into tbl_patient(Name, Gender, Age, Weight, Home_Address, Official_Address, Ph_No, Office_No, Mobile_No,EMail, Blood_Group, Hospital_Name)"
                + "Values(?,?,?,?,?,?,?,?,?,?,?,?)";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getGender());
        stmt.setInt(3, p.getAge());
        stmt.setInt(4, p.getWeight());
        stmt.setString(5, p.getHomeAddr());
        stmt.setString(6, p.getOffAddr());
        stmt.setString(7, p.getPhNo());
        stmt.setString(8, p.getOffNo());
        stmt.setString(9, p.getMoNo());
        stmt.setString(10, p.geteMail());
        stmt.setString(11, p.getBloodGrp());
        stmt.setString(12, p.getHospitalName());
        conn.executeUpdate();
        conn.close();
    }

    @Override
    public int update(Patient p) throws ClassNotFoundException, SQLException {
        String sql = "Update tbl_patient set Name=?, Gender=?,Age=?,Weight=?,Home_Address=?,Official_Address=?,Ph_No=?,Office_No=?,Mobile_No=?,Email=?,Blood_Group=?, Hospital_Name=?  Where PID =?";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getGender());
        stmt.setInt(3, p.getAge());
        stmt.setInt(4, p.getWeight());
        stmt.setString(5, p.getHomeAddr());
        stmt.setString(6, p.getOffAddr());
        stmt.setString(7, p.getPhNo());
        stmt.setString(8, p.getOffNo());
        stmt.setString(9, p.getMoNo());
        stmt.setString(10, p.geteMail());
        stmt.setString(11, p.getBloodGrp());
        stmt.setString(12, p.getHospitalName());
        stmt.setInt(13, p.getPid());
        conn.executeUpdate();
        conn.close();
        return 0;
    }

    @Override
    public Patient searchPatient(int pid) throws ClassNotFoundException, SQLException {
        String sql = "Select * From tbl_patient where PID='" + pid + "'";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        if (rst.next()) {
            Patient newPatient = new Patient(pid, rst.getString("Name"), rst.getString("Gender"), rst.getString("Home_Address"), rst.getString("Official_Address"), rst.getString("Ph_No"), rst.getString("Office_No"), rst.getString("Mobile_No"), rst.getString("Email"), rst.getString("Blood_Group"), rst.getInt("Age"), rst.getInt("Weight"),rst.getString("Hospital_Name"));
            return newPatient;
        } else {
            return null;
        }
    }

    @Override
    public boolean deletePatient(int pid) throws ClassNotFoundException, SQLException {
        conn.open();
        PreparedStatement stmt = conn.initStatement(DELETE);
        stmt.setInt(1, pid);
        stmt.executeUpdate();
        conn.close();
        return false;
    }

    @Override
    public List<Patient> getListOfPatient() throws ClassNotFoundException, SQLException {
        String sql = "Select Name, Gender, Age, Weight, Home_Address, Official_Address, Ph_No, Office_No, Mobile_No, EMail, Blood_Group, Hospital_Name from tbl_patient";
        conn.open();
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        List<Patient> patientRegister = new ArrayList<Patient>();
        while (rst.next()) {
            if (!rst.getString("Name").endsWith("-")) {

                Patient record = new Patient(rst.getString("Name"), rst.getString("Gender"), rst.getString("Home_Address"), rst.getString("Official_Address"), rst.getString("Ph_No"), rst.getString("Office_No"), rst.getString("Mobile_No"), rst.getString("Email"), rst.getString("Blood_Group"), rst.getInt("age"), rst.getInt("weight"), rst.getString("Hospital_Name"));

                patientRegister.add(record);
            }

        }
        return patientRegister;

    }

    @Override
    public ResultSet getListOfPID() throws ClassNotFoundException, SQLException {
        conn.open();
        String sql = "Select PID From tbl_patient";
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rst = stmt.executeQuery();
        return rst;
    }
}
