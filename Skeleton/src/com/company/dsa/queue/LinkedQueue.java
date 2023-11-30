package com.company.dsa.queue;

import com.company.dsa.Node;

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {
    public static final String QUEUE_IS_EMPTY = "Queue is empty";
    private Node<E> head, tail;
    private int size;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void enqueue(E element) {

        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException(QUEUE_IS_EMPTY);

        }
        E item = head.data;
        head = head.next;
        size--;
        return item;
    }

    @Override
    public E peek() {
        if (head == null) {
            throw new NoSuchElementException(QUEUE_IS_EMPTY);
        }
        return head.data;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
