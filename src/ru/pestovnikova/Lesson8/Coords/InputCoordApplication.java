package ru.pestovnikova.Lesson8.Coords;

import java.util.Scanner;

public class InputCoordApplication {
    public static void main(String[] args) throws NegativeCoordsException {
        Coordinate coord = new Coordinate(0, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение координат X и Y");
        coord.setX(scanner.nextInt());
        coord.setY(scanner.nextInt());

        System.out.println("X = " + coord.getX() + "; " + "Y = " + coord.getY());
    }
}
