public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption, String carOrBike) {
        super(modelName, gasConsumption, carOrBike);
        this.limitSpeed = 120;
    }

    @Override
    public void trip(int distance, int time) {

    }


}
