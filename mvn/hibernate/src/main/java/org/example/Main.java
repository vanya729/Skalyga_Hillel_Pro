package org.example;

public class Main {
    public static void main(String[] args) {
        StudentService student = new StudentDao();
        Student student1 = new Student("vanya", "Vanya@ukr.net");
        Student student2 = new Student("Petya", "Petya@mail.com");
        Student student3 = new Student("Dima", "Dima@mail.com");
        Student student4 = new Student("Oleg", "Oleg@mail.com");


        student.create(student1);
        student.create(student2);
        student.create(student3);
        student.create(student4);

        student.getAll().forEach(System.out::println);

        student2.setName("Vanya");
        student2.setEmail("testEmail@Email.com");

        System.out.println(student.update(student2));

        student.get(1L);

        student.delete(student4);
    }

}