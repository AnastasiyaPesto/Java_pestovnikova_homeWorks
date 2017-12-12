package ru.pestovnikova.Lesson7;

public class Application {
    public static void main(String[] args) {
        DataStructure<Integer> linkedList = new DoublyLinkedListImp<Integer>();
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(15);
        linkedList.add(-8);
        Object[] ar;
        ar = linkedList.toArray();
        int i = 0;
    }

}
