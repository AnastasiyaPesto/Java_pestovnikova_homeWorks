package ru.pestovnikova.les;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException exc) {
            exc.printStackTrace();
        } finally {
        // отработает даже при error
        }
        // сами бросаем исключение
        throw new RuntimeException();
        // throws - в данном методе не обрабатываем исключение, а по цепочке отдаем дальше.
    }
}
