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

    public void giveBike(BikesAvailable bike) {
        if (bike.isFree()){
            System.out.println("The bike " + bike.getModelName() + " is ready for you");
            bike.setFree(false);
        } else System.out.println("The bike is not available!");
    }
}
