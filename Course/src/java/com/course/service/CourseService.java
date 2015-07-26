/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.CourseDAO;
import com.course.entity.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CourseService {

    @Autowired
    private CourseDAO codao;

    public int insert(Course course) {
        return codao.insert(course);
    }

    public int update(Course course) {
        return codao.update(course);
    }

    public int delete(int id) {
        return codao.delete(id);
    }

    public List<Course> getAll() {
        return codao.getAll();
    }

    public Course getById(int id) {
        return codao.getById(id);
    }
}
