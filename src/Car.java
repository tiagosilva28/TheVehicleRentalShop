public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption) {
        super(modelName, gasConsumption);
        this.limitSpeed = 120;
    }

    @Override
    public void trip(int distance, int time) {
        if (this.getGasConsumption() * distance <= this.getTank() * distance) {
            System.out.println("-------------CAR TRIP-----------");
            System.out.println("Have a good trip");
            this.setTank((int) (this.getTank() - this.getGasConsumption() * distance));
            System.out.println("You have " + this.getTank() + " gas left in the tank");
        } else
        System.out.println("Your Car Trip is too long");

    }


}
