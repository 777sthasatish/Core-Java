/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.impl;

import com.ManagementSystem.dao.CourseDAO;
import com.ManagementSystem.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author Satish
 */
public class CourseDAOImpl implements CourseDAO {

    ArrayList<Course> courseList;

    public CourseDAOImpl() {
        courseList = new ArrayList<>();
    }

    @Override
    public void insert(Course course) {
        courseList.add(course);
    }

    @Override
    public Course getById(int id) {
        for (Course course : courseList) {
            if (course.getId() == id) {
                return course;
            }

        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        boolean hasDelete = false;
        for (Course course : courseList) {
            if (course.getId() == id) {
                courseList.remove(course);
                hasDelete = true;
                break;
            }
        }
        return hasDelete;
    }

    @Override
    public ArrayList<Course> getAll() {
        return courseList;
    }

    @Override
    public ArrayList<Course> search(String param) {
        ArrayList<Course> courses = new ArrayList<>();
        for (Course course : courseList) {
            String name = course.getName().toLowerCase();
            param = param.toLowerCase();
            if (name.contains(param)) {
                courses.add(course);
            }
        }
        return courses;
    }

    @Override
    public int count() {
       return courseList.size();
    }

}
