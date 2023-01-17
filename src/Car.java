public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption) {
        super(modelName, gasConsumption);
        this.limitSpeed = 120;
    }

    @Override
    public void trip(int distance, int time) {

    }


}
