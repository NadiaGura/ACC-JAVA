package Day3.Vehicle;

public class Ferrari extends Car{

    String color;

    //CONSTRUCTOR
    public Ferrari(String name, int numberOfGears, boolean engine, boolean drive, String color){
        super(name, numberOfGears, engine, drive);
        this.color = color;
    }

    //METHOD TO CHANGE GEAR
    @Override
    public void changeFerrariGears(){
        super.changeGear();
        System.out.println("Starting gear change!");
    }

    //METHOD TO INCREASE/DECREASE SPEED
    public void speed(boolean speed, boolean breakPedal) {
        if ( this.speed ==true && this.breakPedal== false) {
            System.out.println("You are pressing speed pedal - Ferrari will increase speed!");
        } else if(this.breakPedal == true && this.speed ==false) {
            System.out.println("You are pressing break pedal - Ferrari will decrease speed!");
        }else{
            System.out.println("ERROR!");
        }
    }


    //MAIN
    public static void main(String[]args){
Ferrari newFerrari = new Ferrari("Model",4,true,true,"red");

newFerrari.speed(true,false);
    }
}
