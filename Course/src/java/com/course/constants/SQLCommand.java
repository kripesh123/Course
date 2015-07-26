/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.constants;

/**
 *
 * @author Admin
 */
public class SQLCommand {

    //Classroom
    public static final String CLASSROOM_INSERT = "INSERT INTO " + Table.TABLE_CLASSROOM + " (classroom_name) VALUES(?)";
    public static final String CLASSROOM_UPDATE = "UPDATE " + Table.TABLE_CLASSROOM + " SET classroom_name=? WHERE classroom_id=?";
    public static final String CLASSROOM_DELETE = "UPDATE " + Table.TABLE_CLASSROOM + " SET delete_flag=1 WHERE classroom_id=?";
    public static final String CLASSROOM_GETALL = "SELECT * FROM " + Table.TABLE_CLASSROOM + " WHERE delete_flag=0";
    public static final String CLASSROOM_GETBYID = "SELECT * FROM " + Table.TABLE_CLASSROOM + " WHERE classroom_id=?";

    //Course
    public static final String COURSE_INSERT = "INSERT INTO " + Table.TABLE_COURSE + " (course_name,course_description,course_fee,course_duration,course_duration_type,course_status) VALUES(?,?,?,?,?,?)";
    public static final String COURSE_UPDATE = "UPDATE " + Table.TABLE_COURSE + " SET course_name=?,course_description=?,course_fee=?,course_duration=?,course_duration_type=?,course_status=? WHERE course_id=?";
    public static final String COURSE_DELETE = "UPDATE " + Table.TABLE_COURSE + " SET delete_flag=1 WHERE course_id=?";
    public static final String COURSE_GETALL = "SELECT * FROM " + Table.TABLE_COURSE + " WHERE delete_flag=0";
    public static final String COURSE_GETBYID = "SELECT * FROM " + Table.TABLE_COURSE + " WHERE course_id=?";

    //Facilitator
    public static final String FACILITATOR_INSERT = "INSERT INTO " + Table.TABLE_FACILITATOR + " (first_name,last_name,email,contact_no,status) VALUES(?,?,?,?,?)";
    public static final String FACILITATOR_UPDATE = "UPDATE " + Table.TABLE_FACILITATOR + " SET first_name=?,last_name=?,email=?,contact_no=?,status=? WHERE facilitator_id=?";
    public static final String FACILITATOR_DELETE = "UPDATE " + Table.TABLE_FACILITATOR + " SET delete_flag=1 WHERE facilitator_id=?";
    public static final String FACILITATOR_GETALL = "SELECT * FROM " + Table.TABLE_FACILITATOR + " WHERE delete_flag=0";
    public static final String FACILITATOR_GETBYID = "SELECT * FROM " + Table.TABLE_FACILITATOR + " WHERE facilitator_id=?";

    //Session Hour
    public static final String SESSIONHOUR_INSERT = "INSERT INTO " + Table.TABLE_SESSION_HOUR + " (session_hour) VALUES(?)";
    public static final String SESSIONHOUR_UPDATE = "UPDATE " + Table.TABLE_SESSION_HOUR + " SET session_hour=? WHERE session_hour_id=?";
    public static final String SESSIONHOUR_DELETE = "UPDATE " + Table.TABLE_SESSION_HOUR + " SET delete_flag=1 WHERE session_hour_id=?";
    public static final String SESSIONHOUR_GETALL = "SELECT * FROM " + Table.TABLE_SESSION_HOUR + " WHERE delete_flag=0";
    public static final String SESSIONHOUR_GETBYID = "SELECT * FROM " + Table.TABLE_SESSION_HOUR + " WHERE session_hour_id=?";

