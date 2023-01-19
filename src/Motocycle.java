

public class Motocycle extends Vehicle{
    public Motocycle(String modelName, double gasConsumption, String plate) {
        super(modelName, gasConsumption, plate);
        this.limitSpeed = 100;
        this.tankLimit = 50;
    }

    @Override
    public void trip(int distance, int time) {
        if (distance > 80) {
            System.out.println("-------------BIKE TRIP FAILED-----------");
            System.out.println(this.getModelName() + " can't travel that far");
            System.out.println("-----------------------------------------");
        } else if (this.getGasConsumption() * distance <= this.getTank()) {
            if (distance * 60 / time <= getLimitSpeed()) {
                System.out.println("-------------BIKE TRIP SUCCESSFUL-----------");
                System.out.println("Have a good trip with " + this.getModelName());
                this.setTank((int) (this.getTank() - this.getGasConsumption() * distance));
                System.out.println("You have " + this.getTank() + " gas left in the tank");
                System.out.println("--------------------------------------------");
            } else {
                System.out.println("-------------BIKE TRIP FAILED-----------");
                System.out.println("You can't go that fast with " + this.getModelName());
                System.out.println("-----------------------------------------");
                }
        } else {
            System.out.println("-------------BIKE TRIP FAILED-----------");
            System.out.println("You don't have enough gas for this trip with " + this.getModelName());
            System.out.println("-----------------------------------------");
        }
    }
}
