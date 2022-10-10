public class Bus extends Vehicle implements passenger {
    public Bus(String brand, int numOfSeats) {
        super(brand, numOfSeats);
    }

    @Override
    public void clearLoad() {
        numOfSeats = 0;
    }

    @Override
    public double increasePassengers(int numOfNewPassengers) {
        return numOfSeats += numOfNewPassengers;
    }

    public void display() {
        System.out.println("============================");
        System.out.println(brand);
        System.out.println(numOfSeats);
    }
}
