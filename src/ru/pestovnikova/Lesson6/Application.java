package ru.pestovnikova.Lesson6;

public class Application {
    public static void main(String[] args) {
        MyStack exStack = new MyStack(4);

        exStack.push(3);
        exStack.push(-4);
        exStack.push(13);
        exStack.push(19);
        exStack.push(7);
        exStack.push(8);

        int topStack =  exStack.pop();
        topStack = exStack.pop();
        topStack = exStack.pop();

        int len = exStack.getArrayLength();
        exStack.pop();
        exStack.pop();
        exStack.pop();
        exStack.pop();

        boolean empty = exStack.isEmpty();

        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(9);
        myQueue.enqueue(11);
        myQueue.enqueue(13);

        int temp = myQueue.dequeue();
        temp = myQueue.dequeue();
        temp = myQueue.dequeue();
        temp = myQueue.dequeue();
        temp = myQueue.dequeue();
        temp = myQueue.dequeue();
        temp = myQueue.dequeue();

        len = myQueue.getArrayLength();
    }
}
