/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.service;

import com.course.dao.FacilitatorDAO;
import com.course.entity.Facilitator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class FacilitatorService {

    @Autowired
    private FacilitatorDAO fdao;

    public int insert(Facilitator facilitator) {
        return fdao.insert(facilitator);
    }

    public int update(Facilitator facilitator) {
        return fdao.update(facilitator);
    }

    public int delete(int id) {
        return fdao.delete(id);
    }

    public List<Facilitator> getAll() {
        return fdao.getAll();
    }

    public Facilitator getById(int id) {
        return fdao.getById(id);
    }
}
