package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class Queues {

    public static void main(String[] args) throws InterruptedException {
         case1();
    }

    private static void case1() {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
//        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
//        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        class Producer implements Runnable{

            BlockingQueue queue;

            public Producer(BlockingQueue queue) {
                this.queue = queue;
            }

            @Override
            public void run() {
                String element;

                for (int i = 0; i < 100; i++) {
                    try {
                        element = "Element" + i;
                        queue.put(element);
                        System.out.println("Added " + element);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        class Consumer implements Runnable{

            BlockingQueue queue;

            public Consumer(BlockingQueue queue) {
                this.queue = queue;
            }

            @Override
            public void run() {
                String result;
                try {
                    for (;;) {
                        Thread.sleep(1000);

                        result = ((String) queue.take());
                        System.out.println("Recieved: " + result);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }
}
