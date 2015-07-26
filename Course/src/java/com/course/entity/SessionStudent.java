/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.entity;

/**
 *
 * @author Admin
 */
public class SessionStudent {
    private int sessionStudentId;
    private int sessionId;
    private int studentId;
    private Boolean sessionStudentStatus;

    public SessionStudent() {
    }

    public SessionStudent(int sessionStudentId, int sessionId, int studentId, Boolean sessionStudentStatus) {
        this.sessionStudentId = sessionStudentId;
        this.sessionId = sessionId;
        this.studentId = studentId;
        this.sessionStudentStatus = sessionStudentStatus;
    }

    public int getSessionStudentId() {
        return sessionStudentId;
    }

    public void setSessionStudentId(int sessionStudentId) {
        this.sessionStudentId = sessionStudentId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Boolean getSessionStudentStatus() {
        return sessionStudentStatus;
    }

    public void setSessionStudentStatus(Boolean sessionStudentStatus) {
        this.sessionStudentStatus = sessionStudentStatus;
    }

    @Override
    public String toString() {
        return "SessionStudent{" + "sessionStudentId=" + sessionStudentId + ", sessionId=" + sessionId + ", studentId=" + studentId + ", sessionStudentStatus=" + sessionStudentStatus + '}';
    }
    
    
}
