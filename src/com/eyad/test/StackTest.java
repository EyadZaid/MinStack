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

}