public class Car extends Vehicle
{
    public Car(String modelName, double gasConsumption, String plate) {
        super(modelName, gasConsumption, plate);
        this.limitSpeed = 120;
        this.tankLimit = 75;
    }

    @Override
    public void trip(int distance, int time) {
        if (this.getGasConsumption() * distance <= this.getTank()) {
           if (distance * 60 / time <= getLimitSpeed()) {
               System.out.println("-------------CAR TRIP SUCCESSFUL-----------");
               System.out.println("Have a good trip with " + this.getModelName());
               this.setTank((int) (this.getTank() - this.getGasConsumption() * distance));
               System.out.println("You have " + this.getTank() + " gas left in the tank");
               System.out.println("-------------------------------------------");
           } else {
               System.out.println("-------------CAR TRIP FAILED-----------");
               System.out.println("You can't go that fast with " + this.getModelName());
               System.out.println("----------------------------------------");
                }
        } else {
            System.out.println("-------------CAR TRIP FAILED-----------");
            System.out.println("You don't have enough gas for this trip with " + this.getModelName());
            System.out.println("----------------------------------------");
            }
    }


}
