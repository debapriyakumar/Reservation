package Reservation;

import java.util.*;

class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        Train train1 = new Train(1010, "Mumbai Superfast", "Mumbai", "Delhi", "13:05", 50);
        Train train2 = new Train(2013, "Delhi SuperFast", "Delhi", "Jaipur", "7:00", 50);
        Train train3 = new Train(3045, "Prayagraj EXP", "Prayagraj", "Delhi", "10:00", 50);

        // Adding the predefined trains to the reservation system
        reservationSystem.trains.add(train1);
        reservationSystem.trains.add(train2);
        reservationSystem.trains.add(train3);

        // Implement user interface and application logic here
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display Train Information");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter source station: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination station: ");
                    String destination = scanner.nextLine();
                    reservationSystem.displayTrainInformation(source, destination);
                    break;
                case 2:
                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.nextLine();
                    System.out.print("Enter seat number: ");
                    int seatNumber = scanner.nextInt();
                    System.out.print("Enter train number: ");
                    int trainNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    reservationSystem.bookTicket(passengerName, seatNumber, trainNumber);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class ReservationSystem {
    static private List<Train> trains;
    static private List<Ticket> tickets;
    static private Map<Integer, List<Integer>> reservedSeats;

    public ReservationSystem() {
        trains = new ArrayList<>();
        tickets = new ArrayList<>();
        reservedSeats = new HashMap<>();
    }
}