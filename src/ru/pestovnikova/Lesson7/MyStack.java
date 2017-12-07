package ru.pestovnikova.Lesson7;

public interface MyStack<T> extends DataStructure<T> {
    boolean push(T value);
    T pop();
}
