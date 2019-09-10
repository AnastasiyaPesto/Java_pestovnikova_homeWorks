package ru.pestovnikova.Lesson7;

public interface DataStructure<T> extends MyCollection<T> {
    boolean add(T value);
    void remove(int index);
}
