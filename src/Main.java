import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int monthlyContibution = 15000;
        int total = 0;
        int month = 0;
        int finalCapital = 2_459_000;
        while (total < finalCapital) {
            total = total + monthlyContibution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int birth = 17;
        int mortality = 8;
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + population * birth / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек ");
        }


    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 15_000;
        int percent = 7;
        int finalCapital = 12_000_000;
        for (int month = 1; total < finalCapital; month++) {
            total = total + total * percent / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15_000;
        int percent = 7;
        int finalCapital = 12_000_000;
        for (int month = 1; total < finalCapital; month++) {
            total = total + total * percent / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15_000;
        int percent = 7;
        int year = 10;
        for (int month = 0; month < year * 12; month++) {
            total = total + total * percent / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите число первой пятницы в месяце");
        int dateOfFirstFriday = scanner.nextInt();
        if (dateOfFirstFriday > 0 && dateOfFirstFriday < 8) {
            for (int day = dateOfFirstFriday; day <= 31; day += 7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        } else {
            System.out.println("Дата первой пятницы в месяце находится в промежутке от 1 до 7. Введите корректное значение");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int firstYearWhenCometArrives = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите номер текущего года");
        int thisYear = scanner.nextInt();
        for (int year = firstYearWhenCometArrives; year < thisYear + 100; year += 79) {
            if (year > thisYear - 200) {
                System.out.println(year);
            }
        }
    }
}