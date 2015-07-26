/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.dao;

import com.course.entity.Session;

/**
 *
 * @author Admin
 */
public interface SessionDAO extends GenericDAO<Session>{
    
    public Session getByCourseId(int courseId);
    public Session getByFacilitatorId(int facilitatorId);
    public Session getByClassroomId(int classroomId);
    public Session getBySessionHourId(int sessionHourId);
    
}
