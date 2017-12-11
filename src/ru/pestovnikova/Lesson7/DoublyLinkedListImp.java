package ru.pestovnikova.Lesson7;

public class DoublyLinkedListImp<T> implements DataStructure<T> {
    private ListElement head;
    private int size;

    @Override
    public boolean add(T value) {
        ListElement<T> element = new ListElement(value);
        if (head == null){
            head = element;
            size++;
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
    public void remove(int index) {
        if (index == 0){
            head = head.next;
        }else{
            int curIndex = 0;
            ListElement<T> current = head;
            while (curIndex != index){
                current = current.next;
                curIndex++;
            }
            current.previous.next = current.next;
            size--;
        }
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
    public T[] toArray() {
        T[] arrayDoublyLinkedList = (T[])(new Object[size]);
        ListElement<T> current = head;
        int index = 0;
        while(current != null){
            arrayDoublyLinkedList[index] = current.value;
            current = current.next;
            index++;
        }
        return arrayDoublyLinkedList;
    }
}
