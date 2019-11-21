package design.patterns.creational.singleton;


public class Client {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());

        thread1.start();
        thread2.start();
    }


    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            DbSingleton dbSingleton = DbSingleton.getInstance("Foo");
            System.out.println("Value of singleton: " + dbSingleton.dbName);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            DbSingleton dbSingleton = DbSingleton.getInstance("Bar");
            System.out.println("Value of singleton: " + dbSingleton.dbName);
        }
    }
}
