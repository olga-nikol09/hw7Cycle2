public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while ( total <= 2_459_000) {
            total = total + deposit;
            month = month + 1;
        }
        System.out.println("месяц " + month + " сумма накоплений равна " + total);
    }
    public static void task2 () {
        System.out.println("Задача2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10;a >= 1;a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача3");
        int population = 12_000_000;
        int fertility = population/1000*17;
        System.out.println(fertility + " рождаемость");
        int mortality = population/1000*8;
        System.out.println(mortality + " смертность");
        int populationAfter10years = population + fertility - mortality;
        for (int year = 1; year <= 10; year++){
            populationAfter10years = populationAfter10years + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationAfter10years);
        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        double deposit = 15000;
        double percent = 0.07;
        int month = 1;
        while (deposit < 12_000_000) {
            deposit = deposit + (deposit * percent);
            System.out.println("месяц " + month + ", сумма накопления " + deposit);
            month++;
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        double deposit = 15000;
        double percent = 0.07;
        int month = 1;
        while (deposit < 12_000_000) {
            deposit = deposit + (deposit * percent);
            if ( month % 6 == 0) {
                System.out.println("месяц " + month + ", сумма накопления " + deposit);
            }
            month++;
        }
    }
    public static void task6 () {
        System.out.println("Задача6");
        double deposit = 15000;
        double percent = 0.07;
        int month = 1;
        while (month <= 9*12) {
            deposit = deposit + (deposit * percent);
            if ( month % 6 == 0) {
                System.out.println("месяц " + month + ", сумма накопления " + deposit);
            }
            month++;
        }
    }
    public static void task7 () {
        System.out.println("Задача7");
        int friday = 5;
        while ( friday <=31 ) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday+7;
        }
    }
    public static void task8 () {
        System.out.println("Задача8");
        for (int theCometHasArrived = 1823; theCometHasArrived <= 2123; theCometHasArrived++) {
            if ( theCometHasArrived % 79 == 0)
                System.out.println(theCometHasArrived);
        }
    }
}