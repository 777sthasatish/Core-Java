/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.dao;

import com.ManagementSystem.entity.Trainers;
import java.util.ArrayList;

/**
 *
 * @author Satish
 */
public interface TrainerDAO {
    void insert(Trainers trainers);
    Trainers getById(int id);
    boolean delete(int id);
    ArrayList<Trainers> getAll();
    ArrayList<Trainers> search(String param);
    int count();
    
}
