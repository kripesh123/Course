/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.SessionStudentDAO;
import com.course.entity.SessionStudent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class SessionStudentService {
    @Autowired
    private SessionStudentDAO ssdao;
    
     public int insert(SessionStudent sessionStudent) {
        return ssdao.insert(sessionStudent);
    }

    public int update(SessionStudent sessionStudent) {
        return ssdao.update(sessionStudent);
    }

    public int delete(int id) {
        return ssdao.delete(id);
    }

    public List<SessionStudent> getAll() {
        return ssdao.getAll();
    }

    public SessionStudent getById(int id) {
        return ssdao.getById(id);
    }
    
    public SessionStudent getBySessionId(int sessionId){
        return ssdao.getBySessionId(sessionId);
    }
    
    public SessionStudent getByStudentId(int studentId){
        return ssdao.getByStudentId(studentId);
    }
}
