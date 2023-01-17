public class Motocycle extends Vehicle{
    public Motocycle(String modelName, double gasConsumption) {
        super(modelName, gasConsumption);
        this.limitSpeed = 100;
    }

    @Override
    public void trip(int distance, int time) {
        if (distance>80){
            System.out.println("Your Trip is too long");
            return;
        }
        System.out.println(this.getTank());

    }
}
