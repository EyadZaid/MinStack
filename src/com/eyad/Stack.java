package com.eyad;

/**
 * Stack implementation
 */
public class Stack<T> {
    private final T[] data;
    private final int capacity;
    private int topIndex;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        this.capacity = capacity;
        topIndex = -1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == capacity - 1;
    }

    public int size() {
        return topIndex + 1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("The stack is full.");
        }
        topIndex++;
        data[topIndex] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty.");
        }
        return data[topIndex--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty.");
        }
        return data[topIndex];
    }

}
