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
        if (vehicle==null){
            System.out.println("You don't have a Vehicle");
            return;
        }

        if(vehicle instanceof Car){
            shop.returnCar(myCar);
            myCar = null;
        } else {
            shop.returnBike(myBike);
            myBike = null;
        }
    }
    public void refuelVehicle(int value, Vehicle vehicle){
        if (vehicle==null){
            System.out.println("You don't have a Vehicle");
            return;}
        if (vehicle.getTank() + value > vehicle.getTankLimit()) {
            System.out.println("The amount of fuel is over the tank limit");
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

    public void getCarsAvailable(){
        for (int i = 0; i < CarsAvailable.values().length; i++){
            if (CarsAvailable.values()[i].isFree() == true){
                System.out.println(CarsAvailable.values()[i]);
            }
        }
        System.out.println("No Cars Available");

    }

    public void getBikesAvailable(){
        for (int i = 0; i < BikesAvailable.values().length; i++){
            if (BikesAvailable.values()[i].isFree() == true){
                System.out.println(BikesAvailable.values()[i]);
            }
        }
        System.out.println("No Bikes Available");

    }

}
