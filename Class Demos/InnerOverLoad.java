// automatic type conversions apply to overloading
class OverLoadDemo {
    void test() {
        System.out.println("No parameters");
    }
    //overload test for two integer
    void test(int a, int b) {
        System.out.println("a and b: " + a + "" + b);
    }

    void test(double a) {
        System.out.println("Inside test(double)a: " + a);
    }

    
}
class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);// will invoke test
        ob.test(123.2);
    }
}
