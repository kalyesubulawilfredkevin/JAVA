class TwoDShape {
    protected double width;
    protected double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }
    // more code goes here
}

class Triangle extends TwoDShape {
    protected String style;

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    // more code goes here
}

class ColorTriangle extends Triangle {
    protected String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }
    // more code goes here
}
