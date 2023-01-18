public class Shop {
    private String ShopName;

    public Shop(String shopName) {
        ShopName = shopName;
    }

    public String getShopName() {
        return ShopName;
    }

    public void giveCar(CarsAvailable cars) {
        if (cars.isFree()){
            System.out.println("The car " + cars.getModelName() + " is ready for you");
            cars.setFree(false);
        } else System.out.println("The car you want is not available!");
    }

    public void giveBike(BikesAvailable bikes) {
        if (bikes.isFree()){
            System.out.println("The bike" + bikes.getModelName() + "is ready for you");
            bikes.setFree(false);
        } else System.out.println("The bike you want is nor available!");
    }
}
