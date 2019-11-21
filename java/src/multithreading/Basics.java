package multithreading;

public class Basics {
    public static void main(String[] args) {
        /*
            Thread implements runnable.

            Every thread has a priority. Threads with higher priority are
            executed in preference to threads with lower priority. Each thread
            may or may not also be marked as a daemon. When code running in
            some thread creates a new Thread object, the new
            thread has its priority initially set equal to the priority of the
            creating thread, and is a daemon thread if and only if the
            creating thread is a daemon.

            We have 2 ways to decribe threads
            -> 1. Extend thread
               2. Implement runnable
         */

        class PersonInfoPrinter extends Thread {
            private String name;
            private Integer age;

            public PersonInfoPrinter(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public void run() {
                System.out.println(String.format("Person| Name: %s, age: %s", name, age));
            }

        }

        class CarInfoPrinter implements Runnable {
            private String name;

            public CarInfoPrinter(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                System.out.println(String.format("Car| Name: %s", name));

                Thread thread = new Thread(()->{
                    System.out.println("Embedded thread");
                });

                thread.start();

                System.out.println("");
            }
        }

        PersonInfoPrinter personInfoPrinter = new PersonInfoPrinter("Ivan", 24);
        Thread carInfoPrinter = new Thread(new CarInfoPrinter("Bmw"));

        personInfoPrinter.start();
        carInfoPrinter.start();

        System.out.println("");

    }
}
