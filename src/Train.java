public class Train extends Vehicle implements cargo, passenger {
    String cargoType;
    double cargoWeight;

    public Train(String brand, int numOfSeats) {
        super(brand, numOfSeats);


    }

    @Override
    public void clearLoad() {
        cargoType = "";
        cargoWeight = 0;
        numOfSeats = 0;
    }

    @Override
    public void enterCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public void enterCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double increasePassengers(int numOfNewPassengers) {
        return numOfSeats += numOfNewPassengers;
    }

    public void display() {
        System.out.println("============================");
        System.out.println(brand);
        System.out.println(numOfSeats);
        System.out.println(cargoType);
        System.out.println(cargoWeight + " Kg");
    }
}
