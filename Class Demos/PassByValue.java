public class PassByValue {
    public static void main(String[] args) {
        int a = 2, b = 3;
        add(a, b); // Copies 2 and 3 passed
        System.out.println("Result from main: " + (a + b)); // Outputs 5
    }

    private static void add(int a, int b) {
        a = 10; // Changes copy only
        System.out.println("Result from method: " + (a + b)); // Outputs 13
    }
}
