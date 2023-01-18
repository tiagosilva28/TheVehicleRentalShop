public class Customer {

    private String name;
    public Car myCar;
    public Motocycle myBike;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void requestCar(Shop shop, CarsAvailable cars){
        myCar = shop.giveCar(cars);

    }
    public void requestBike(Shop shop, BikesAvailable bike){
        myBike = shop.giveBike(bike);
    }

    public void returnVehicle() {
    }
    public void refuelCar(int value){
myCar.setTank(myCar.getTank() + value);
        System.out.println("You now have " + myCar.getTank() + "L in the tank ");
    }

}
