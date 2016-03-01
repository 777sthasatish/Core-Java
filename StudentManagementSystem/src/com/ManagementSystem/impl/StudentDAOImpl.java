/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.impl;

import com.ManagementSystem.dao.StudentDAO;
import com.ManagementSystem.entity.Students;
import java.util.ArrayList;

/**
 *
 * @author Satish
 */
public class StudentDAOImpl implements StudentDAO {

    ArrayList<Students> studentList;

    public StudentDAOImpl() {
        studentList = new ArrayList<>();
    }

    @Override
    public void insert(Students students) {
        studentList.add(students);

    }

    @Override
    public Students getById(int id) {
        for (Students students : studentList) {
            if (students.getId() == id) {
                return students;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        boolean hasDelete = false;
        for (Students students : studentList) {

            if (students.getId() == id) {
                studentList.remove(students);
                hasDelete = true;
                break;
            }
        }
            return hasDelete;
    }

    @Override
    public ArrayList<Students> getAll() {
        return studentList;
    }

    @Override
    public ArrayList<Students> search(String param) {
        ArrayList<Students> student = new ArrayList<>();
        for (Students students : studentList) {
            String fName = students.getFirstName().toLowerCase();
            String lName = students.getLastName().toLowerCase();
            String pNo = students.getContactNo().toLowerCase();
            String eml = students.getEmail().toLowerCase();
            param = param.toLowerCase();
            if (fName.contains(param) || lName.contains(param) || pNo.contains(param) || eml.contains(param)) {
                student.add(students);
            }
        }
        return student;
    }
    

    @Override
    public int count() {
        return studentList.size();
    }


}