    //Session
    public static final String SESSION_INSERT = "INSERT INTO " + Table.TABLE_SESSION + " (session_code,course_id,facilitator_id,start_date,end_date,session_hour_id,classroom_id) VALUES(?,?,?,?,?,?,?)";
    public static final String SESSION_UPDATE = "UPDATE " + Table.TABLE_SESSION + " SET session_code=?,course_id=?,facilitator_id=?,start_date=?,end_date=?,session_hour_id=?,classroom_id=? WHERE session_id=?";
    public static final String SESSION_DELETE = "UPDATE " + Table.TABLE_SESSION + " SET delete_flag=1 WHERE session_id=?";
    public static final String SESSION_GETALL = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE delete_flag=0";
    public static final String SESSION_GETBYID = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE session_id=?";
    public static final String SESSION_GETBYCOUSEID = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE course_id=?";
    public static final String SESSION_GETBYFACILITATORID = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE facilitator_id=?";
    public static final String SESSION_GETBYSESSIONHOURID = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE session_hour_id=?";
    public static final String SESSION_GETBYCLASSROOMID = "SELECT * FROM " + Table.TABLE_SESSION + " WHERE classroom_id=?";

    //Session Student 
    public static final String SESSIONSTUDENT_INSERT = "INSERT INTO " + Table.TABLE_SESSION_STUDENT + " (session_id,student_id,session_student_status) VALUES(?,?,?)";
    public static final String SESSIONSTUDENT_UPDATE = "UPDATE " + Table.TABLE_SESSION_STUDENT + " SET session_id=?,student_id=?,session_student_status=? WHERE session_student_id=?";
    public static final String SESSIONSTUDENT_DELETE = "UPDATE " + Table.TABLE_SESSION_STUDENT + " SET delete_flag=1 WHERE session_student_id=?";
    public static final String SESSIONSTUDENT_GETALL = "SELECT * FROM " + Table.TABLE_SESSION_STUDENT + " WHERE delete_flag=0";
    public static final String SESSIONSTUDENT_GETBYID = "SELECT * FROM " + Table.TABLE_SESSION_STUDENT + " WHERE session_student_id=?";
    public static final String SESSIONSTUDENT_GETBYSTUDENTID = "SELECT * FROM " + Table.TABLE_SESSION_STUDENT + " WHERE student_id=?";
    public static final String SESSIONSTUDENT_GETBYSESSIONID = "SELECT * FROM " + Table.TABLE_SESSION_STUDENT + " WHERE session_id=?";

    //Student
    public static final String STUDENT_INSERT = "INSERT INTO " + Table.TABLE_STUDENT + " (first_name,last_name,email,contact,join_date,status) VALUES(?,?,?,?,?,?)";
    public static final String STUDENT_UPDATE = "UPDATE " + Table.TABLE_STUDENT + " SET first_name=?,last_name=?,email=?,contact=?,status=? WHERE student_id=?";
    public static final String STUDENT_DELETE = "UPDATE " + Table.TABLE_STUDENT + " SET delete_flag=1 WHERE student_id=?";
    public static final String STUDENT_GETALL = "SELECT * FROM " + Table.TABLE_STUDENT + " WHERE delete_flag=0";
    public static final String STUDENT_GETBYID = "SELECT * FROM " + Table.TABLE_STUDENT + " WHERE student_id=?";

    //User
    public static final String USER_INSERT = "INSERT INTO " + Table.TABLE_USER + " (username,password) VALUES(?,?)";
    public static final String USER_UPDATE = "UPDATE " + Table.TABLE_USER + " SET username=?,password=? WHERE user_id=?";
    public static final String USER_DELETE = "UPDATE " + Table.TABLE_USER + " SET delete_flag=1 WHERE user_id=?";
    public static final String USER_GETALL = "SELECT * FROM " + Table.TABLE_USER + " WHERE delete_flag=0";
    public static final String USER_GETBYID = "SELECT * FROM " + Table.TABLE_USER + " WHERE user_id=?";
    public static final String USER_AUTHENTICATE = "SELECT * FROM "+Table.TABLE_USER+" WHERE username=? AND password=? AND delete_flag=?";

}
