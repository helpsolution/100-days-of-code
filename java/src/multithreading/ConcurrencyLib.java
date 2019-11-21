package multithreading;

import java.util.concurrent.*;

public class ConcurrencyLib {

    /*
        Concurrency useful library in java for the working with threads
     */

    public static void main(String[] args) {

        System.out.println("Case1");
        case1();

        System.out.println("Case2");
        case2();

        System.out.println("Case3");
        case3();

        System.out.println("Case4");
        case4();

    }

    public static void case1() {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Started thread " + Thread.currentThread().getName());
        });

        executor.shutdown();

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void case2() {

        Callable task = () -> {
            return "Task done";
        };


        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

        String result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);

        executor.shutdown();
    }

    public static void case3() {

        Callable task = () -> {
            return "Task done";
        };


        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Future<String> future = executor.schedule(task, 1, TimeUnit.SECONDS);
        System.out.println("future done? " + future.isDone());

        String result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);

        executor.shutdown();
    }

    public static void case4() {

        Runnable task = () -> {
            System.out.println("Task done");
        };


        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        executor.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
