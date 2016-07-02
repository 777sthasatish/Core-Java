/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CP.BloodBankManagementSystem.DAO;

import com.CP.BloodBankManagementSystem.entity.Hospital;
import java.sql.SQLException;

/**
 *
 * @author Satish
 */
public interface HospitalDAO {
    void insert(Hospital h)throws ClassNotFoundException, SQLException;
}
