/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ManagementSystem.dao;

import com.ManagementSystem.entity.Students;
import java.util.ArrayList;


/**
 *
 * @author Satish
 */
public interface StudentDAO {
    void insert(Students students);
    Students getById(int id);
    boolean delete(int id);
    ArrayList<Students> getAll();
    ArrayList<Students> search(String param);
    int count();
    
}
