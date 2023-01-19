import java.util.Arrays;

public abstract class Vehicle {
    private String modelName;
    private double gasConsumption;
    private String plate;
    private String carOrBike;
    public int limitSpeed;
    private int tank;
    private boolean isFree;

    public Vehicle(String modelName, double gasConsumption, String plate) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.plate = plate;
        //this.carOrBike = carOrBike;
        this.tank = 25;
        //Object[] tempVehicleList = {carOrBike, modelName, gasConsumption};
        //System.out.println(Arrays.toString(tempVehicleList));
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }
    public String getModelName() {
        return modelName;
    }
    public int getLimitSpeed() {
        return limitSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public abstract void trip (int distance, int time);
}
