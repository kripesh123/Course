/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.ClassroomDAO;
import com.course.entity.Classroom;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ClassroomService {
    @Autowired
    private ClassroomDAO cdao;
    
    public int insert(Classroom classroom){
        return cdao.insert(classroom);
    }
    public int update(Classroom classroom){
        return cdao.update(classroom);
    }
    public int delete(int id){
        return cdao.delete(id);
    }
    public List<Classroom>getAll(){
        return cdao.getAll();
    }
    public Classroom getById(int id){
        return cdao.getById(id);
    }
}
