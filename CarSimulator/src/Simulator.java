class Simulator {
    private Field field;
    private int turn;

    public Simulator(int quadrantLength, int numCars, int numTrucks, int numSportsCars, int numTractors) {
        this.field = new Field(quadrantLength, numCars, numTrucks, numSportsCars, numTractors);
        this.turn = 1;
    }

    public void run() {
        while (!field.getVehicles().isEmpty()) {
            System.out.print("Turn " + turn + ": ");

            for (Vehicle vehicle : field.getVehicles()) {
                try {
                    vehicle.move();
                    System.out.print(vehicle + " ");
                } catch (IllegalStateException e) {
                    // Ignore if the vehicle is dead
                }
            }

            System.out.println();
            field.removeOutOfBounds();
            turn++;
        }

        // Display results
        displayResults();
    }

    private void displayResults() {
        // Sort vehicles by survival time
        field.getVehicles().sort((v1, v2) -> Integer.compare(getSurvivalTime(v2), getSurvivalTime(v1)));

        // Display top 3 for each type
        displayTopN("CAR", 3);
        displayTopN("TRUCK", 3);
        displayTopN("SPORTSCAR", 3);
        displayTopN("TRACTOR", 3);

        // Display total simulation duration
        System.out.println("\nSimulation took a total of " + (turn - 1) + " turns.");
    }

    private int getSurvivalTime(Vehicle vehicle) {
        return vehicle.getX() + vehicle.getY();
    }

    private void displayTopN(String vehicleType, int n) {
    System.out.println("\nTop " + n + " " + vehicleType + "s:");

    int count = 0;
    for (Vehicle vehicle : field.getVehicles()) {
        if (vehicle.getClass().getSimpleName().equals(vehicleType) && vehicle.isAlive()) {
            System.out.println(++count + ". " + vehicle + " survived " + getSurvivalTime(vehicle) + " turns.");
            if (count == n) {
                break; // Stop after displaying the top N vehicles
            }
        }
    }
}

}
