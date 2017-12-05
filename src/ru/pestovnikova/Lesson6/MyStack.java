package ru.pestovnikova.Lesson6;

public class MyStack implements CustomDataStructure {
    private int realSize;
    private int cap;
    int head;
    private int[] stackArray;

    public MyStack(int cap){
        stackArray = new int[cap];
        this.cap = cap;
        this.realSize = 0;
    }

    @Override
    public boolean push(int value) {

        if(realSize == cap){
            int[] oldStackArray = stackArray;
            cap = (int)(stackArray.length * 1.5);
            stackArray = new int[cap];
            System.arraycopy(oldStackArray, 0, stackArray, 0, oldStackArray.length);
        }

        stackArray[realSize++] = value;
        return true;
    }

    @Override
    public int pop() {
        int retElem = 0;
        if (realSize > 0) {
            retElem = stackArray[realSize - 1];
            stackArray[realSize - 1] = 0;
            realSize--;
        }
        return retElem;
    }


    @Override
    public boolean isEmpty() {
        return realSize == 0;
    }

    @Override
    public int getArrayLength() {
        return realSize;
    }
}
