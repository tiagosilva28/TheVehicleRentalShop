public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption, String carOrBike) {
        super(modelName, gasConsumption, carOrBike);
        this.limitSpeed = 120;
    }

    @Override
    public void trip(int distance, int time) {
        if (this.getGasConsumption() * this.getTank() >= distance) {
            System.out.println("-------------CARS-----------");
            System.out.println("Have a good trip");
            this.setTank((int) (this.getTank() - this.getGasConsumption() * distance));
            System.out.println(this.getTank());
        } else
        System.out.println("Your Car Trip is too long");
    }


}
