package Day3.Vehicle;

public class Main {

    //MAIN
    public static void main(String[] args) {

        //CAR
//        Car sedan = new Car(2000,4,true);
//        sedan.steering();
//        sedan.canDrive(true);
//        sedan.speedIncrease(true,true,false);
//        sedan.changeGear();

        Ferrari newFerrari = new Ferrari(2015, 4, true, "Red", 200);

        newFerrari.changeGear();
        newFerrari.speed(true, true, false, 100);
    }
}
