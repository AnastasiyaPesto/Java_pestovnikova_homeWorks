package ru.pestovnikova.Lesson6;

public class MyQueue implements CustomQueue{
    private int[] queue;
    private int cap;
    private int realSize;

    public MyQueue(int countElem){
        this.queue = new int[countElem];
        this.cap = countElem;
        this.realSize = 0;
    }

    // enqueue - положить в очередь
    @Override
    public boolean enqueue(int value) {
        if(realSize == cap){
            int[] oldStackArray = queue;
            cap = (int)(queue.length * 1.5);
            queue = new int[cap];
            System.arraycopy(oldStackArray, 0, queue, 0, oldStackArray.length);
        }

        queue[realSize++] = value;
        return true;
    }

    // dequeue - достать из очереди
    @Override
    public int dequeue() {
        int retElem = 0;
        if (realSize > 0) {
            retElem = queue[realSize - 1];
            queue[realSize - 1] = 0;
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
