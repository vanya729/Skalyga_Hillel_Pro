package lessons6;

public class Subscriber {
    int id;
    String lastName;
    String firstName;
    String city;
    String phoneNumber;
    String сontractNumber;
    int balance;
    int cityCallDuration;
    int interCityCallDurationMin;
    int internetTrafficMin;

    public Subscriber(int id, String lastName, String firstName, String city, String phoneNumber, String conatctNumber, int balance, int cityCallDuration, int interCityCallDurationMin, int iternetTrafficMin) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.сontractNumber = conatctNumber;
        this.balance = balance;
        this.cityCallDuration = cityCallDuration;
        this.interCityCallDurationMin = interCityCallDurationMin;
        this.internetTrafficMin = iternetTrafficMin;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getСontractNumber() {
        return сontractNumber;
    }

    public void setСontractNumber(String сontractNumber) {
        this.сontractNumber = сontractNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCityCallDuration() {
        return cityCallDuration;
    }

    public void setCityCallDuration(int cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public int getInterCityCallDurationMin() {
        return interCityCallDurationMin;
    }

    public void setInterCityCallDurationMin(int interCityCallDurationMin) {
        this.interCityCallDurationMin = interCityCallDurationMin;
    }

    public int getInternetTrafficMin() {
        return internetTrafficMin;
    }

    public void setInternetTrafficMin(int internetTrafficMin) {
        this.internetTrafficMin = internetTrafficMin;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", conatctNumber='" + сontractNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDuration=" + cityCallDuration +
                ", interCityCallDurationMin=" + interCityCallDurationMin +
                ", iternetTrafficMin=" + internetTrafficMin +
                '}';
    }

}
