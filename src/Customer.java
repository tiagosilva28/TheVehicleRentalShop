public class Customer {

    private String name;
    private Car myCar;
    private Motocycle myBike;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void requestCar(Shop shop, CarsAvailable cars){
        if(getMyCar() != null){
            System.out.println("You already have a car!");
        }
        setMyCar(shop.giveCar(cars));

    }
    public void requestBike(Shop shop, BikesAvailable bike){
        if(getMyBike() != null){
            System.out.println("You already have a bike!");
        }
        setMyBike(shop.giveBike(bike));
    }

    public void returnVehicle(Shop shop, Vehicle vehicle) {
        if (vehicle==null){
            System.out.println("You don't have a Vehicle");
            return;
        }

        if(vehicle instanceof Car){
            shop.returnCar(getMyCar());
            setMyCar(null);
        } else {
            shop.returnBike(getMyBike());
            setMyBike(null);
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
            getMyCar().setTank(getMyCar().getTank() + value);
            System.out.println("You now have " + getMyCar().getTank() + "L in the tank ");
        }
        if (vehicle instanceof Motocycle){
            getMyBike().setTank(getMyBike().getTank() + value);
            System.out.println("You now have " + getMyBike().getTank() + "L in the tank ");
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

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }

    public Motocycle getMyBike() {
        return myBike;
    }

    public void setMyBike(Motocycle myBike) {
        this.myBike = myBike;
    }
}
