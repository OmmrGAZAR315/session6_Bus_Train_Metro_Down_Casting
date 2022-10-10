interface load {
    void clearLoad();
}

interface cargo extends load {
    void enterCargoType(String cargoType);

    void enterCargoWeight(double cargoWeight);

    void display();
}

interface passenger extends load {
    double increasePassengers(int numOfNewPassengers);

    void display();

}