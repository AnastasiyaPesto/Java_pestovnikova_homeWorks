package ru.pestovnikova.Lesson7;

public class MyQueue<T> implements MyCollection {

        class QueueElement {
            // ссылка на следующий элемент списка
            QueueElement next;
            // значение
            T value;

            QueueElement(T value) {
                this.value = value;
            }

        }

        private QueueElement head;
    private int realSize;

    public MyQueue() {
        this.realSize = 0;
    }

    // enqueue - положить в очередь
    public boolean enqueue(T value) {
        QueueElement elemQueue = new QueueElement(value);
        if(head == null){
            head = elemQueue;
            realSize++;
        } else {
            QueueElement curQuElem = head;
            while (curQuElem.next != null){
                curQuElem = curQuElem.next;
            }
            curQuElem.next = elemQueue;
            realSize++;
        }
        return true;
    }

    public T dequeue() {
        T retVal = null;
        if(realSize == 0){
            return retVal;
        }else{
            QueueElement curQuElem = head;
            int index = 0;
            while (index != realSize - 1){
                curQuElem = curQuElem.next;
            }
            retVal = curQuElem.value;
            curQuElem = null;
            realSize--;
        }
        return retVal;
    }

    @Override
    public boolean isEmpty() {
        return (realSize == 0);
    }

    @Override
    public int getSize() {
        return realSize;
    }

    @Override
    public Object[] toArray() {
        T[] arrayDoublyLinkedList = (T[])(new Object[realSize]);
        QueueElement current = head;
        int index = 0;
        while(current != null){
            arrayDoublyLinkedList[index] = current.value;
            current = current.next;
            index++;
        }
        return arrayDoublyLinkedList;
    }
}
