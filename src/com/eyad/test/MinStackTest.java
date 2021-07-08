package com.eyad.test;

import com.eyad.MinStack;
import com.eyad.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    public void simple_stack_test() {
        MinStack<Integer> stack = new MinStack<>(10);
        stack.push(13);
        stack.push(6);
        stack.push(-5);
        stack.push(8);
        stack.push(20);
        stack.push(-4);
        stack.push(10);
        stack.push(0);

        assertEquals(-5, stack.getMinimum());
    }
}