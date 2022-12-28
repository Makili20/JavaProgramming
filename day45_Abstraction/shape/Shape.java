package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double area();
    public abstract double perimetar();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimetar='" + perimetar() + '\'' +
                '}';
    }
}
