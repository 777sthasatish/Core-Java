/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.view;

import com.ManagementSystem.dao.TrainerDAO;
import com.ManagementSystem.entity.Trainers;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class TrainerView {

    private Scanner input;
    private TrainerDAO trainerDAO;

    public TrainerView(TrainerDAO trainerDAO, Scanner input) {
        this.trainerDAO = trainerDAO;
        this.input = input;

    }

    public static void menu2() {
        System.out.println("***************************");
        System.out.println("Trainer");
        System.out.println("***************************");
        System.out.println("1. Add Trainer");
        System.out.println("2. Delete Trainer");
        System.out.println("3. Search by ID");
        System.out.println("4. Show All Trainers");
        System.out.println("5. Search");
        System.out.println("6. Count");
        System.out.println("7. Back");
        System.out.println("Enter your choice[1-7]:");
    }

    public void add() {
        while (true) {
            Trainers trainers = new Trainers();
            System.out.println("Add Trainers");
            System.out.println("Enter ID");
            trainers.setId(input.nextInt());
            System.out.println("Enter First Name");
            trainers.setFirstName(input.next());
            System.out.println("Enter Last Name");
            trainers.setLastName(input.next());
            System.out.println("Enter Address");
            trainers.setAddress(input.next());
            System.out.println("Enter Email Address");
            trainers.setEmail(input.next());
            System.out.println("Enter Contact Number");
            trainers.setContactNo(input.next());
            trainerDAO.insert(trainers);
            System.out.println("Do you want to go add more?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void delete() {
        System.out.println("Delete Trainer Record");
        boolean more = true;
        while (true) {
            System.out.println("Enter Trainer ID to Delete");
            if (trainerDAO.delete(input.nextInt())) {
                System.out.println("Trainer's Record Deleted Successfully");
            } else {
                System.out.println("Record not found");
            }
            System.out.println("Do you want to delete more?[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                more = false;
                break;
            } else {
                more = true;
                continue;
            }
        }
    }

    public void searchByID() {
        System.out.println("Search Trainer By ID");
        while (true) {
            System.out.println("Enter Trainer ID to Search");
            Trainers trainers = trainerDAO.getById(input.nextInt());
            if (trainers != null) {
                System.out.println(trainers.toString());
            } else {
                System.out.println("Record not found");
            }
            System.out.println("Do you want to search more?[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {

                break;
            } else {

                continue;
            }
        }
    }

    public void showAll() {
        trainerDAO.getAll().forEach(s -> {
            System.out.println(s.toString());
        });
    }

    public void search() {
        while (true) {
            System.out.println("Enter any similar character to search");
            trainerDAO.search(input.next()).forEach(s -> {
                System.out.println(s.toString());
            });
            System.out.println("Do you want to search more?[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {

                break;
            } else {

                continue;
            }

        }
    }

    public void trainer() {
        while (true) {
            menu2();
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
                    System.out.println("You have total number of" + " " + trainerDAO.count() + " " + "trainers");
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
