/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.dao.impl;

import com.course.constants.SQLCommand;
import com.course.dao.CourseDAO;
import com.course.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class CourseDAOImpl implements CourseDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public CourseDAOImpl(){
        
    }
    
    @Override
    public int insert(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> getAll() {
        return jdbcTemplate.query(SQLCommand.COURSE_GETALL, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course course = new Course();
                course.setCourseId(rs.getInt("course_id"));
                course.setCourseName(rs.getString("course_name"));
                course.setCourseDescription(rs.getString("course_description"));
                course.setCourseDuration(rs.getInt("course_duration"));
                course.setCourseDurationType(rs.getString("course_duration_type"));
                course.setCourseFee(rs.getFloat("course_fee"));
                course.setCourseStatus(rs.getBoolean("course_status"));
                return course;
            }
        });
    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
