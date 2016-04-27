/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.master.roleup.dao.impls;

import com.master.roleup.dao.interfaces.UserDao;
import com.master.roleup.model.TUsers;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public TUsers findByUserName(String username) {
        List<TUsers> users = new ArrayList<TUsers>();

        users = getSessionFactory().getCurrentSession()
                .createQuery("from TUsers where vlogin=?")
                .setParameter(0, username).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
