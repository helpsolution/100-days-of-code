package multithreading;

public class Deadlocks {
    static class Executor {

        private String resource1 = "Some resource";
        private String resource2 = "Some resource2";

        public void run(){
            new Thread(new Thread1(resource1, resource2)).start();
            new Thread(new Thread2(resource1, resource2)).start();
        }

        class Thread1 implements Runnable{
            private String resource1;
            private String resource2;

            public Thread1(String resource1, String resource2) {
                this.resource1 = resource1;
                this.resource2 = resource2;
            }


            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1. Locked resource 1");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2){
                        System.out.println("Thread 1. Locked resource 2");
                    }
                }
            }
        }

        class Thread2 implements Runnable{
            private String resource1;
            private String resource2;

            public Thread2(String resource1, String resource2) {
                this.resource1 = resource1;
                this.resource2 = resource2;
            }

            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2. Locked resource 2");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2. Locked resource 1");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Executor().run();
    }
}



