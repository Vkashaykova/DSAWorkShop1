package com.company.dsa.stack;

import com.company.dsa.Node;

import java.util.NoSuchElementException;

public class LinkedStack<E> implements Stack<E> {
    public static final String STACK_IS_EMPTY = "Stack is empty";
    private Node<E> top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(E element) {

        Node<E> newNode = new Node<E>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException(STACK_IS_EMPTY);
        }
        E item = top.data;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public E peek() {
        if (top == null) {
            throw new NoSuchElementException(STACK_IS_EMPTY);
        }
        return top.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
