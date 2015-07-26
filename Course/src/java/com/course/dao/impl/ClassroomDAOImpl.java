/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.dao.impl;

import com.course.constants.SQLCommand;
import com.course.dao.ClassroomDAO;
import com.course.entity.Classroom;
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
public class ClassroomDAOImpl implements ClassroomDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public ClassroomDAOImpl(){
        
    }
    
    @Override
    public int insert(Classroom t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Classroom t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classroom> getAll() {
        return jdbcTemplate.query(SQLCommand.CLASSROOM_GETALL, new RowMapper<Classroom>() {

            @Override
            public Classroom  mapRow(ResultSet rs, int i) throws SQLException {
                Classroom classroom = new Classroom();
                classroom.setClassroomId(rs.getInt("classroom_id"));
                classroom.setClassroomName(rs.getString("classroom_name"));
                return classroom;
            }
        });
    }

    @Override
    public Classroom getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
