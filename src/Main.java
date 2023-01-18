import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");

        Vehicle [] cars = {new Car ("car1",8), new Car("car2",5)};

        Vehicle hondaCbr = new Motocycle("Honda CBR", 0.05);
        Vehicle kawazaki = new Motocycle("Kawazaki", 0.05);
        Vehicle toyotaCelica = new Car("Toyota Celica", 0.08);
        Vehicle opelCorsa = new Car("Opel Corsa", 0.07);

        hondaCbr.trip(70,60);
        kawazaki.trip(90, 50);
        kawazaki.trip(80, 5);
        toyotaCelica.trip(310, 100);
        toyotaCelica.trip(310, 400);
        opelCorsa.trip(240, 500);
        opelCorsa.trip(150, 100);




        //System.out.println(cars[0].getGasConsumption());


        c1.requestCar(s1, CarsAvailable.BMW);
        //c2.requestBike(s1, BikesAvailable.DUCATI);

        System.out.println(c1.myCar.getModelName());

        c2.returnVehicle(s1, c2.myBike);




        // Vehicle vehicleList = new Vehicle();
       // System.out.println(Arrays.toString(tempVehicleList));

    }
}