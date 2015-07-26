/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.StudentDAO;
import com.course.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StudentService {
    @Autowired
    private StudentDAO studao;
    
     public int insert(Student student) {
        return studao.insert(student);
    }

    public int update(Student student) {
        return studao.update(student);
    }

    public int delete(int id) {
        return studao.delete(id);
    }

    public List<Student> getAll() {
        return studao.getAll();
    }

    public Student getById(int id) {
        return studao.getById(id);
    }
}
