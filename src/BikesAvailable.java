public enum BikesAvailable {


    HONDA("Honda CBR", 1),

    YAMAHA("Yamaha mt 07", 1),
    DUCATI("Ducati diavel 1260", 1);

    private String modelName;
    private double gasConsumption;
    public int limitSpeed;
    private int tank;
    private boolean isFree;


    BikesAvailable(String modelName, double gasConsumption) {
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
}
