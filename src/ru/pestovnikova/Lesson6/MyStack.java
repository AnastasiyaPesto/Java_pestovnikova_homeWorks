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
        this.head = -1;
    }

    @Override
    public boolean push(int value) {

        if(head == cap - 1){
            int[] oldStackArray = stackArray;
            cap = (int)(stackArray.length * 1.5);
            stackArray = new int[cap];
            System.arraycopy(oldStackArray, 0, stackArray, 0, oldStackArray.length);
        }

        stackArray[++head] = value;
        realSize++;
        return true;
    }

    @Override
    public boolean pop() {
        if (head >= 0) {
            stackArray[head--] = 0;
            realSize--;
            return true;
        }
        return false;
    }

    @Override
    public int top() {
        return stackArray[head];
    }

    @Override
    public boolean isEmpty() {
        if (realSize == 0) return true;

        return false;
    }

    @Override
    public int getArrayLength() {
        return realSize;
    }
}
