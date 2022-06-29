package Day3.Vehicle;

//CHILD
public class Car extends Vehicle {

    private boolean engine;
    //private boolean drive;
    private boolean breakPedal;
    private boolean speedPedal;

    //CONSTRUCTOR
    public Car(int year, int numberOfGears, boolean engine) {
        super(year, numberOfGears);
        this.engine = engine;
        // this.drive = drive;
    }

    //METHODS

    //OVERRIDE STEERING METHOD
    @Override
    public void steering() {
        super.steering();
        System.out.println("Steering activated on your Car!");
    }

    //METHOD TO HAVE ENGINE
    public void canDrive(boolean engine) {
        if (this.engine == true) {
            System.out.println("Car can drive.");
        } else {
            System.out.println("Car has no engine.");
        }
    }

    //METHOD TO INCREASE/DECREASE SPEED
    public void speedIncrease(boolean engine, boolean speedPedal, boolean breakPedal) {
//        this.engine = engine;
//        this.speedPedal = speedPedal;

        if (engine && speedPedal) {
            System.out.println("You are pressing speed pedal - Car will increase speed!");
        } else if (engine && breakPedal) {
            System.out.println("You are pressing break pedal - Car will decrease speed!");
        } else {
            System.out.println("ERROR! Please  check your Car");
        }
    }


    //OVERRIDE CHANGE GEAR METHOD
    @Override
    public void changeGear() {
        super.changeGear();
        System.out.println("You can change gears on your Car!");
    }
}


