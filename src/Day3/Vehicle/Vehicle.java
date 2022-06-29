package Day3.Vehicle;
/*

5) Vehicle

 Create a base class of a Vehicle,
 then create a Car class which inherits from the Vehicle class.
 Also, create another class, a specific type of Car that inherits from the Car class.
 Program should be able to handle steering, changing gears, and drive (having speed in other words).
 You might decide where to put the appropriate state and behaviors (fields and methods).
 As mentioned above, changing gears, increasing/decreasing speed of driving should be included.



 */

//PARENT
public class Vehicle {

    private int year;
    private int numberOfGears;

    //CONSTRUCTOR
    Vehicle(int year, int numberOfGears) {
        this.year = year;
        this.numberOfGears = numberOfGears;
    }

    //STEERING METHOD
    public void steering() {
        System.out.println("Steering is on!");
    }

    //CHANGE GEAR METHOD
    protected void changeGear() {
        if (numberOfGears > 0) {
            System.out.println("You can change gears.");
        } else {
            System.out.println("ERROR! Vehicle don't have any gears.");
        }
    }
}
