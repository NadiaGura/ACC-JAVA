package Day3.Vehicle;

//CHILD
public abstract class Car extends Vehicle {

    boolean engine;
    boolean drive;
    boolean breakPedal;
    boolean speed;

    //CONSTRUCTOR
    public Car(String name, int numberOfGears, boolean engine, boolean drive) {
        super(name, numberOfGears);
        this.engine = engine;
        this.drive = drive;
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
    public void speed(boolean engine, boolean breakPedal, boolean speed) {
        if (this.engine == true && this.speed ==true) {
            System.out.println("You are pressing speed pedal - Car will increase speed!");
        } else if(this.engine == true && this.breakPedal == true) {
            System.out.println("You are pressing break pedal - Car will decrease speed!");
            }else{
            System.out.println("ERROR!");
        }
        }

    //OVERRIDE STEERING METHOD
    @Override
    public void steering() {
        super.steering();
        System.out.println("Steering activated!");
    }

    //OVERRIDE CHANGE GEAR METHOD
    @Override
    public void changeGear() {
        super.changeGear();
        System.out.println("You can change gears!");
    }

    //METHOD TO CHANGE GEAR
    public abstract void changeFerrariGears();
}

