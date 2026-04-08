class CalcMean {
    int x1, x2, x3;
// parameterized constructor
    CalcMean(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    // calc mean
    double calcMean() {
        return (x1 + x2 + x3) / 3.0;
    }

    // calc variance
    double calcVariance() {
        double mean = calcMean();
        return (Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2)) / 3.0;

    }

    // calc standard deviation
    double calcStandardDeviation() {
        return Math.sqrt(calcVariance());
    }

    // get max value
    int getMax() {
        return Math.max(x1, Math.max(x2, x3));
    }

    // dispaly results
    void display() {
        System.out.println("Values: " + x1 + ", " + x2 + ", " + x3);
        System.out.println("Mean: " + calcMean());
        System.out.println("Variance: " + calcVariance());
        System.out.println("Standard Deviation: " + calcStandardDeviation());
        System.out.println("Max: " + getMax());
    }

}

public class Main {
    public static void main(String[] args) {

        CalcMean object1 = new CalcMean(10, 20, 30);
        object1.display();
        System.out.println("============");

        CalcMean object2 = new CalcMean(2, 30, 40);
        object2.display();
        System.out.println("============");

        CalcMean object3 = new CalcMean(5, 15, 20);
        object3.display();

    }
}