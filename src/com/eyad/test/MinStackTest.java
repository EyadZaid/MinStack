package com.eyad.test;

import com.eyad.MinStack;
import com.eyad.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    public void simple_minStack_test() {
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

    @Test
    public void duplicatedMin_minStack_test() {
        MinStack<Integer> stack = new MinStack<>(1000);
        var expectedMin = -982;

        stack.push(expectedMin);

        for (int i=1; i<=900; i++) {
            stack.push(i);
        }

        stack.push(expectedMin);

        for (int i=-400; i<=-350; i++) {
            stack.push(i);
        }

        assertEquals(expectedMin, stack.getMinimum());
    }

    @Test
    public void removedMin_minStack_test() {
        MinStack<Integer> stack = new MinStack<>(1000);
        var expectedMin = -400;

        for (int i=-400; i<=0; i++) {
            stack.push(i);
        }

        stack.push(-982);

        for (int i=1; i<=10; i++) {
            stack.push(i);
        }

        for (int i=1; i<=11; i++) {
            stack.pop();
        }

        assertEquals(expectedMin, stack.getMinimum());
    }
}