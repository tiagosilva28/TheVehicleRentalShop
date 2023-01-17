public abstract class Vehicle {
    private String modelName;
    private double gasConsumption;
    public int limitSpeed;
    private int tank;
    private boolean isFree;

    public Vehicle(String modelName, double gasConsumption) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.tank = 25;
    }

    public int getTank() {
        return tank;
    }

    public abstract void trip (int distance, int time);
}
