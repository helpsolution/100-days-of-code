package gc;

public class GC {

    /*
        Garbage collector

        Functions:
        1) find garbage
        2) remove garbage

        Search of garbage:
        1) Reference counting - every object has the counter
        2) Tracing

        JVM memory organization:
        - Heap
        - Permanent Generation - contains metadata of classes

        Heap (objects)
        - New (Yang) Generation
        - Old Generation (Tenured) (2/3 of heap)

        Heap contains of
        - Eden
        - Survivor (S1, S2)

        Types of collectors:
        -Serial
        -Parallel
        -Concurent Mark Sweep (CMS)
        -Garbage-First (G1)

     */

    public static void main(String[] args) {

        class Resource {

            private String name;

            public Resource(String name) {
                this.name = name;
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("Object removed from heap");
                super.finalize();
            }
        }

        Resource resource = new Resource("Some resource");
        try {
            resource.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println(resource.toString());
    }
}
