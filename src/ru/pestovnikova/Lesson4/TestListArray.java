package ru.pestovnikova.Lesson4;

import java.util.List;
import java.util.Random;

public class TestListArray {
    public static void main(String[] args) {
        ListArray listArray = new ListArray(5);
        Random random = new Random();

        for (int i = 0; i < 6; i++){
            listArray.add(random.nextInt());
        }

        listArray.remove(0);
        listArray.remove(0);
        listArray.remove(0);
        listArray.remove(0);
        listArray.remove(0);

        boolean bln = listArray.isEmpty();
    }
}
