package ru.pestovnikova.Lesson6;

// enqueue - положить в очередь
// dequeue - достать из очереди
public interface CustomQueue {
    boolean enqueue(int value);
    int dequeue();
    boolean isEmpty();
    int getArrayLength();
}
