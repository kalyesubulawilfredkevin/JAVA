public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;

    //parameterized constructors
//    public Vehicle(int id, String name, int passenger, int fuelcap, int mpg) {
//        this.passenger = passenger;
//        this.fuelcap = fuelcap;
//        this.mpg = mpg;
//    }
//non parameterized
    public Vehicle() {
        passenger = 2;
        fuelcap = 100;
        mpg = 20;
    }
    // no return for method
    void range() {
        System.out.println("Range is" + fuelcap * mpg);
        //System.out.println("Expected range is" + expectedRange);
    }

    // return the vehicle range
    int returnRange() {
        return fuelcap * mpg;
    }

    public static void main(String[] args) {
        Vehicle minvan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        // variable assignment to the minvan instance
        minvan.passenger = 5;
        minvan.fuelcap = 500;
        minvan.mpg = 10;

        // variable assignment to the sportcar instance

        sportcar.passenger = 2;
        sportcar.fuelcap = 200;
        sportcar.mpg = 6;

        // display results of minvan
        System.out.println("Minivan can carry \n" + minvan.passenger);
        minvan.range();
        System.out.println("The range of the minivan is \n" + minvan.returnRange());

        // display sportcar
        System.out.println("Sport car can carry \n" + sportcar.passenger);
        sportcar.range();
        System.out.println("The range of the sport car is \n" + sportcar.returnRange());

        //minvan.range(2);

    }
}
