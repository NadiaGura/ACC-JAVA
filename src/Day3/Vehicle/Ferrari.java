package Day3.Vehicle;

public class Ferrari extends Car {

    String color;
    int speed;

    //CONSTRUCTOR
    public Ferrari(int year, int numberOfGears, boolean engine, String color, int speed) {
        super(year, numberOfGears, engine);
        this.color = color;
        this.speed = speed;
    }


    //METHODS

    //METHOD TO CHANGE GEAR

    @Override
    public void changeGear() {
        super.changeGear();
        System.out.println("Starting gear change in Ferrari!");
    }

    //METHOD TO INCREASE/DECREASE SPEED

    public void speed(boolean engine, boolean speedPedal, boolean breakPedal, int speed) {
        if (engine && speedPedal) {
            System.out.println("You are pressing speed pedal - Car will increase speed to " + speed + "!");
        } else if (engine && breakPedal) {
            System.out.println("You are pressing break pedal - Car will decrease speed!");
        } else {
            System.out.println("ERROR! Please  check your Car");
        }
    }
}

