/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.view;

import com.ManagementSystem.dao.CourseDAO;
import com.ManagementSystem.entity.Course;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class CourseView {
    private Scanner input;
    private CourseDAO courseDAO;
    
    public CourseView(CourseDAO courseDAO, Scanner input)
    {
        this.courseDAO=courseDAO;
        this.input=input;
    }
    public static void menu3() {
        System.out.println("***************************");
        System.out.println("Course");
        System.out.println("***************************");
        System.out.println("1. Add Course");
        System.out.println("2. Delete Course");
        System.out.println("3. Search by ID");
        System.out.println("4. Show All Course");
        System.out.println("5. Search");
        System.out.println("6. Count");
        System.out.println("7. Back");
        System.out.println("Enter your choice[1-7]:");    }
    public void add()
    {
        while(true)
        {
            Course course=new Course();
            System.out.println("Add Course");
            System.out.println("Enter Course ID");
            course.setId(input.nextInt());
            System.out.println("Enter Course Name");
            course.setName(input.next());
            
            courseDAO.insert(course);
            
            System.out.println("Do you want to go add more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
            
        }
    }
    
    public void delete()
    {
        System.out.println("Delete Course records");
        boolean more = true;
        while (true) {
            System.out.println("Enter course ID to delete");
            if (courseDAO.delete(input.nextInt())) {
                System.out.println("Course Record Deleted Successfully");
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
        courseDAO.getAll().forEach(s -> {
            System.out.println(s.toString());
        });
    }

    public void search() {
        while (true) {
            System.out.println("Enter any similar character to search");
            courseDAO.search(input.next()).forEach(s -> {
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
        System.out.println("Search Course Records");
        while (true) {
            System.out.println("Enter Course ID to Search");
            Course course = courseDAO.getById(input.nextInt());
            if (course != null) {
                System.out.println(course.toString());
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

    public void course() {
        while (true) {
            menu3();            
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
                    System.out.println("You have toal number of" + " " + courseDAO.count() + " " + "courses");
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
