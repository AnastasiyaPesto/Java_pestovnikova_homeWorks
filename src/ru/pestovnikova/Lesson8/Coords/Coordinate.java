package ru.pestovnikova.Lesson8.Coords;

public class Coordinate {
    private int X;
    private int Y;

    public Coordinate(int valX, int valY){
        this.X = valX;
        this.Y = valY;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        if (x < 0){
            try{
                throw new NegativeCoordsException("Input positive value of X");

            } catch(NegativeCoordsException e){
                e.fillInStackTrace();
            }
        }else {
            this.X = x;
        }
    }

    public void setY(int y) {
        if (y < 0) {
            try {
                throw new NegativeCoordsException("Input positive value of Y");
            } catch (NegativeCoordsException e) {
                e.fillInStackTrace();
            }
        }else{
            this.Y = y;
        }
    }
}
