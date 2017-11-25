package ru.pestovnikova.Lesson1;

import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1.1.
        // Напишите программу, которая решает линейное уравнение - ax + b = 0.
        // Коэффициенты а и b указываете в коде. Решение вывести на экран.

        // Решение линейного уравнения AX + B = 0
        double dA = 5;
        double dB = 75;
        double dX = (-dB) / dA;
        System.out.println("Exercise 1");
        // Вывод решения на экран
        System.out.println("The solution on the equation AX + B = 0:");
        System.out.println("X = " + dX + ".");
        System.out.println("========================================");

        // ЗАДАНИЕ 1.2.
        // Напишите программу, которая выдают четное число или нет.
        // Число указываете в коде. Решение вывести на экран.
        System.out.println("Exercise 2");
        int iTmp = 7;
//        int iDiv;
//        iDiv = iTmp % 2;
        if (iTmp % 2 == 0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }
        System.out.println("========================================");

        // ЗАДАНИЕ 1.3.
        // Для этих двух программ сделайте возможность пользователю вводить значения с клавиатуры.
        // Используйте класс Scanner.
        System.out.println("Exercise 3");

        Scanner cin = new Scanner(System.in);
        System.out.println("AX + B = 0");

        System.out.print("Input A = ");
        double dInputA = cin.nextDouble();

        while (dInputA == 0){
            System.out.print("Input A = ");
            dInputA = cin.nextDouble();
        }

        System.out.print("Input B = ");
        double dInputB = cin.nextDouble();

        double dOutputX = (-dInputB) / dInputA;

        System.out.println("The solution on the equation AX + B = 0:");
        System.out.println("X = " + dOutputX + ".");
        System.out.println("========================================");
    }
}
