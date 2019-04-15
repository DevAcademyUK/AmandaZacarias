package inheritance;

public class Train extends Vehicle {

    public Train (short numberOfSeats, short numberOfWheels) {
        this.numberofSeats = numberOfSeats;
        this.numberofWheels = numberOfWheels;
    }

    public void steer (String dir) {
        System.out.println("I don't need to do anything " + dir + " to turn " + dir + ", I just follow the tracks. ");
    }

}
