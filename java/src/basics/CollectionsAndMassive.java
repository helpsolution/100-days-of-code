package basics;

import sun.lwawt.macosx.CPrinterDevice;

import java.util.*;

public class CollectionsAndMassive {

    public static void main(String[] args) {

        executeMassiveExample();

        executeCollectionsExample();

        executeHashMapExample();
    }

    static private void executeMassiveExample(){
        Integer[] numbers = new Integer[] {1,2,3};

        System.out.println("Starting to print massive..");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("index: %s, value: %s", i, numbers[i]));
        }
    }

    static private void executeCollectionsExample(){

        /*
            Collection is interface. It is extended from Iterable.
            Collection contains several methods, such as size, add, remove, removeAll, clear, contains
         */

        /*
            List
            -> Linked list
            -> Array list


         */

        class User {
            private String name;
            private Integer old;

            public User(String name, Integer old) {
                this.name = name;
                this.old = old;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getOld() {
                return old;
            }

            public void setOld(Integer old) {
                this.old = old;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", old=" + old +
                        '}';
            }
        }

        class Car {
            private String name;

            public Car(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "name='" + name + '\'' +
                        '}';
            }

            @Override
            public int hashCode() {
                return Objects.hash(name);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Car car = (Car) o;
                return Objects.equals(name, car.name);
            }
        }



        Collection linkedList = new LinkedList();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 2");
        linkedList.add(null);
        printCollectionEvements(linkedList);

        Collection arrayList = new ArrayList();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 2");
        arrayList.add(null);
        printCollectionEvements(arrayList);

        HashSet hashSet = new HashSet(1,0.75f);
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 2");
        hashSet.add(null);
        printCollectionEvements(hashSet);

        //unique insert working with overrided equals and hashcode
        // under hashser works hashmap
        hashSet = new HashSet();
        Car car1 = new Car("BMW");
        Car car2 = new Car("MEERSEDES");
        Car car3 = new Car("BMW");
        hashSet.add(car1);
        hashSet.add(car2);
        hashSet.add(car3);
        printCollectionEvements(hashSet);


        Collection treeSet = new TreeSet();
        treeSet.add("Element 1");
        treeSet.add("Element 2");
        treeSet.add("Element 2");
        printCollectionEvements(treeSet);

        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {

                if(o1.old<o2.old){
                    return -1;
                } else {
                    if (o1.old>o2.old){
                        return 1;
                    }
                }

                return 0;
            }
        };

        treeSet = new TreeSet(comparator);
        treeSet.add(new User("Ivan", 18));
        treeSet.add(new User("Olga", 16));
        treeSet.add(new User("Roman", 21));


        printCollectionEvements(treeSet);
    }

    static private void printCollectionEvements(Collection collection){

        if (collection == null) {
            throw new IllegalArgumentException("Collection is empty");
        }

        System.out.println("Starting to print collection's elements. Collection "+ collection.getClass());

        collection.forEach(e ->{
            System.out.println(String.format("value: %s", e));
        });
    }


    static private void executeHashMapExample(){
        /*
            Capacity is number of buckets in the hash table

            Load factor is a measure of how full the hash table is allowed to
            get before its capacity is automatically increased.  When the number of
            entries in the hash table exceeds the product of the load factor and the
            current capacity, the hash table is rehashed (that is, internal data
            structures are rebuilt) so that the hash table has approximately twice the
            number of buckets.

            HashMap has 2 emplementations:
             - hash table
             - tree
         */
        HashMap hashMap = new HashMap();
        //before put firstly calculate hash of key
        hashMap.put(null,"123");
        hashMap.put(null,"1234");
        hashMap.put("Ivan", "Programmer");

        System.out.println("Starting to print hashmap's elements. Class "+ hashMap.getClass());

        hashMap.forEach((k,v) -> System.out.println(String.format("Key: %s, value: %s", k, v)));
    }
}
