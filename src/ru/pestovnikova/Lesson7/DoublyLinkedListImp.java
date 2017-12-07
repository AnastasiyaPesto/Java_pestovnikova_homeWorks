package ru.pestovnikova.Lesson7;

public class DoublyLinkedListImp<T> implements DataStructure<T> {

    private ListElement head;
    private ListElement previous;

    @Override
    public boolean add(T value) {
        ListElement<T> element = new ListElement<T>(value);
        if (head == null){
            head = element;
        } else{
            ListElement<T> current = head;
            while(current.next != null){
                current.previous = previous;
                current = current.next;
            }
            current.next = element;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

//    @Override
//    public T[] toArray() {
//        return new T[0];
//    }
}
