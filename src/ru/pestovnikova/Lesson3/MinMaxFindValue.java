package ru.pestovnikova.Lesson3;

public class MinMaxFindValue {
        int[] array;
        MinMaxFindValue(int[] arr){
                array = arr;
        }
        // Поиск минимального значения
        int min() {
                int MinValue = array[0];
                for (int i = 1; i < array.length; i++) {
                        if (array[i] < MinValue) {
                                MinValue = array[i];
                        }
                }
                return MinValue;
        }
        // Поиск максимального значения
        int max() {
                int MaxValue = array[0];
                for (int i = 1; i < array.length; i++) {
                        if (array[i] > MaxValue) {
                                MaxValue = array[i];
                        }
                }
                return MaxValue;
        }
}
