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

        exStack.pop();
        exStack.pop();
        exStack.pop();

        int topStack = exStack.top();
        int len = exStack.getArrayLength();
        exStack.pop();
        exStack.pop();
        exStack.pop();
        exStack.pop();

        boolean empty = exStack.isEmpty();
    }
}
