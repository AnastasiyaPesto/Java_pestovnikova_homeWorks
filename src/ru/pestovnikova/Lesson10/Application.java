package ru.pestovnikova.Lesson10;

import java.util.Scanner;
import java.io.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в онлайн-магазин \"Живая радость\"!");

        AnyUser anyUser = new AnyUser();
        Administrator administrator = new Administrator();
        Manager manager = new Manager();


        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Кто вы?\n 1 - Обычный пользователь\n 2 - Администратор\n 3 - Менеджер");
            int viewUser = scanner.nextInt();
            switch (viewUser) {
                case 1:
                    anyUser.setViewUser(TypesUsers.ANY_USER);
                    flag = true;
                    break;
                case 2:
                    administrator.setViewUser(TypesUsers.ADMIN);
                    flag = true;
                    break;
                case 3:
                    manager.setViewUser(TypesUsers.MANAGER);
                    flag = true;
                    break;
                default:
                    System.out.println("Не верно! Повторите процедуру!");
                    break;
            }
        }
    }
}
