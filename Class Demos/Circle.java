public class Circle {
    // private instance variables with default values
    private double radius;
    private String color ;

    // default constructor (no arguments)
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // constructor with radius argument, color stays default ("red")
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // public method to get radius
    public double getRadius() {
        return radius;
    }

    // public method to get area
    public double getArea() {
        return 3.14 * radius * radius; // using 3.14 to match expected output
    }

    // main method
    public static void main(String[] args) {
        // First object (default constructor)
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() +
                " and area of " + c1.getArea() + ".");

        // Second object (constructor with argument)
        Circle c2 = new Circle(10);
        System.out.println("The circle has radius of " + c2.getRadius() +
                " and area of " + c2.getArea() + ".");
    }
}
