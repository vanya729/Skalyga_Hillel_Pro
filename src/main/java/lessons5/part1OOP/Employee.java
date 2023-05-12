package lessons5.part1OOP;

public class Employee {
    //Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
    private String firstName, secondName, position, mail, number;
    private int age;

    public Employee(String firstName, String secondName, String position, String mail, String number, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.mail = mail;
        this.number = number;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
3. Конструктор класу повинен заповнювати ці поля під час створення об'єкта. Забезпечити інкапсуляцію внутрішніх властивостей класу.
4. Створити два класи з однаковим ім'ям SameName. (Використовувати пакети)
 */