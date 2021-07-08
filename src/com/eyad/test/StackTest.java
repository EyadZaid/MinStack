package com.eyad.test;

import com.eyad.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void simple_stack_test() {
        Stack<Integer> stack = new Stack<>(1000);
        for (int i=1; i<=1000; i++) {
            stack.push(i);
        }

        for (int i=1000; i>0; i--) {
            assertEquals(i, stack.pop());
        }
    }

    @Test
    public void empty_stack_test() {
        Stack<Integer> stack = new Stack<>(10);
        assertNull(stack.pop());
    }

    @Test
    public void capacity_stack_test() {
        Stack<Integer> stack = new Stack<>(0);
        assertNull(stack.pop());
    }

    @Test
    public void full_stack_test() {
        Stack<Integer> stack = new Stack<>(10);
        for (int i=1; i<=11; i++) {
            stack.push(i);
        }
        assertEquals(10, stack.size());
    }

    @Test
    public void pushAndPop_stack_test() {
        Stack<Integer> stack = new Stack<>(10_000);
        for (int i=1; i<=5000; i++) {
            stack.push(i);
        }

        for (int i=5000; i>=4000; i--) {
            assertEquals(i, stack.pop());
        }

        for (int i=4000; i<=10_000; i++) {
            stack.push(i);
        }

        for (int i=10_000; i>0; i--) {
            assertEquals(i, stack.pop());
        }
    }
}