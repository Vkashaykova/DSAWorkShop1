package com.company.dsa.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
    public static final String STACK_IS_EMPTY = "Stack is empty";

    private E[] items;
    private int top;
    private static final int capacity = 4;

    public ArrayStack() {
        this.items = (E[]) new Object[capacity];
        this.top = 0;

    }

    @Override
    public void push(E element) {
        if (top == items.length) {
            resize();
        }
        items[top] = element;
        top++;
    }


    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException(STACK_IS_EMPTY);
        }

        top--;
        return items[top];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return items[top - 1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    private void resize() {
        this.items = Arrays.copyOf(this.items, items.length * 2);
    }


}
