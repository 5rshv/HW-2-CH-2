public class Main {
    public static void main(String[] args) {
        int dog = 175587;
        byte cat = 12;
        short capture = 123;
        long number = 1000000000;
        float number1 = 3.21F;
        System.out.println("Задача 1:");
        System.out.println("Значение переменной dog с типом int равно " +dog );
        System.out.println("Значение переменной cat с типом byte равно " +cat );
        System.out.println("Значение переменной capture с типом short равно " +capture );
        System.out.println("Значение переменной number с типом long равно " +number );
        System.out.println("Значение переменной number1 с типом float равно " +number1 );

        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        int f = -159;
        int g = 27897;
        int h = 67;
        System.out.println("");
        System.out.println("Задача 2:");
        System.out.println("Значение переменной a с типом double равно " +a );
        System.out.println("Значение переменной b с типом long равно " +b );
        System.out.println("Значение переменной c с типом double равно " +c );
        System.out.println("Значение переменной d с типом int равно " +d );
        System.out.println("Значение переменной f с типом int равно " +f );
        System.out.println("Значение переменной g с типом int равно " +g );
        System.out.println("Значение переменной h с типом int равно " +h);

        int lp = 23;
        int as = 27;
        int ea = 30;
        int paper = 480;
        int resault = paper/(lp+as+ea);
        System.out.println("");
        System.out.println("Задача 3:");
        System.out.println("На каждого ученика рассчитано " +resault+ " листов бумаги");

        int botleminets = 16/2;
        botleminets = botleminets*20;

        System.out.println("");
        System.out.println("Задача 4:");
        System.out.println("За 20 минут машина произвела " +botleminets+ " штук бутылок");

        botleminets = botleminets*24;
        System.out.println("За 1 сутки машина произвела " +botleminets+ " штук бутылок");

        botleminets = botleminets*3;
        System.out.println("За 3 дня машина произвела " +botleminets+ " штук бутылок");

        botleminets = botleminets*10;
        System.out.println("За 1 месяц машина произвела " +botleminets+ " штук бутылок!");

        int banok = 120;
        int bel = 2;
        int kor = 4;
        int kolklass = banok/(bel + kor);
        bel = bel * kolklass;
        kor = kor  * kolklass;
        System.out.println("");
        System.out.println("Задача 5:");
        System.out.println("В школе, где " +kolklass+ " классов, нужно " +bel+ " банок белой краски и " +kor+ " банок коричневой краски");

        int babnan = 80;
        int milk = 105;
        int ice = 100;
        int eg = 70;
        int zavtrak = 5*babnan+2*milk+2*ice+4*eg;
        float killo = (float)zavtrak/1000;
        System.out.println("");
        System.out.println("Задача 6:");
        System.out.println("Завтрак спортсмена в граммах: " +zavtrak+ " Завтрак спортсмена в килограммах: " +killo);

        int vesKat = 7;
        vesKat = vesKat*1000;
        int variant1 = 250;
        int variant2 = 500;
        int dayVar1 = vesKat/variant1;
        int dayVar2 = vesKat/variant2;
        System.out.println("");
        System.out.println("Задача 7:");
        System.out.println("Если спортсмен будет терять в день по 250гр. ему потребуется " +dayVar1+ "дней");
        System.out.println("Если спортсмен будет терять в день по 500гр. ему потребуется " +dayVar2+ "дней");


        double zpMasha = 65760;
        double zpDenis = 83690;
        double zpKris = 76230;
        double izZp = 0.1;

        double iZzpMasha = zpMasha+zpMasha*izZp;
        double godDohodMasha = iZzpMasha*12 - zpMasha*12;

        double iZzpDenis = zpDenis+zpDenis*izZp;
        double godDohodDenis = iZzpDenis*12 - zpDenis*12;

        double iZzpKris = zpKris+zpKris*izZp;
        double godDohodKris = iZzpKris*12 - zpKris*12;

        System.out.println("");
        System.out.println("Задача 7:");
        System.out.println("Маша теперь получает " +iZzpMasha+ " рублей. Годовой доход вырос на " +godDohodMasha+ " рублей");
        System.out.println("Маша теперь получает " +iZzpDenis+ " рублей. Годовой доход вырос на " +godDohodDenis+ " рублей");
        System.out.println("Маша теперь получает " +iZzpKris+ " рублей. Годовой доход вырос на " +godDohodKris+ " рублей");
    }

}