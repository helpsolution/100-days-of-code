package design.patterns.creational.prototype;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if(target!= null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
