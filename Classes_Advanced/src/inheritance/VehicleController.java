package inheritance;

import java.util.Scanner;

public class VehicleController {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        VehicleController vc = new VehicleController();
        vc.menu();
    }

    //TO DO - add go back menu in every option and for every vehicle.

    public void menu() {
        System.out.println("Which vehicle would you like to create today?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");

        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                createCar();
                break;
            case 2:
                createBus();
                break;
            case 3:
                createTruck();
                break;
            case 4:
                createTrain();
                break;
            case 5:
                createMotorbike();
                break;
            case 6:
                createBycicle();
                break;
            default:
                System.out.println("Not a valid option. Try again");
                menu();
        }
    }
    // number of seats (short1), number of wheels (short2)
    public void createCar() {
        Car c = new Car( (short)5, (short)4);
        c.menuOptions();
        c.accelerate();
        c.steer( "Right");
        c.brake();
        System.out.printf("%n");
        menu();
    }

    public void createBus() {
        Bus b = new Bus((short) 30, (short)6);
        b.accelerate();
        b.steer("Right");
        b.brake();
        System.out.printf("%n");
        menu();
    }

    public void createTruck() {
        Truck t = new Truck ((short) 3, (short) 8);
        t.accelerate();
        t.steer("Right");
        t.brake();
        System.out.printf("%n");
        menu();
    }

    public void createTrain() {
        Train trem = new Train((short)100, (short)20);
        trem.accelerate();
        trem.steer("Right");
        trem.brake();
        System.out.printf("%n");
        menu();
    }

    public void createMotorbike() {
        Motorbike m = new Motorbike((short)2, (short)1);
        m.accelerate();
        m.steer("Right");
        m.brake();
        System.out.printf("%n");
        menu();
    }

    public void createBycicle() {
        Bicycle b = new Bicycle((short)1, (short)1);
        b.accelerate();
        b.steer("Right");
        b.brake();
        System.out.printf("%n");
        menu();
    }

}
