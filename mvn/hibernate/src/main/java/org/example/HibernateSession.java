package org.example;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession implements AutoCloseable {
    @Getter
    private static final SessionFactory sessionFactory = createSessionFactory();

    @Override
    public void close() {
        getSessionFactory().close();
    }

    private static SessionFactory createSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

}