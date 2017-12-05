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
        if (realSize == 0){
            stackArray[realSize++] = value;
        } else{
            int[] oldQueue = stackArray;
            if(realSize == cap) {
                cap = (int) (stackArray.length * 1.5);
            }
            stackArray = new int[cap];
            stackArray[0] = value;
            System.arraycopy(oldQueue, 0, stackArray, 1, realSize);
            realSize++;
        }
        return true;
    }

    @Override
    public int pop() {
        int returnElem = 0;
        if(realSize > 0){
            returnElem = stackArray[0];
            realSize--;
            System.arraycopy(stackArray, 1, stackArray, 0, realSize);
            stackArray[realSize] = 0;
        }
        return returnElem;
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
