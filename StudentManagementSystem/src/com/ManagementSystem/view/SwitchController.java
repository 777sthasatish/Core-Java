/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.view;

import com.ManagementSystem.dao.CourseDAO;
import com.ManagementSystem.dao.StudentDAO;
import com.ManagementSystem.dao.TrainerDAO;
import com.ManagementSystem.impl.StudentDAOImpl;
import static com.ManagementSystem.view.StudentView.selectMenu;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class SwitchController {

    private Scanner input;
    private StudentDAO studentDAO;
    private TrainerDAO trainerDAO;
    private CourseDAO courseDAO;

    public SwitchController(Scanner input, StudentDAO studentDAO, TrainerDAO trainerDAO, CourseDAO courseDAO) {
        this.input = input;
        this.studentDAO = studentDAO;
        this.trainerDAO=trainerDAO;
        this.courseDAO=courseDAO;
    }

   
    

    public void controller() {

        while (true) {
            selectMenu();
            switch (input.nextInt()) {
                case 1:
                    StudentView sv = new StudentView(studentDAO, input);
                    sv.student();
                    break;
                case 2:
                    TrainerView tv = new TrainerView(trainerDAO,input);
                    tv.trainer();
                    break;
                case 3:
                    CourseView cv = new CourseView(courseDAO,input);
                    cv.course();
                    break;
                case 4:
                    System.out.println("Do you really want to Exit[Y/N]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
                    break;
            }

        }
    }

}
