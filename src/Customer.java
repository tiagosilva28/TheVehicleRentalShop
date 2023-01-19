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
        if(myCar != null){
            System.out.println("You already have a car!");
        }
        myCar = shop.giveCar(cars);

    }
    public void requestBike(Shop shop, BikesAvailable bike){
        if(myBike != null){
            System.out.println("You already have a bike!");
        }
        myBike = shop.giveBike(bike);
    }

    public void returnVehicle(Shop shop, Vehicle vehicle) {
      // if (this.myCar.getTank() < 20) {}
        if (vehicle == null) {
            System.out.println("You don't have a Vehicle");
        } else if (vehicle instanceof Car) {
            shop.returnCar();
            System.out.println("You have successfully returned the car: ");
        } else {
            shop.returnBike(myBike);
            System.out.println("You have successfully returned your bike");
        }
    }
    public void refuelCar(int value, Vehicle vehicle){
        if (vehicle==null){
            System.out.println("You don't have a Vehicle");
            return;}

        if (vehicle instanceof Car) {
            myCar.setTank(myCar.getTank() + value);
            System.out.println("You now have " + myCar.getTank() + "L in the tank ");
        }
        if (vehicle instanceof Motocycle){
            myBike.setTank(myBike.getTank() + value);
            System.out.println("You now have " + myBike.getTank() + "L in the tank ");
        }
    }

}
