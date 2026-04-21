public class Shape {

    // Area of a rectangle
    public double area(double width, double height) {
        return width * height;
    }

    // Area of a circle
    public double area(double r) {
        double pi = 3.142; // you can also use Math.PI
        return pi * r * r;
    }

    // Area of a trapezium
    public double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String[] args) {
        // Create three different objects from Shape
        Shape rectangleShape = new Shape();
        Shape circleShape = new Shape();
        Shape trapeziumShape = new Shape();

        // Test values
        double rectArea = rectangleShape.area(5, 10); 
        double circArea = circleShape.area(7); 
        double trapArea = trapeziumShape.area(4, 8, 6); 

        // Display results
        System.out.println("Area of Rectangle = " + rectArea);
        System.out.println("Area of Circle = " + circArea);
        System.out.println("Area of Trapezium = " + trapArea);
    }
}
