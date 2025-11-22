package org.example;

public class QueueTees {
    private Cutie[] items;
    private int front;
    private int rear;
    private int count;

    public QueueTees() {
        items = new Cutie[10];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enqueue(Cutie c) {
        if (count == items.length) {
            System.out.println("Queue is full! Cannot add new Cutie.");
        } else {
            items[rear] = c;
            rear = (rear + 1) % items.length;
            count++;
        }
    }

    public Cutie dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty! Nothing to remove.");
            return null;
        } else {
            Cutie removed = items[front];
            front = (front + 1) % items.length;
            count--;
            return removed;
        }
    }

    public int size() {
        return count;
    }
}