package ru.pestovnikova.Lesson7;

import java.util.Collection;

public interface MyStack<T> extends Collection<T> {
    boolean push(T value);
    T pop();
}
