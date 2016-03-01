/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem;

import com.ManagementSystem.dao.CourseDAO;
import com.ManagementSystem.dao.StudentDAO;
import com.ManagementSystem.dao.TrainerDAO;
import com.ManagementSystem.entity.Students;
import com.ManagementSystem.impl.CourseDAOImpl;
import com.ManagementSystem.impl.StudentDAOImpl;
import com.ManagementSystem.impl.TrainerDAOImpl;
import com.ManagementSystem.view.StudentView;
import com.ManagementSystem.view.SwitchController;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Scanner input=new Scanner(System.in);
        StudentDAO studentDAO=new StudentDAOImpl();
        TrainerDAO trainerDAO=new TrainerDAOImpl();
        CourseDAO courseDAO=new CourseDAOImpl();
        StudentView sv = new StudentView(studentDAO,input);
        SwitchController sc=new SwitchController(input, studentDAO, trainerDAO, courseDAO);
        sc.controller();        
    }

}
