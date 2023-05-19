package lessons6;

import java.util.Arrays;

public class SubscriberServiceImpl implements SubscriberService{

    //a) відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий
    @Override
    public void timeForInternalConversations(int duration) {
        Subscriber[] subscribers = ArrayGenerate.generateArraySub();
        for (Subscriber sub : subscribers){
            if (sub.getInterCityCallDurationMin()>duration){
                System.out.println(sub);
            }
        }
    }

   // b) відомості про абонентів, які користувалися міжміським зв'язком;
    @Override
    public void usedCityCallDuration() {
        Subscriber[] subscribers = ArrayGenerate.generateArraySub();
        for (Subscriber sub : subscribers) {
            if (sub.cityCallDuration>0) {
                System.out.println(sub);
            }
        }
    }

    //c) відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр.
    @Override
    public void getInfoFirstLetterOfTheLastName(String lastName) {
        Subscriber[] subscribers = ArrayGenerate.generateArraySub();
        for (Subscriber sub : subscribers) {
            String[] subClassLastName = sub.lastName.trim().split(" ");
            String firstLetterSubClass = subClassLastName[0].substring(0, 1);

            String[] thisClassLastName = lastName.trim().split(" ");
            String firstLetterThisClass = thisClassLastName[0].substring(0, 1);

            if (firstLetterSubClass.equals(firstLetterThisClass)) {
                System.out.println(sub);
            }
        }
    }



    //d) сумарне споживання трафіку інтернету для певного міста
    @Override
    public void totalConsumptionOfInternetTraffic(String city) {
        int sum=0;
        Subscriber[] subscribers = ArrayGenerate.generateArraySub();
        for (Subscriber sub: subscribers) {
            if (city.equals(sub.city)) {
                sum+=sub.internetTrafficMin;
            }
        }
        System.out.println("Sum internet traffic for " + city + " " + sum);
    }

    //e) кількість абонентів з негативним балансом
    @Override
    public void subscribersWithANegativeBalance() {
        Subscriber[] subscribers = ArrayGenerate.generateArraySub();
        for (Subscriber sub : subscribers){
            if (sub.balance<0){
                System.out.println(sub);
            }
        }
    }
}
