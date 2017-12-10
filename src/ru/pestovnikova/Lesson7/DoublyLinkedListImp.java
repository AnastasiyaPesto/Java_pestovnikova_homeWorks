package ru.pestovnikova.Lesson7;

public class DoublyLinkedListImp<T> implements DataStructure<T> {
    private T[] arrayDoublyLinkedList;
    private ListElement head;
    private int size;

    @Override
    public boolean add(T value) {
        ListElement<T> element = new ListElement(value);
        if (head == null){
            head = element;
        } else{
            ListElement<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = element;
            element.previous = current;
            size++;
        }
        return true;
    }

    @Override
    public T remove(int index) {
        T retVal;
        if (index == 0){
            head = head.next;
            retVal = null;
        }else{
            int curIndex = 0;
            ListElement<T> current = head;
            while (curIndex != index){
                current = current.next;
                curIndex++;
            }
            current.previous.next = current.next;
            size--;
            retVal = current.getValue();
        }
        return retVal;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    // Н Е  Р А Б О Т А Е Т
    public T[] toArray() {
        arrayDoublyLinkedList = (T[])(new Object[size]);
        ListElement<T> current = head;
        int index = 0;
        while(current.next != null){
            arrayDoublyLinkedList[index] = current.value;
            current = current.next;
            index++;
        }
        return arrayDoublyLinkedList;
    }
}
