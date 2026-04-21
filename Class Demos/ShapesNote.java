class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " + width + "and" + height);
    }
}
// subclass of twodsahape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }

}

class ShapesNote {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4;
        t1.height = 4;
        t1.style = "isosceles";

        t2.width = 8;
        t2.height = 12;
        t2.style = "right";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());


    }
}
