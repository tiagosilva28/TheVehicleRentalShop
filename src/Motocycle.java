

public class Motocycle extends Vehicle{
    public Motocycle(String modelName, double gasConsumption, String carOrBike) {
        super(modelName, gasConsumption, carOrBike);
        this.limitSpeed = 100;

    }

    @Override
    public void trip(int distance, int time) {
        if (distance>80){
            System.out.println("-------------BIKES-----------");
            System.out.println("Your Trip is too long");
            return;
        }
        //System.out.println(this.getTank());

    }
}
