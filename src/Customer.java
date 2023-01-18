public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requestCar(Shop shop, CarsAvailable cars){
        shop.giveCar(cars);

    }
    public void requestMoto(Shop shop, CarsAvailable cars){
    }

    public void returnVehicle() {
    }
    public void refuelVehicle(){
    }
}
