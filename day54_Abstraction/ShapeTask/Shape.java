package day54_Abstraction.ShapeTask;

public abstract class Shape {
   public static String name;
   public double area;
   public double perimeter;
   public static boolean hasVolume;
   public double volume;

    public abstract double  calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();


}
/*
	attributes:
				name(static), area, perimeter, hasVolume(static), volume

			abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
								return-types: double

 */