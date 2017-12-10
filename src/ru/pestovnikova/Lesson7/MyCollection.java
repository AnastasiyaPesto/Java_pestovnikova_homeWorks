package ru.pestovnikova.Lesson7;

public interface MyCollection<T> {
    boolean isEmpty();
    int getSize();
    T[] toArray();
}
