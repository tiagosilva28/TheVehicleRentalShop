public enum CarsAvailable {
    BMW("BMW 320d", 0.1),
    MINI("Mini Clubman", 1),
    OPEL("Opel Corsa", 1);


    private String modelName;
    private double gasConsumption;
    public int limitSpeed;
    private int tank;
    private boolean isFree;


    CarsAvailable(String modelName, double gasConsumption) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.tank = 25;
        this.isFree = true;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getModelName() {
        return modelName;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }
}
