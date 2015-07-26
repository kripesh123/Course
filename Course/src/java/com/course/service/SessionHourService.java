/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.SessionHourDAO;
import com.course.entity.SessionHour;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class SessionHourService {
    @Autowired
    private SessionHourDAO shdao;
    
     public int insert(SessionHour sessionHour) {
        return shdao.insert(sessionHour);
    }

    public int update(SessionHour sessionHour) {
        return shdao.update(sessionHour);
    }

    public int delete(int id) {
        return shdao.delete(id);
    }

    public List<SessionHour> getAll() {
        return shdao.getAll();
    }

    public SessionHour getById(int id) {
        return shdao.getById(id);
    }
}
