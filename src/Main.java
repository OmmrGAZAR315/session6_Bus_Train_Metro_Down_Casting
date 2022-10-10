import java.util.Scanner;

public class Main {
    //down casting
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bus("CTA", 30);
        vehicles[1] = new Train("Metro", 300);
        vehicles[2] = new Truck("Toyota", 3);
        for (Vehicle element : vehicles) {
            element.displayAll(element);
        }
    }
}
