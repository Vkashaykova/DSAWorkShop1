package com.company.dsa.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
    public static final String QUEUE_IS_EMPTY = "Queue is empty";

    private E[] items;

    private int head, tail, size;
    private static final int capacity = 4;


    public ArrayQueue() {
        this.items = (E[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(E element) {

        if (tail == items.length) {
            resize();
        }

        items[tail] = element;
        tail++;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException(QUEUE_IS_EMPTY);
        }
        E deleteElement = items[head];
        head++;
        size--;
        return deleteElement;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return items[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        this.items = Arrays.copyOf(this.items, items.length * 2);
    }
}
