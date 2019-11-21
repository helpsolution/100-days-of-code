package basics;

public class Inheritance {

    public static void main(String[] args) {

        class Person {
            private String name;
            private Integer old;

            public Person(String name, Integer old) {
                this.name = name;
                this.old = old;
            }

            public String getInformation() {
                return String.format("Name: %s, old: %s", name, old);
            }
        }

        class Programmer extends Person {
            private String specilization;

            public Programmer(String name, Integer old) {
                super(name, old);
            }

            public Programmer(String name, Integer old, String specilization) {
                super(name, old);
                this.specilization = specilization;
            }

            public String getInformation() {
                return "Programmer info empty";
            }
        }

        Person person = new Programmer("Ivan", 21);

        System.out.println(person.getInformation());
    }
}
