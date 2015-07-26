/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.dao;

import com.course.entity.SessionStudent;

/**
 *
 * @author Admin
 */
public interface SessionStudentDAO extends GenericDAO<SessionStudent>{
    
    public SessionStudent getBySessionId(int sessionId);
    public SessionStudent getByStudentId(int sudentId);
}
