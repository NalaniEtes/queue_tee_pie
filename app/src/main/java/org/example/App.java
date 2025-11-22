
package org.example;

public class App {
    public static void main(String[] arge) {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        QueueTees queue = new QueueTees();

        System.out.println(queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        System.out.println(queue.size());

        System.out.println(queue.dequeue().description());
        System.out.println(queue.dequeue().description());
    }
}
