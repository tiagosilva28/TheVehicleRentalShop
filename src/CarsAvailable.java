public enum CarsAvailable {
    BMW("Honda CBR", 1, "Motorcycle"),
    MINI("Honda CBR", 1, "Motorcycle"),
    OPEL("Honda CBR", 1, "Motorcycle");


    private String modelName;
    private double gasConsumption;
    private String carOrBike;
    public int limitSpeed;
    private int tank;
    private boolean isFree;


    CarsAvailable(String modelName, double gasConsumption, String carOrBike) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.carOrBike = carOrBike;
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
}
