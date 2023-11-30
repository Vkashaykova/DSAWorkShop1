package com.company.dsa;

import com.company.dsa.stack.ArrayStack;
import com.company.dsa.stack.Stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack= new ArrayStack<>();

        stack.push(1);
        // Act
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

    }
}
