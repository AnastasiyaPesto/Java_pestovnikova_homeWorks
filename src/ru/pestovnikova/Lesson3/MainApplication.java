package ru.pestovnikova.Lesson3;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        // ЗАДАНИЕ 3.1.
        // Поиск максимума и минимума перенести в отдельный класс. В этом классе будет два метода
        // min() и max(). Конструктор принимает массив int.
        // Метода min() и max() возвращают значение типа int.
        Random random = new Random();

        final int fiCountVar = 10;
        int mas[] = new int[fiCountVar];

        for (int i = 0; i < fiCountVar; i++){
            mas[i] = random.nextInt();
        }

        MinMaxFindValue findMinMax = new MinMaxFindValue(mas);

        System.out.println("Максимальное значение в массиве: " + findMinMax.max());
        System.out.println("Минимальное значение в массиве: " + findMinMax.min());

        // ЗАДАНИЕ 3.2.
        // Создать класс Account. В нем два поля - String user, double balance.
        // Создать конструкторы - без параметров и с параметрами. Написать метод print(),
        // который выводит информацию по счету
        Account account = new Account();
        Account account1 = new Account("Nastya", 40000.5);
        account1.print();
    }
}
