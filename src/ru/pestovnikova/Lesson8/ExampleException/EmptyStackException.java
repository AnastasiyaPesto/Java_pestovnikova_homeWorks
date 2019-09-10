package ru.pestovnikova.Lesson8.ExampleException;

public class EmptyStackException extends Exception {
    EmptyStackException(String message){
        super(message);
    }
}
