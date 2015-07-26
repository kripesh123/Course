/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.SessionDAO;
import com.course.entity.Session;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class SessionService {
    @Autowired
    private SessionDAO sdao;
    
    public int insert(Session session) {
        return sdao.insert(session);
    }

    public int update(Session session) {
        return sdao.update(session);
    }

    public int delete(int id) {
        return sdao.delete(id);
    }

    public List<Session> getAll() {
        return sdao.getAll();
    }

    public Session getById(int id) {
        return sdao.getById(id);
    }
    
    public Session getByCourseId(int courseId){
        return sdao.getByCourseId(courseId);
    }
    
    public Session getByFacilitatorId(int facilitatorId){
        return sdao.getByFacilitatorId(facilitatorId);
    }
    
    public Session getByClassroomId(int classroomId){
        return sdao.getByClassroomId(classroomId);
    }
    
    public Session getBySessionHourId(int sessionHourId){
        return sdao.getBySessionHourId(sessionHourId);
    }
}
