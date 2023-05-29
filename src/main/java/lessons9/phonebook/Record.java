package lessons9.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Record {

    private String name;
    private String phones;
    private String phones1;

    public Record(String name, String phones, String phones1) {
        this.name = name;
        this.phones = phones;
        this.phones1 = phones1;
    }

    public String getPhones1() {
        return phones1;
    }

    public void setPhones1(String phones1) {
        this.phones1 = phones1;
    }

    public Record(String name, String phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
