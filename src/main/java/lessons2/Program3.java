package lessons2;

public class Program3  {
    public static void main(String[] args) {

        if (args.length!=3){
            System.out.println("Input three arguments (investment amount, percentage, number of years)");
        }

        double amountOfMoney = Integer.parseInt(args[0]);  //1000grn
        double interest = Integer.parseInt(args[1]);        //10%
        int years = Integer.parseInt(args[2]);              //5years
        double param=0;

        double interestByProcent =interest/100;

     //   double interestOnYear = (amountOfMoney*interest)/years;
        for (int i = 1; i <= years; i++) {
            param =amountOfMoney+amountOfMoney*interestByProcent;  //1000*10%=11
            amountOfMoney=param;                                   //amountOfMoney = 1100

          System.out.println( " Cash deposit="+param+" Percent:"+interest+"%" +" Years: "+i);
            System.out.println("-----------------------------------------------------------");
        }

    }
}
/*
3. Програму, яка пропонує користувачеві запровадити суму грошового вкладу у гривнях,
відсоток річних, які виплачує банк, тривалість вкладу (років). Вивести накопичену суму
 грошей за кожен рік та нараховані відсотки. (Відсотки складні з капіталізацією щомісяця)
У завданні 3 числа вводити через аргументи програми

приклад
java DepositCalculator <сума> <відсоток> <тривалість_у_роках>

1) перевірити наявність аргумента    +
2) Отримувати аргументів з командного рядка     +
4)Обчислення процентної ставки на рік           +
5)Обчислення суми грошового вкладу та нарахованих відсотків за кожний рік

1000 10% 1years =1100
1100 10% 2years = 1210
1210 10% 3years = 1331


 */