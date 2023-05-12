package lessons5.part1OOP;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee("Vanya","Skalyga", "Student",
            "vanya729@ukr.net", "0971081939",18);

       String name= employee.getFirstName();
       String secondName= employee.getSecondName();
       String position = employee.getPosition();
       String mail= employee.getMail();
       String number = employee.getNumber();
       int age = employee.getAge();

        System.out.print(name+"\n"+secondName+"\n"+position+"\n"+mail+"\n"+number+"\n"+age+"\n");

        System.out.println("\nFor example,i can switch data: ");
        employee.setFirstName("OLEG");
        System.out.println("New name: "+employee.getFirstName());


        System.out.println("--------------------");
        System.out.println("\nStart car: ");
        Car car = new Car();
        car.start();

        System.out.println("--------------------");
        SameName sn = new SameName();
        sn.printMassege();
        lessons5.part1OOP.SameName1.SameName sameName =new lessons5.part1OOP.SameName1.SameName();
        sameName.printMassege();

    }
}
