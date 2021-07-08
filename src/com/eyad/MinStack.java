package com.eyad;

public class MinStack<T> {
    private final Stack<T> stack;
    private final Stack<T> minStack;

    public MinStack(int capacity) {
        stack = new Stack<>(capacity);
        minStack = new Stack<>(capacity);
    }




}
