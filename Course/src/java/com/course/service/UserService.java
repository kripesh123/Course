/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.UserDAO;
import com.course.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UserService {

    @Autowired
    private UserDAO udao;

    public int insert(User user) {
        return udao.insert(user);
    }

    public int update(User user) {
        return udao.update(user);
    }

    public int delete(int id) {
        return udao.delete(id);
    }

    public List<User> getAll() {
        return udao.getAll();
    }

    public User getById(int id) {
        return udao.getById(id);
    }

    public User authenticate(String username, String password){
        return udao.authenticate(username, password);
    }

}
