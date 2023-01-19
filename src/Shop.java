public class Shop {
    private String ShopName;

    public Shop(String shopName) {
        ShopName = shopName;
    }

    public String getShopName() {
        return ShopName;
    }

    public Car giveCar(CarsAvailable cars) {
        if (cars.isFree()){
            System.out.println("The car " + cars.getModelName() + " is ready for you");
            cars.setFree(false);
            return new Car(cars.getModelName(), cars.getGasConsumption());
        } else System.out.println("The car you want is not available!");
        return null;
    }

    public Motocycle giveBike(BikesAvailable bike) {
        if (bike.isFree()){
            System.out.println("The bike " + bike.getModelName() + " is ready for you");
            bike.setFree(false);
            return new Motocycle(bike.getModelName(), bike.getGasConsumption());
        } else System.out.println("The bike is not available!");
        return null;
    }

    public void returnCar(Car myCar, CarsAvailable cars){
        for (int i = 0; i < CarsAvailable.values().length; i++) {
            if (myCar.getPlate() == CarsAvailable.valueOf(cars[i].getPlate())) {
                System.out.println(myCar.getPlate());
            }

        }


    };

    public void returnBike(Motocycle myBike) {

    }
}
