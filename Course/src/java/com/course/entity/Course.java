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
public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private float courseFee;
    private int courseDuration;
    private String courseDurationType;
    private Boolean courseStatus;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseDescription, float courseFee, int courseDuration, String courseDurationType, Boolean courseStatus) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
        this.courseDurationType = courseDurationType;
        this.courseStatus = courseStatus;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public float getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(float courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseDurationType() {
        return courseDurationType;
    }

    public void setCourseDurationType(String courseDurationType) {
        this.courseDurationType = courseDurationType;
    }

    public Boolean getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Boolean courseStatus) {
        this.courseStatus = courseStatus;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", courseDescription=" + courseDescription + ", courseFee=" + courseFee + ", courseDuration=" + courseDuration + ", courseDurationType=" + courseDurationType + ", courseStatus=" + courseStatus + '}';
    }
    
    
}
