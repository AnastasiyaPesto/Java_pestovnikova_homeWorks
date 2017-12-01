package ru.pestovnikova.Lesson4;

public class ListArray {
    private int[] items;
    private int index;
    private int size;
    private int capacity;

    public ListArray(int cap){
        items = new int[cap];
        index = 0;
        size = 0;
        capacity = cap;
    }

    public int[] getItems() {
        return items;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean add(int value){
        if(size <= capacity && index <= capacity - 1){
            items[index] = value;
            index++;
            size++;
            return true;
        }else{
            return false;
        }
    }

    public boolean remove(int ind){
        if(index > 0 && ind < size) {
            size--;
            index--;
            int[] tmpArray = new int[capacity];

            for (int i = 0; i < ind; i++) {
                tmpArray[i] = items[i];
            }

            for (int i = ind; i < size; i++) {
                tmpArray[i] = items[i + 1];
            }

            items = tmpArray;
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (size == 0) return true;

        return false;
    }

}
