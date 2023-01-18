public enum BikesAvailable {

    HONDACBR("Honda CBR", 1),

    YAMAHA("Honda CBR", 1),
    DUCATTI("Honda CBR", 1);

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
