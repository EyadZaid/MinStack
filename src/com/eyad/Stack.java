package com.eyad;

public class Stack<T> {
    private T[] data;
    private int capacity;
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
            System.out.println("Exception: The stack is full.");
            return;
        }

        topIndex++;
        data[topIndex] = item;
    }





}
