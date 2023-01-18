public class Customer {

    private String name;
    public Vehicle[] myCars = new Car [5];
    private Vehicle[] bikes = new Motocycle [5];

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void requestCar(Shop shop, CarsAvailable cars){
        myCars[0] = shop.giveCar(cars);

    }
    public void requestBike(Shop shop, BikesAvailable bike){
        shop.giveBike(bike);
    }

    public void returnVehicle() {
    }
    public void refuelVehicle(){
    }
}
