public enum BikesAvailable {


    HONDA("Honda CBR", 1,"00-BB-01"),

    YAMAHA("Yamaha mt 07", 1,"00-BB-02"),
    DUCATI("Ducati diavel 1260", 1,"00-BB-03");

    private String modelName;
    private double gasConsumption;
    private String plate;
    public int limitSpeed;
    private int tank;
    private boolean isFree;


    BikesAvailable(String modelName, double gasConsumption, String plate) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        this.plate = plate;
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
    public String getPlate() {return plate;}
    public int getTank() {
        return tank;
    }
}
