package ru.pestovnikova.Lesson2;

import java.util.Random;

public class Lesson_2 {
    public static void main(String[] args) {
        // ЗАДАНИЕ 2.1.
        // Напишите программу, округляющую числа

        float fVar1 = 3.7f; // 32 бита
        double dVar2 = 7.1; // 64 бита

        int iIntPartFloatVar = (int) fVar1;
        int iIntPartDoubleVar = (int) dVar2;

        float fRaznost = fVar1 - iIntPartFloatVar;
        double dRaznost = dVar2 - iIntPartDoubleVar;

        int iRoundFloatVar;
        int iRoundDoubleVar;

        final int fiVarOne = 1;

        if (fRaznost >= 0.5) {
            iRoundFloatVar = iIntPartFloatVar + fiVarOne;
        } else{
            iRoundFloatVar = iIntPartFloatVar;
        }

        if (dRaznost >= 0.5) {
            iRoundDoubleVar = iIntPartDoubleVar + fiVarOne;
        } else{
            iRoundDoubleVar = iIntPartDoubleVar;
        }

        System.out.println(iRoundFloatVar);
        System.out.println(iRoundDoubleVar);

        System.out.println();

        // ЗАДАНИЕ 2.2.
        // Напишите программу, которая несколько раз выводит HelloWorld с помощью различных циклов
        String sMyStr = "Hello world!";

        final int fiCount = 3;
        int iIter = 0;

        System.out.println("for");
        for(; iIter < fiCount; iIter++){
            System.out.println(sMyStr + " " + iIter);
        }
        System.out.println();

        iIter = 0;
        System.out.println("while");
        while (iIter < fiCount){
            System.out.println(sMyStr + " " + iIter);
            iIter++;
        }
        System.out.println();

        iIter = 0;
        System.out.println("do ... while");
        do {
            System.out.println(sMyStr + " " + iIter);
            iIter++;
        } while (iIter < fiCount);

        // ЗАДАНИЕ 2.3.
        // Напишите программу, находящую максимум и минимум в массиве.
        // Массив заполняется случайными значениями. Используйте класс Random

        System.out.println();
        Random random = new Random();
        final int fiCountVar = 7;
        int mas[] = new int[fiCountVar];
        int iTmp;

        for (int i = 0; i < fiCountVar; i++){
            mas[i] = random.nextInt();
        }

        int iMax = mas[0];
        for (int i = 1; i < mas.length; i++){
            if(mas[i] > iMax){
                iMax = mas[i];
            }
        }

        int iMin = mas[0];
        for (int i = 1; i < mas.length; i++){
            if(mas[i] < iMin){
                iMin = mas[i];
            }
        }

        System.out.println("Максимальное значение в массиве: " + iMax);
        System.out.println("Максимальное значение в массиве: " + iMin);

        // ЗАДАНИЕ 2.4.
        // Напишите программу, которая находит простые числа от 0 до 10000.
        // Простые числа делятся только на себя и на 1.
        // Двумя способами - полный перебор и решето Эрастофена
        System.out.println();

        int iCount = 10000;
        int array[] = new int[iCount];
        // Заполним массив
        for (int i = 0; i < iCount; i++){
            array[i] = i;
        }

        // 1-ый способ - перебором
        int k = 0; // количество делителей
        for(int i = 2; i < iCount; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(array[i] % array[j] == 0)
                {
                    k += 1;
                }
            }

            if (k == 0)
            {
                System.out.println(i);
            }
            k = 0;
        }

        System.out.println();
        // 2-ой способ - решето Эрастофена
        boolean blnArray[] = new boolean[iCount];
        blnArray[0] = true;
        blnArray[1] = true;

        for (int i = 0; i < blnArray.length; i++){
            if(!blnArray[i]){
                for(int j = 2 * i; j < blnArray.length; j += i){
                    blnArray[j] = true;
                }
            }
        }

        for(int i = 0; i <  blnArray.length; i++){
            if(!blnArray[i]){
                System.out.println(i);
            }
        }
    }


}
