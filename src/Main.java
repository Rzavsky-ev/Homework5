import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Задача 1
        System.out.println("Задача 1:");
        System.out.print("Введите, пожалуйста, какая у Вас операционная система на телефоне (0 - IOS, " +
                "1 - Android): ");
        int clientOS = scanner.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.\n");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.\n");
        }

        //Задача 2
        System.out.println("Задача 2:");
        int clientDeviceYear = 2015;
        System.out.print("Введите, пожалуйста, какая у Вас операционная система на телефоне (0 - IOS, " +
                "1 - Android): ");
        clientOS = scanner.nextInt();
        System.out.print("Введите, пожалуйста, год выпуска телефона: ");
        int creationDeviceYear = scanner.nextInt();
        if (clientOS == 0 && creationDeviceYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 0) {
            System.out.println("Установите версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 1 && creationDeviceYear < clientDeviceYear) {

            System.out.println("Установите облегченную версию приложения для Android " +
                    "по ссылке.\n");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android " +
                    "по ссылке.\n");
        } else {
            System.out.println("Ошибка ввода.\n");
        }

        //Задача 3
        System.out.println("Задача 3:");
        int year = 1700;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Год високосный.\n");
        } else {
            System.out.println("Год невисокосный.\n");
        }

        //Задача 4
        System.out.println("Задача 4:");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет 24 часа.\n");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка займет 36 часов.\n");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка займет 48 часов.\n");
        } else {
            System.out.println("Доставка не доступна.\n");
        }

        //Задача 5
        System.out.println("Задача 5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зимний сезон.");
                break;
            case 3, 4, 5:
                System.out.println("Весенний сезон.");
                break;
            case 6, 7, 8:
                System.out.println("Летний сезон.");
                break;
            case 9, 10, 11:
                System.out.println("Осенний сезон.");
                break;
            default:
                System.out.println("Ошибка ввода.");
        }
        scanner.close();
    }
}