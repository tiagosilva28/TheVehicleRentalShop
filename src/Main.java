import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");

        Vehicle [] cars = {new Car ("car1",8,"Car"), new Car("car2",5,"Car")};

        Vehicle hondaCbr = new Motocycle("Honda CBR", 1, "Motorcycle");
        Vehicle kawazaki = new Motocycle("Kawazaki", 1, "Motorcycle");
        Vehicle toyotaCelica = new Car("Toyota Celica", 12.5, "Car");

        hondaCbr.trip(70,60);
        kawazaki.trip(90, 50);
        toyotaCelica.trip(310, 100);


        //System.out.println(cars[0].getGasConsumption());


        // Vehicle vehicleList = new Vehicle();
       // System.out.println(Arrays.toString(tempVehicleList));

    }
}