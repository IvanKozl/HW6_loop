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

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        }

    }
        public static void task6() {
            System.out.println("Задача 6");
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.println(i + " раз нужно отжаться");
            }
        }
        public static void task7() {
            System.out.println("Задача 7");
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.println(i + " раз нужно присесть");
            }

        }
        public static void task8() {
            System.out.println("Задача 8");
            int salary = 29_000;
            int total = 0;
            int month = 12;
            int firstMonthMoney = 1;
            for (int i = firstMonthMoney; i <= month; i++) {
                total += salary;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        public static void task9() {
            System.out.println("Задача 9");
            int salary = 29_000;
            double total = 0;
            int month = 12;
            int firstMonthMoney = 1;
            double percent = 0.12/12 + 1;
            for (int i = firstMonthMoney; i <= month; i++) {
                total += salary * percent;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
            }

            public static void task10() {
            System.out.println("Задача 10d");
            int i = 1;
            int multiplication = 2;
            int quantitativeIncrease = 1;
            int calculationlimit = 10;
            for (; i <= calculationlimit; i = i + quantitativeIncrease) {
                System.out.println(multiplication + "*" + i + "=" + (multiplication * i));
            }
        }

    }




