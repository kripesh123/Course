/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.dao;

import com.course.entity.User;

/**
 *
 * @author Admin
 */
public interface UserDAO extends GenericDAO<User>{
    
     public User authenticate(String username,String password);
    
}
