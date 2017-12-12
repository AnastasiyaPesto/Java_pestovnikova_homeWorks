package ru.pestovnikova.Lesson7;

public class MyStack<T> implements MyCollection {

    class StackElement {
        // ссылка на следующий элемент списка
        StackElement next;
        // значение
        T value;
        StackElement(T value) {
            this.value = value;
        }
    }
    private StackElement head;
    private int realSize;

    public MyStack(){ this.realSize = 0; }

    public boolean push(T value) {
        StackElement elemStack = new StackElement(value);
        if(head == null){
            head = elemStack;
            head.next = null;
            realSize++;
        } else {
            elemStack.next = head;
            head = elemStack;
            realSize++;
        }
        return true;
    }

    public T pop(){
        T retVal = null;
        if(realSize == 0){
            return retVal;
        }else{
            if (head.next == null){
                retVal = head.value;
                head = null;
                realSize--;
            } else {
                retVal = head.value;
                head = head.next;
                realSize--;
            }
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
        T[] array = (T[])(new Object[realSize]);
        StackElement current = head;
        int index = 0;
        while(current != null){
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }
}
