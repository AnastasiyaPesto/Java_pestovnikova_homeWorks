package ru.pestovnikova.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class InAddition {
    public static void main(String[] args) {
        // 3.1* Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
        // и выведете это количество на экран на отдельной строке.

        Random random = new Random();
        final int count = 15;
        int countEven = 0;
        // хочу ввести эту переменную, чтобы соптимизировать
        // array[i] - используется 2 раза, то есть адрес начала + i "шагов"
        // не лучше ли просто завести под это переменную ????????????
        int curElem = 0;
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++){
            curElem = random.nextInt(9);
            array[i] = curElem;
            if (curElem % 2 == 0){
                countEven++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Чётных элементов в массиве: " + countEven);
        System.out.println();

        // 3.2*
        // Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        // Напоминаем, что первый и второй члены последовательности равны единицам,
        // а каждый следующий — сумме двух предыдущих.

        final  int len = 20;
        int[] arrayFibonacci = new int[len];
        arrayFibonacci[0] = 1;
        arrayFibonacci[1] = 1;

        for (int i = 2; i < arrayFibonacci.length; i++){
            arrayFibonacci[i] = arrayFibonacci[i - 2] + arrayFibonacci[i - 1];
        }
        System.out.println(Arrays.toString(arrayFibonacci));
    }
}
