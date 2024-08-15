import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter length of each quadrant: ");
        int quadrantLength = scanner.nextInt();

        System.out.print("Enter number of vehicles: ");
        int numVehicles = scanner.nextInt();

        System.out.print("Enter number of cars: ");
        int numCars = scanner.nextInt();

        System.out.print("Enter number of trucks: ");
        int numTrucks = scanner.nextInt();

        System.out.print("Enter number of sports cars: ");
        int numSportsCars = scanner.nextInt();

        System.out.print("Enter number of tractors: ");
        int numTractors = scanner.nextInt();

        // Initialize and run the simulator
        Simulator simulator = new Simulator(quadrantLength, numCars, numTrucks, numSportsCars, numTractors);
        simulator.run();
    }
}
