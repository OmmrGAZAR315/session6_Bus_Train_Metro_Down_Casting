import java.util.Scanner;

abstract public class Vehicle {
    Scanner in = new Scanner(System.in);
    String brand;
    int numOfSeats;

    public Vehicle(String brand, int numOfSeats) {
        this.brand = brand;
        this.numOfSeats = numOfSeats;
    }

    public void displayAll(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            System.out.println("add number of seats of bus");
            bus.increasePassengers(in.nextInt());
            bus.display();
        }
        if (vehicle instanceof Train train) {
            System.out.println("add number of seats of train");
            train.increasePassengers(in.nextInt());
            System.out.println("enter train's cargo type (String)");
            train.enterCargoType(in.next());
            System.out.println("enter train's cargo weight (int)");
            train.enterCargoWeight(in.nextInt());
          train.display();

        }
        if (vehicle instanceof Truck truck) {
            System.out.println("enter truck's cargo type (String)");
            truck.enterCargoType(in.next());
            System.out.println("enter truck's cargo weight (int)");
            truck.enterCargoWeight(in.nextInt());
            truck.display();
        }
    }
}
