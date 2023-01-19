public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");

        c1.requestCar(s1, CarsAvailable.BMW);
        c1.requestBike(s1, BikesAvailable.HONDA);
        c1.refuelVehicle(25, c1.myBike);
        c1.myBike.trip(50, 60);
        c1.returnVehicle(s1, c1.myCar);
        c1.returnVehicle(s1, c1.myBike);
        c1.returnVehicle(s1, c1.myBike);


        // Vehicle vehicleList = new Vehicle();
       // System.out.println(Arrays.toString(tempVehicleList));

    }
}