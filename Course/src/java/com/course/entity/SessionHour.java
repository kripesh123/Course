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
public class SessionHour {
    private int sessionHourId;
    private Date sessionHour;

    public SessionHour() {
    }

    public SessionHour(int sessionHourId, Date sessionHour) {
        this.sessionHourId = sessionHourId;
        this.sessionHour = sessionHour;
    }

    public int getSessionHourId() {
        return sessionHourId;
    }

    public void setSessionHourId(int sessionHourId) {
        this.sessionHourId = sessionHourId;
    }

    public Date getSessionHour() {
        return sessionHour;
    }

    public void setSessionHour(Date sessionHour) {
        this.sessionHour = sessionHour;
    }

    @Override
    public String toString() {
        return "SessionHour{" + "sessionHourId=" + sessionHourId + ", sessionHour=" + sessionHour + '}';
    }
    
    
}
