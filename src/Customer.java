public class Customer {

    private String name;
    private Vehicle[] cars = new Car [5];
    private Vehicle[] bikes = new Motocycle [5];

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCars(Vehicle[] cars) {
        this.cars = cars;
    }

    public void requestCar(Shop shop, CarsAvailable cars){
        shop.giveCar(cars);

    }
    public void requestBike(Shop shop, BikesAvailable bike){
        shop.giveBike(bike);
    }

    public void returnVehicle() {
    }
    public void refuelVehicle(){
    }
}
