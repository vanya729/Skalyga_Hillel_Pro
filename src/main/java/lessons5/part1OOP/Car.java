package lessons5.part1OOP;

public class Car {

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Electricity start");
    }
    private void startCommand(){
        System.out.println("Command start");
    }
    private void startFuelSystem(){
        System.out.println("Fuel system start");
    }
}
/*
5. Створити клас Car з публічним методом start. Метод start викликає у собі методи:
- startElectricity()
- startCommand()
- startFuelSystem()

  Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start.
  Вони по суті відображають внутрішню поведінку класу Car і не повинні використовуватися
   за межами даного класу.
 */
