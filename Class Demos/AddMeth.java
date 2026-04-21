class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range(){
       System.out.println("Range is " + fuelcap + " mpg");
    }
}
class AddMeth{
    public static  void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 5;
        minivan.fuelcap = 500;
        minivan.mpg = 10;

        sportscar.passengers = 2;
        sportscar.fuelcap = 200;
        sportscar.mpg = 10;

        System.out.println("minivan can carry "+minivan.passengers + ".");
        minivan.range();

        System.out.println("sportscar can carry "+sportscar.passengers + ".");
        sportscar.range();
    }
}