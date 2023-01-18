public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requestCar(Shop shop, VehiclesAvailable cars){
        shop.giveCar(cars);

    }
    public void requestMoto(){
    }

    public void returnVehicle() {
    }
    public void refuelVehicle(){
    }
}
