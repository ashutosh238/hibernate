/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.DaoImpl;

import com.ozonetel.calitereports.Dao.UserDao;
import com.ozonetel.calitereports.model.User;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharma
 */
@Repository("userDAO")
@Transactional
public class UserDaoImpl implements UserDao {
@Autowired
SessionFactory sessionFactory;
    @Override
    public List<User> getUser() {
        return sessionFactory.getCurrentSession().createQuery("from CPUSERS").list();
    }

    @Override
    public User getUserById(Long id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }
    
}
