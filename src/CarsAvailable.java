public enum CarsAvailable {
    BMW("BMW 320d", 0.1,"00-AA-01"),
    MINI("Mini Clubman", 1, "00-AA-02"),
    OPEL("Opel Corsa", 1,"00-AA-03") ;


    private String modelName;
    private double gasConsumption;
    private String plate;
    public int limitSpeed;
    private int tank;
    private boolean isFree;


    CarsAvailable(String modelName, double gasConsumption, String plate) {
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
