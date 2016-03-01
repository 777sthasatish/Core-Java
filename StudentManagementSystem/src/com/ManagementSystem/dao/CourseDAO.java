/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ManagementSystem.dao;

import com.ManagementSystem.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author Satish
 */
public interface CourseDAO {
    void insert(Course course);
    Course getById(int id);
    boolean delete(int id);
    ArrayList<Course> getAll();
    ArrayList<Course> search(String param);
    int count();
}
