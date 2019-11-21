package design.patterns.creational.prototype;

public class Client {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setX(0);
        circle.setY(20);
        circle.setColor("Red");
        circle.setRadius(150);

        Circle anotherCircle = (Circle) circle.clone();
        System.out.println("Another circle is " + anotherCircle);
    }
}
