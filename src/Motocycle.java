

public class Motocycle extends Vehicle{
    public Motocycle(String modelName, double gasConsumption) {
        super(modelName, gasConsumption);
        this.limitSpeed = 100;

    }

    @Override
    public void trip(int distance, int time) {
        if (distance > 80) {
            System.out.println("-------------BIKE TRIP FAILED-----------");
            System.out.println(this.getModelName() + " can't travel that far");
        } else if (this.getGasConsumption() * distance <= this.getTank()) {
            if (distance * 60 / time <= getLimitSpeed()) {
                System.out.println("-------------BIKE TRIP SUCCESSFUL-----------");
                System.out.println("Have a good trip with " + this.getModelName());
                this.setTank((int) (this.getTank() - this.getGasConsumption() * distance));
                System.out.println("You have " + this.getTank() + " gas left in the tank");
            } else {
                System.out.println("-------------BIKE TRIP FAILED-----------");
                System.out.println("You can't go that fast with " + this.getModelName());
                }
        } else {
            System.out.println("-------------BIKE TRIP FAILED-----------");
            System.out.println("You don't have enough gas for this trip with " + this.getModelName());
        }
    }
}
