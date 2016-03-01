/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.impl;

import com.ManagementSystem.dao.TrainerDAO;
import com.ManagementSystem.entity.Trainers;
import java.util.ArrayList;

/**
 *
 * @author Satish
 */
public class TrainerDAOImpl implements TrainerDAO {
    ArrayList<Trainers> trainersList;

    public TrainerDAOImpl() {
        trainersList =new ArrayList<>();
    }
    
    

    @Override
    public void insert(Trainers trainers) {
       trainersList.add(trainers);
    }

    @Override
    public Trainers getById(int id) {
        for(Trainers trainers:trainersList)
        {
            if(trainers.getId()==id)
            {
                return trainers;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        boolean hasDelete=false;
        for(Trainers trainers:trainersList)
        {
            if(trainers.getId()==id)
            {
                trainersList.remove(trainers);
                hasDelete=true;
                break;
            }
        }
        return hasDelete;
    }

    @Override
    public ArrayList<Trainers> getAll() {
        return trainersList;
    }

    @Override
    public ArrayList<Trainers> search(String param) {
        ArrayList<Trainers> trainer=new ArrayList<>();
        for(Trainers trainers:trainersList)
        {
            String fName=trainers.getFirstName().toLowerCase();
            String lName=trainers.getLastName().toLowerCase();
            String addrs=trainers.getAddress().toLowerCase();
            String eml=trainers.getEmail().toLowerCase();
            String conNo=trainers.getContactNo().toLowerCase();
            param=param.toLowerCase();
            if(fName.contains(param) || lName.contains(param) || addrs.contains(param) || eml.contains(param) || conNo.contains(param))
            {
                trainer.add(trainers);
            }
        }
        return trainer;
    }

    @Override
    public int count() {
        return trainersList.size();        
    }
    
}
