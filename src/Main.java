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
        task9();
        task10();

    }

    private static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i < 11; i++)
            System.out.println("2*" + i + "=" + 2 * i);

        System.out.println();
    }

    private static void task9() {
        System.out.println("Задача 9");
        int savings = 29000;
        int savingsSum = savings;
        double percent = 0.01;

        for (int i = 0; i < 12; i++) {
            System.out.println("Месяц: " + (i + 1) + ". Сумма накоплений:" + savingsSum);
            savingsSum += savings + savingsSum * percent;
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");
        int savings = 29000;
        int savingsSum = savings;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц: " + i + ". Отложено:" + savingsSum);
            savingsSum += savings;
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i *= 2)
            System.out.println(i);

        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i += 7)
            System.out.println(i);

        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4)
            if (year%100 != 0)
                System.out.println(year + " год является високосным");

        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--)
            System.out.println(i);

        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2)
            System.out.println(i);
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--)
            System.out.println(i);
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
        System.out.println();
    }
}