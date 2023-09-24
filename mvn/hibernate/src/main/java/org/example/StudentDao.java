package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao implements StudentService {
    private final SessionFactory sessionFactory;

    public StudentDao() {
        sessionFactory = HibernateSession.getSessionFactory();
    }

    @Override
    public Long create(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Long idLong = (Long) session.save(student);
            session.getTransaction().commit();
            return idLong;
        }
    }

    @Override
    public void delete(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public Student update(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public List<Student> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Student> query = session.createQuery("from Student", Student.class);
            return query.list();
        }
    }

    @Override
    public Student get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, id);
        }
    }
}
