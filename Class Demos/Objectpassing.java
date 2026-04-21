class Rectangle {
    int length, width;

    Rectangle(int l, int b) {
        length = l;
        width = b;
    }

    void area(Rectangle r1) {
        int area = r1.length * r1.width; // Modifies via shared reference
        System.out.println("Area: " + area);
    }
}
