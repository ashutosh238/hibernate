/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.Dao;

import com.ozonetel.calitereports.model.User;
import java.util.List;

/**
 *
 * @author sharma
 */
public interface UserDao {
    public List<User> getUser();
    public User getUserById(Long id);
}
