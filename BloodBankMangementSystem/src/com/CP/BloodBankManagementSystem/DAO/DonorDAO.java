/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO;

import com.CP.BloodBankManagementSystem.entity.Donor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public interface DonorDAO {

    void insert(Donor d) throws ClassNotFoundException, SQLException;

    int update(Donor d) throws ClassNotFoundException, SQLException;
    ResultSet getListOfDID() throws ClassNotFoundException, SQLException;

    Donor searchDonor(int did) throws ClassNotFoundException, SQLException;

    boolean deleteDonor(int did) throws ClassNotFoundException, SQLException;

    List<Donor> getListOfDonors() throws ClassNotFoundException, SQLException;
}
