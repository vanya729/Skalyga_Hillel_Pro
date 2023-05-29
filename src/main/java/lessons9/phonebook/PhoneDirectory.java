package lessons9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    private List<Record> recordList;

    public PhoneDirectory() {
        recordList = new ArrayList<>();
    }

    public void add(Record record){
       recordList.add(record);
   }

    public Record find(String name) {
        for (Record record : recordList) {
            if (record.getName().equals(name)) {
                System.out.print(name + " " + record.getPhones());
                String phone2 = record.getPhones1();
                if (phone2 != null) {
                    System.out.print(" " + phone2);
                }
                System.out.println();
                return record;
            }
        }
        return null;
    }


    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : recordList) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
                System.out.print(name + " " + record.getPhones());

                String phone2 = record.getPhones1();
                if (phone2 != null) {
                    System.out.print(" "+phone2);
                }

                System.out.println();
            }
        }
        return foundRecords;
    }




}
/*
8. * У класі Телефонний Довідник реалізувати метод findAll().
 Метод здійснює пошук записів на ім'я. Якщо записи знайдені, тоді їх необхідно повернути,
інакше повертається null.
Така реалізація викликана тим, що під одним прізвищем може
зберігатися кілька телефонів і при запиті по конкретному імені необхідно
повертати всі записи, що є в наявності.
 */