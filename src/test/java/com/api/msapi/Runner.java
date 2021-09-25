package com.api.msapi;

import com.api.msapi.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Runner {
    @Test
    public void crud() {
        /**First off, you create a session and then open it**/
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        create(session);
        read(session);

        update(session);
        read(session);

        delete(session);
        read(session);

        session.close();
    }

    private void delete(Session session) {
        System.out.println("Deleting Record....");
        User subscriber = (User) session.get(User.class, "Kavish");

        session.beginTransaction();
        session.delete(subscriber);
        session.getTransaction().commit();
    }

    private void update(Session session) {
        System.out.println("Updating City...");
        User john = session.get(User.class, "John");
        john.setCity("Mumbai");

        session.beginTransaction();
        session.update(john);
        session.getTransaction().commit();

    }

    private void read(Session session) {
        Query query = session.createQuery("select from Users");
        List users = query.list();
    }

    private void create(Session session) {
        System.out.println("Adding new User...");
        User john = new User();
        john.setFirstName("John");
        john.setLastName("Varghese");
        john.setAddress("Pali Hills");
        john.setCity("Bombay");

        User jakob = new User();
        jakob.setFirstName("Jakob");
        jakob.setLastName("Swedish");
        jakob.setAddress("New Bhopal Road");
        jakob.setCity("Bhopal");

        session.beginTransaction();
        session.save(john);
        session.save(jakob);
        session.getTransaction().commit();

    }
}
