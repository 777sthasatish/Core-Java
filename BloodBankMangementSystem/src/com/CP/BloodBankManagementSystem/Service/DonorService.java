/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.Service;

import com.CP.BloodBankManagementSystem.DAO.DonorDAO;
import com.CP.BloodBankManagementSystem.DAO.Impl.DonorDAOImpl;
import com.CP.BloodBankManagementSystem.entity.Donor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Satish
 */
public class DonorService {

    private final DonorDAO donorDAO;

    public DonorService() throws ClassNotFoundException {
        donorDAO = new DonorDAOImpl();
    }

    public void insert(Donor d) throws ClassNotFoundException, SQLException {
        donorDAO.insert(d);
    }

    public int update(Donor d) throws ClassNotFoundException, SQLException {
        return donorDAO.update(d);
    }

    public Donor searchDonor(int did) throws ClassNotFoundException, SQLException {
        return donorDAO.searchDonor(did);
    }
    public ResultSet getListOfDID()throws ClassNotFoundException, SQLException
    {
       return donorDAO.getListOfDID();
    }

    public boolean deleteDonor(int did) throws ClassNotFoundException, SQLException {
        return donorDAO.deleteDonor(did);

    }

    public List<Donor> getListOfDonors() throws ClassNotFoundException, SQLException {
        return donorDAO.getListOfDonors();
    }
}
