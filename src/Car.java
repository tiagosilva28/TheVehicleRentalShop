public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption, String carOrBike) {
        super(modelName, gasConsumption, carOrBike);
        this.limitSpeed = 120;
    }

    @Override
    public void trip(int distance, int time, double tripGasConsumption) {
        if (tripGasConsumption * this.getTank() >= distance) {
            System.out.println("Have a good trip");
        } else
        System.out.println("Your Car Trip is too long");
    }


}
