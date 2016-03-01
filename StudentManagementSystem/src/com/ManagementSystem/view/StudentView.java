/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.view;

import com.ManagementSystem.dao.StudentDAO;
import com.ManagementSystem.entity.Students;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class StudentView {

    private StudentDAO studentDAO;
    private Scanner input;

    public StudentView(StudentDAO studentDAO, Scanner input) {
        this.studentDAO = studentDAO;
        this.input = input;
    }
     public static void selectMenu() {
        System.out.println("***************************");
        System.out.println("Student Management System");
        System.out.println("***************************");
        System.out.println("1.Student");
        System.out.println("2.Trainer");
        System.out.println("3.Course");
        System.out.println("4.Exit");
        System.out.println("Enter your choice[1-4]:");
    }

    public static void menu1() {
        System.out.println("***************************");
        System.out.println("Student");
        System.out.println("***************************");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search by ID");
        System.out.println("4. Show All Students");
        System.out.println("5. Search");
        System.out.println("6. Count");
        System.out.println("7. Back");
        System.out.println("Enter your choice[1-7]:");    }


    public void add() {

        while (true) {
            Students student = new Students();
            System.out.println("Add Students");
            System.out.println("Enter ID");
            student.setId(input.nextInt());
            System.out.println("Enter First Name");
            student.setFirstName(input.next());
            System.out.println("Enter Last Name");
            student.setLastName(input.next());
            System.out.println("Enter Contact Number");
            student.setContactNo(input.next());
            System.out.println("Enter Email Address");
            student.setEmail(input.next());
            studentDAO.insert(student);
            System.out.println("Do you want to go add more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void delete() {
        System.out.println("Delete Student Records");
        boolean more = true;
        while (true) {
            System.out.println("Enter Student ID to delete");
            if (studentDAO.delete(input.nextInt())) {
                System.out.println("Students Record Deleted Successfully");
            } else {
                System.out.println("Records not found");
            }

            System.out.println("Do you want to go delete more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                more = false;
                break;
            } else {
                continue;
            }
        }
    }

    public void showAll() {
        studentDAO.getAll().forEach(s -> {
            System.out.println(s.toString());
        });
    }

    public void search() {
        while (true) {
            System.out.println("Enter any similar character to search");
            studentDAO.search(input.next()).forEach(s -> {
                System.out.println(s.toString());
            });

            System.out.println("Do you want to search more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            } else {
                continue;
            }
        }
    }

    public void searchByID() {
        System.out.println("Search Student Records");
        while (true) {
            System.out.println("Enter Student ID to Search");
            Students student = studentDAO.getById(input.nextInt());
            if (student != null) {
                System.out.println(student.toString());
            } else {
                System.out.println("Records not found");
            }
            System.out.println("Do you want to search more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            } else {
                continue;
            }
        }
    }

    public void student() {
        while (true) {
            menu1();            
            switch (input.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    searchByID();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.out.println("You have toal number of" + " " + studentDAO.count() + " " + "Students");
                    break;
                case 7:
                    System.out.println("Do you really want to go back[Y/N]");
                    if (input.next().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        continue;
                    }

            }
            break;
        }
    }

}
