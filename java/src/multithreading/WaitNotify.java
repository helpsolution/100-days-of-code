package multithreading;

public class WaitNotify {

    public static void main(String[] args) {

        Store store = new Store();

        Thread thread1 = new Thread(new Producer(store));
        Thread thread2 = new Thread(new Consumer(store));

        thread1.start();
        thread2.start();
    }
}

class Store {
    private int product = 0;

    public void getProduct() {

        synchronized (this) {

            while (product<1){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            product--;
            System.out.println("Get product");
            System.out.println("Removed 1 product from store. Amount: " + product);
            notify();
        }
    }

    public void putProduct() {

        synchronized (this){
            while (product>=3){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            product++;
            System.out.println("Put product");
            System.out.println("Added 1 product to store. Amount: " + product);
            notify();
        }
    }
}

class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.putProduct();
        }
    }
}

class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            store.getProduct();
        }
    }
}
