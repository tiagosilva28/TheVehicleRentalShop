import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");

        Vehicle hondaCbr = new Motocycle("Honda CBR", 0.005, "Motorcycle");
        Vehicle kawazaki = new Motocycle("Zundap", 0.005, "Motorcycle");
        Vehicle toyotaCelica = new Car("Toyota Celica", 1, "Car");

        hondaCbr.trip(70,60);


       // Vehicle vehicleList = new Vehicle();
       // System.out.println(Arrays.toString(tempVehicleList));

    }
}