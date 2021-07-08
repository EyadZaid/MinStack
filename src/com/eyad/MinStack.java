package com.eyad;

public class MinStack<T extends Comparable<T>> {
    private final Stack<T> stack;
    private final Stack<T> minStack;

    public MinStack(int capacity) {
        stack = new Stack<>(capacity);
        minStack = new Stack<>(capacity);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int size() {
        return stack.size();
    }

    public void push(T item) {
        if (isFull()) {
            System.out.println("Exception: The stack is full.");
            return;
        }
        stack.push(item);
        if (minStack.isEmpty() || minStack.peek().compareTo(item) > 0) {
            minStack.push(item);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Exception: The stack is empty.");
            return null;
        }
        minStack.pop();
        return stack.pop();
    }









}
