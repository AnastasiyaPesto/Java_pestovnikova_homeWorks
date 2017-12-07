package ru.pestovnikova.Lesson7;

public class ListElement<T> {

    ListElement next;
    ListElement previous;

    T value;

    ListElement(T value) {
            this.value = value;
        }

}
