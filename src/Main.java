import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");


        Vehicle hondaCbr = new Motocycle("Honda CBR", 0.05,"00-CC-01");
        Vehicle kawazaki = new Motocycle("Kawazaki", 0.05,"00-CC-02");
        Vehicle toyotaCelica = new Car("Toyota Celica", 0.08,"00-CC-03");
        Vehicle opelCorsa = new Car("Opel Corsa", 0.07,"00-CC-04");

        hondaCbr.trip(70,60);
        kawazaki.trip(90, 50);
        kawazaki.trip(80, 5);
        toyotaCelica.trip(310, 100);
        toyotaCelica.trip(310, 400);
        opelCorsa.trip(240, 500);
        opelCorsa.trip(150, 100);




        //System.out.println(cars[0].getGasConsumption());


        c1.requestCar(s1, CarsAvailable.BMW);
        c1.requestBike(s1, BikesAvailable.HONDA);
        c1.refuelCar(25, c1.myBike);
        //c2.requestBike(s1, BikesAvailable.DUCATI);


        //System.out.println(c1.myCar.getModelName());

        c1.returnVehicle(s1, c1.myCar);




        // Vehicle vehicleList = new Vehicle();
       // System.out.println(Arrays.toString(tempVehicleList));

    }
}