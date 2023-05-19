package lessons6;

public class ArrayGenerate {

    public static Subscriber[] generateArraySub(){

        Subscriber[] array = new Subscriber[10];

        array[0] = new Subscriber(1234, "Skalyga","Ivan",
                "Odesa", "0971081939","097",
                27,350,100,10000);

        array[1] = new Subscriber(2345, "Pypkin","Vasya",
                "Kiev", "0981231230","098",
                57,297,37,4700);

        array[2] = new Subscriber(3456, "Plyshkin","Misha",
                "Dnipro", "0683211203","068",
                150,400,600,25000);

        array[3] = new Subscriber(4567, "Kovalev","Slavik",
                "Cherkasy", "0967894560","096",
                -47,0,250,6000);

        array[4] = new Subscriber(5678, "Kravchyk","Olena",
                "Lviv", "0971455419","097",
                30,0,237,3500);

        array[5] = new Subscriber(6789, "Chervona","Nadia",
                "Chernigov", "0683217895","068",
                14,0,105,3400);
        array[6] = new Subscriber(7890, "Petrenko","Ivan",
                "Kiev", "0509876543","050",
                42,205,405,4200);

        array[7] = new Subscriber(8901, "Kovalenko","Maria",
                "Odesa", "0634567890","063",
                25,0,175,3800);

        array[8] = new Subscriber(9012, "Voloshyna","Anna",
                "Kharkiv", "0991234567","099",
                18,0,152,3200);

        array[9] = new Subscriber(1234, "Tkachenko","Olga",
                "Zaporizhia", "0976543210","097",
                -5,124,215,3700);



        return array;
    }

}
