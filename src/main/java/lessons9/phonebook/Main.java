package lessons9.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        Record record1 = new Record("Vanya",  "123456789", "1484418412841");
        phoneDirectory.add(record1);


        Record record2 = new Record("Oleg","987654321");

        phoneDirectory.add(record2);

        Record record3 = new Record("Vanya", "456789123");
        phoneDirectory.add(record3);
        phoneDirectory.findAll("Vanya");

        phoneDirectory.find("Oleg");
    }
}
