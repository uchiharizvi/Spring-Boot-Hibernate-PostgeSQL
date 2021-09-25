package com.api.msapi.dao;

import com.api.msapi.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PerformOperation implements Operations {

    @Override
    public List<Users> getUsers() throws Exception {
        /**Create a session and then open it**/
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //HQL
        Query query = session.createQuery("from Users ");
        List<Users> usersList = query.list();

        System.out.println("Reading User Records...");

        sessionFactory.close();
        return usersList;
    }

    @Override
    public List<Users> getUserDetail(Integer userId) throws Exception {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Users user = new Users();
        System.out.println("Reading User Records...");
        //HQL
        Query query = session.createQuery("from Users where userId =" + userId);
        List<Users> usersList = query.list();
        sessionFactory.close();
        return usersList;
    }
}
