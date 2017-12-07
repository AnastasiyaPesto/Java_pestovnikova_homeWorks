package ru.pestovnikova.Lesson7;

public interface DataStructure<T> extends MyCollection<T> {
    boolean add(T value);
    T remove(int index);
}
