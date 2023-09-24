package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class StudentDaoTest {
    private static SessionFactory sessionFactory;

    @BeforeClass
    public static void setUp() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @AfterClass
    public static void tearDown() {
        sessionFactory.close();
    }

    private void createTestStudents() {
        System.out.println("Test: create Student");
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student1 = new Student("vanya", "Vanya@ukr.net");
            Student student2 = new Student("Petya", "Petya@mail.com");
            Student student3 = new Student("Dima", "Dima@mail.com");
            Student student4 = new Student("Oleg", "Oleg@mail.com");
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.save(student4);
            session.getTransaction().commit();
        }
    }

    @Test
    public void deleteTest() {
        createTestStudents();
        System.out.println("Test: delete Student");
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Long testId = 3L;
            Student student = session.get(Student.class, testId);
            session.delete(student);
            session.getTransaction().commit();
        }

        try (Session session = sessionFactory.openSession()) {
            Long testId = 3L;
            Student student1 = session.get(Student.class, testId);
            assertNull(student1);
        }
    }

    @Test
    public void updateTest() {
        createTestStudents();
        System.out.println("Test: update Student");
        Long testId = 2L;

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, testId);
            student.setName("Vanya");
            student.setEmail("vanya@email");
            session.update(student);
            session.getTransaction().commit();
        }

        try (Session session = sessionFactory.openSession()) {
            Student student1 = session.get(Student.class, testId);
            assertNotNull(student1);
            assertEquals("Vanya", student1.getName());
            assertEquals("vanya@email", student1.getEmail());
        }
    }

    @Test
    public void getAllTest() {
        createTestStudents();
        System.out.println("Test: get all Student");
        try (Session session = sessionFactory.openSession()) {
            List<Student> studentList = session.createQuery("from Student", Student.class).list();
            System.out.println("List<Student> not null, size = " + studentList.size());
            assertNotEquals(0, studentList.size());
        }
    }

    @Test
    public void getTest() {
        createTestStudents();
        System.out.println("Test: get Student by id");
        Long id = 2L;

        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, id);
            System.out.println("Record from DB is " + student);
            assertEquals(id, student.getId());
        }
    }
}
