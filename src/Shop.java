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
            return new Car(cars.getModelName(), cars.getGasConsumption(), cars.getPlate());
        } else System.out.println("The car you want is not available!");
        return null;
    }

    public Motocycle giveBike(BikesAvailable bikes) {
        if (bikes.isFree()){
            System.out.println("The bike " + bikes.getModelName() + " is ready for you");
            bikes.setFree(false);
            return new Motocycle(bikes.getModelName(), bikes.getGasConsumption(), bikes.getPlate());
        } else System.out.println("The bike is not available!");
        return null;
    }

    public void returnCar(Car myCar){
        for (int i = 0; i < CarsAvailable.values().length; i++) {
            if (myCar.getPlate() ==  CarsAvailable.values()[i].getPlate()) {
                if (myCar.getTank() < 20) {
                    double gasDifference = 20 - myCar.getTank();
                    double payDifference = 2.5 * gasDifference;
                    System.out.println( );
                    CarsAvailable.values()[i].setFree(true);
                    System.out.println("The tank is below 20L, you will have to pay " + payDifference+ "€." + myCar.getModelName() + "has been returned!");
                    myCar = null;
                } else {
                    CarsAvailable.values()[i].setFree(true);
                    System.out.println(myCar.getModelName() + " has been returned!");
                    myCar = null;
                }
            } else {
                System.out.println("Silly, you are trying to return a car you did not rent!!!!");
            }
        }
    };

    public void returnBike(Motocycle myBike) {
        for (int i = 0; i < BikesAvailable.values().length; i++) {
            if (myBike.getPlate() ==  BikesAvailable.values()[i].getPlate()) {
                if (myBike.getTank() < 20) {
                    double gasDifference = 20 - myBike.getTank();
                    double payDifference = 2.5 * gasDifference;
                    System.out.println( );
                    BikesAvailable.values()[i].setFree(true);
                    System.out.println("The tank is below 20L, you will have to pay " + payDifference+ "€." + myBike.getModelName() + "has been returned!");
                    myBike = null;
                } else {
                    BikesAvailable.values()[i].setFree(true);
                    System.out.println(myBike.getModelName() + " has been returned!");
                    myBike = null;
                }
            } else {
                System.out.println("Silly, you are trying to return a bike you did not rent!!!!");
            }
        }
    }
}
