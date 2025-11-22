package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class QueueTeesTest {


@Test
public void testQueueStartsEmpty() {
    QueueTees queue = new QueueTees();
    assertEquals(0, queue.size());
}

@Test
public void testEnqueueIncreasesSize() {
    QueueTees queue = new QueueTees();
    queue.enqueue(new Puppy());
    queue.enqueue(new Kitty());
    assertEquals(2, queue.size());
}

@Test
public void testDequeueReturnsCorrectOrder() {
    QueueTees queue = new QueueTees();

    Puppy puppy = new Puppy();
    Kitty kitty = new Kitty();
    PygmyMarmoset marmoset = new PygmyMarmoset();

    queue.enqueue(puppy);
    queue.enqueue(kitty);
    queue.enqueue(marmoset);

    assertEquals(puppy, queue.dequeue());
    assertEquals(kitty, queue.dequeue());
    assertEquals(marmoset, queue.dequeue());
}

@Test
public void testDequeueEmptyReturnsNull() {
    QueueTees queue = new QueueTees();
    assertNull(queue.dequeue());
}

@Test
public void testEnqueueFullQueueDoesNotChangeSize() {
    QueueTees queue = new QueueTees();

    for (int i = 0; i < 10; i++) {
        queue.enqueue(new Puppy());
    }

    int sizeBefore = queue.size();

    queue.enqueue(new Kitty());
    
    int sizeAfter = queue.size();

    assertEquals(sizeBefore, sizeAfter);
}
}

