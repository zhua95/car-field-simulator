import java.util.ArrayList;
import java.util.Random;

// Field class
class Field {
    private ArrayList<Vehicle> vehicles;
	private int quadrantLength;

    public Field(int quadrantLength, int numCars, int numTrucks, int numSportsCars, int numTractors) {
        // Initialize field and populate vehicles
        vehicles = new ArrayList<>();
        this.quadrantLength = quadrantLength;

        for (int i = 0; i < numCars; i++) {
            vehicles.add(new Car());
        }

        for (int i = 0; i < numTrucks; i++) {
            vehicles.add(new Truck());
        }

        for (int i = 0; i < numSportsCars; i++) {
            vehicles.add(new SportsCar());
        }

        for (int i = 0; i < numTractors; i++) {
            vehicles.add(new Tractor());
        }

        // Populate vehicles randomly within the field
        Random rand = new Random();
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.move();
            vehicle.move();
        }
    }

    public void removeOutOfBounds() {
        vehicles.removeIf(vehicle -> vehicle.getX() > this.quadrantLength || vehicle.getY() > this.quadrantLength);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
