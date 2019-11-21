package multithreading;

import java.util.concurrent.atomic.AtomicLong;

public class ConcurrencyProblem {

    /*
        We have problem when many threads can work with common data

        For consistent behavior we need to ensure a couple of rules:

        1. Mutual exclusion - only one thread executes a critical section at a time

        2. Visibility - changes made by one thread to the shared data, are visible to other threads to maintain a data consistency.

        Syncronized methods and block provide both of the above properties, at the cost of performance of the application

        Volotile can help ensure to visibility aspects of data change, without mutual exclusion


        Happens before guarantee

    * */

    public static void main(String[] args) {

        System.out.println("Executing caseRaceCondition");
        caseRaceCondition();

        System.out.println("Executing caseSolveRaceCondition");
        caseSolveRaceCondition();
    }

    static private void caseRaceCondition() {
        class Controller {
            //common resource
            private Long counter = 0L;

            public String call() {
                counter++;
                return "result";
            }

            public Long getCounter() {
                return counter;
            }
        }

        class WebClient implements Runnable {

            private Controller controller;

            public WebClient(Controller controller) {
                this.controller = controller;
            }

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    controller.call();
                }
            }
        }

        class MobileClient implements Runnable {

            private Controller controller;

            public MobileClient(Controller controller) {
                this.controller = controller;
            }

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    controller.call();
                }
            }
        }


        Controller controller = new Controller();

        System.out.println("Controller's counter value before: " + controller.getCounter());

        Thread thread1 = new Thread(new WebClient(controller));
        Thread thread2 = new Thread(new MobileClient(controller));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Controller's counter value after: " + controller.getCounter());

        //Expected result 200000, but I have another
    }

    static private void caseSolveRaceCondition() {
        class Controller {
            //common resource
            private AtomicLong counter = new AtomicLong(0);

            /*synchronized*/ public String call() {
                counter.incrementAndGet();
                return "result";
            }

            public AtomicLong getCounter() {
                return counter;
            }
        }

        class WebClient implements Runnable {

            private Controller controller;

            public WebClient(Controller controller) {
                this.controller = controller;
            }

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    controller.call();
                }
            }
        }

        class MobileClient implements Runnable {

            private Controller controller;

            public MobileClient(Controller controller) {
                this.controller = controller;
            }

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    controller.call();
                }
            }
        }


        Controller controller = new Controller();

        System.out.println("Controller's counter value before: " + controller.getCounter());

        Thread thread1 = new Thread(new WebClient(controller));
        Thread thread2 = new Thread(new MobileClient(controller));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Controller's counter value after: " + controller.getCounter());

        // AtomicLong or synchronized can solve race conditon
    }

}
