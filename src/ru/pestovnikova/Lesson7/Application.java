package ru.pestovnikova.Lesson7;

public class Application {
    public static void main(String[] args) {
//        DataStructure<Integer> linkedList = new DoublyLinkedListImp<Integer>();
//        linkedList.add(3);
//        linkedList.add(7);
//        linkedList.add(15);
//        linkedList.add(-8);
//        Object[] ar;
//        ar = linkedList.toArray();
//        int i = 0;

        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(-12);
        stack.push(8);

        Integer i1 = stack.pop();
        Integer i2 = stack.pop();
        Integer i3 = stack.pop();
        Integer i4 = stack.pop();
        Object[] ar;
        ar = stack.toArray();
        int i = 0;
    }

}
