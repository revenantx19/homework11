public class Main {
    public static void main(String[] args) {
        int year = 2016;
        yearFinder(year);
        int os = 1;
        int currentYear = 2017;
        clientDeviceYear(os, currentYear);
        int distance = 75;
        distanceDelivery(distance);
    }

    //task1
    public static void yearFinder(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год НЕ является високосным");
                }
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    //task2
    public static void clientDeviceYear(int os, int currentYear) {
        if (os == 0) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //task3
    public static void distanceDelivery(int distance) {
        if (distance < 20) {
            System.out.println("Потребуются сутки на доставку");
        } else if (distance <= 60) {
            System.out.println("Потребутся 2 дня на доставку");
        } else if (distance <= 100) {
            System.out.println("Потребутся 3 дня на доставку");
        } else {
            System.out.println("Доставки нет");
        }
    }

}