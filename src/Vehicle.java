import java.util.Arrays;

public abstract class Vehicle {
    private String modelName;
    private double gasConsumption;
    private String carOrBike;
    public int limitSpeed;
    private int tank;
    private boolean isFree;

    public Vehicle(String modelName, double gasConsumption, String carOrBike) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.carOrBike = carOrBike;
        this.tank = 25;
        Object[] tempVehicleList = {carOrBike, modelName, gasConsumption};
        System.out.println(Arrays.toString(tempVehicleList));
    }

    public int getTank() {
        return tank;
    }

    public abstract void trip (int distance, int time);
}
