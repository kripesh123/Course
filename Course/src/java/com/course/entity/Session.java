/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Session {
    private int sessionId;
    private String sessionCode;
    private int courseId;
    private int facilitatorId;
    private Date startDate;
    private Date endDate;
    private int sessionHourId;
    private int classroomId;

    public Session() {
    }

    public Session(int sessionId, String sessionCode, int courseId, int facilitatorId, Date startDate, Date endDate, int sessionHourId, int classroomId) {
        this.sessionId = sessionId;
        this.sessionCode = sessionCode;
        this.courseId = courseId;
        this.facilitatorId = facilitatorId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sessionHourId = sessionHourId;
        this.classroomId = classroomId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(int facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getSessionHourId() {
        return sessionHourId;
    }

    public void setSessionHourId(int sessionHourId) {
        this.sessionHourId = sessionHourId;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    @Override
    public String toString() {
        return "Session{" + "sessionId=" + sessionId + ", sessionCode=" + sessionCode + ", courseId=" + courseId + ", facilitatorId=" + facilitatorId + ", startDate=" + startDate + ", endDate=" + endDate + ", sessionHourId=" + sessionHourId + ", classroomId=" + classroomId + '}';
    }
    
    
}
