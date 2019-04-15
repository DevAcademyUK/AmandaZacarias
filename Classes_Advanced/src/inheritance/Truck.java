package inheritance;

public class Truck extends SteeringWheel {

    // constructor has to have the same name of the class in Capital Letters
    public Truck(short numberOfSeats, short numberOfWheels) {
        this.numberofSeats = numberOfSeats;
        this.numberofWheels = numberOfWheels;
    }
}
