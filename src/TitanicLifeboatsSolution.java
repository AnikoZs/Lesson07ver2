import java.util.Scanner;
import java.util.Random;

public class TitanicLifeboatsSolution {

    // Method to display results
    public static void displayResult(String title, String result) {
        System.out.println("==== " + title + " ====");
        System.out.println(result);
    }

    // Exercise 1: "All Aboard!"
    public static String allAboard() {
        String passenger1 = "Rose";
        String passenger2 = "Cal";
        String passenger3 = "Molly";
        String passenger4 = "Jack";
        String passenger5 = "Thomas";
        String result = "";
        int i = 1;

        while (i <= 5) {
            if (i == 1) result += "Passenger boarding: " + passenger1 + "\n";
            else if (i == 2) result += "Passenger boarding: " + passenger2 + "\n";
            else if (i == 3) result += "Passenger boarding: " + passenger3 + "\n";
            else if (i == 4) result += "Passenger boarding: " + passenger4 + "\n";
            else if (i == 5) result += "Passenger boarding: " + passenger5 + "\n";
            i++;
        }
        return result;
    }

    // Exercise 2: "The Lifeboat Log"
    public static String lifeboatLog() {
        Random random = new Random();
        int lifeboats = random.nextInt(10) + 1;
        String result = "";
        int i = 1;
        while (i <= lifeboats) {
            result += "Lifeboat " + i + " capacity: " + (6 + i) + "\n";
            i++;
        }
        return result;
    }

    // Exercise 3: "Customize the Lifeboats!"
    public static String customizeLifeboats(Scanner scanner) {
        System.out.print("Enter number of lifeboats: ");
        int lifeboatsCount = scanner.nextInt();
        String result = "";
        int i = 1;
        while (i <= lifeboatsCount) {
            System.out.print("Enter capacity for lifeboat " + i + ": ");
            int capacity = scanner.nextInt();
            result += "Lifeboat " + i + " capacity: " + capacity + "\n";
            i++;
        }
        return result;
    }

    // Exercise 4: "Dinner Menu Disaster"
    public static String dinnerMenu() {
        String result = "\n--- Dinner Menu Disaster ---\n";
        for (int course = 1; course <= 5; course++) {
            result += "Course " + course + ": Delicious dish " + course + "\n";
        }
        return result;
    }

    // Exercise 5: "Overpriced Tickets"
    public static String overpricedTickets(Scanner scanner) {
        System.out.print("Enter number of passengers: ");
        int passengers = scanner.nextInt();
        int price = 500;
        String result = "\n--- Overpriced Tickets ---\n";
        for (int j = 1; j <= passengers; j++) {
            result += "Passenger " + j + ": $" + price + "\n";
            price += 100;
        }
        return result;
    }

    // Exercise 6: "Dramatic Stair Climbing"
    public static String stairClimbing() {
        String result = "\n--- Dramatic Stair Climbing ---\n";
        for (int step = 10; step >= 1; step--) {
            result += "Step " + step + "...\n";
        }
        result += "Elegant Arrival!\n";
        return result;
    }

    // Exercise 7: "The Endless Buffet"
    public static String endlessBuffet() {
        String result = "\n--- The Endless Buffet ---\n";
        for (int dessert = 1; dessert <= 7; dessert++) {
            result += "Dessert " + dessert + " taken.\n";
        }
        result += "Chef: \"No more desserts!\"\n";
        return result;
    }

    // Exercise 8: "Ship Horn Countdown"
    public static String shipHornCountdown() {
        String result = "\n--- Ship Horn Countdown ---\n";
        for (int blast = 1; blast <= 5; blast++) {
            result += "Horn blast " + blast + "!\n";
        }
        result += "Titanic sets sail!\n";
        return result;
    }

    // Exercise 9: "Crew Roll Call"
    public static String crewRollCall() {
        String crew1 = "Captain Smith";
        String crew2 = "Mr. Andrews";
        String crew3 = "Officer Lightoller";
        String crew4 = "Quartermaster Hitchens";
        String result = "";
        int i = 1;
        while (i <= 4) {
            if (i == 1) result += "Crew member: " + crew1 + "\n";
            else if (i == 2) result += "Crew member: " + crew2 + "\n";
            else if (i == 3) result += "Crew member: " + crew3 + "\n";
            else if (i == 4) result += "Crew member: " + crew4 + "\n";
            i++;
        }
        return result;
    }

    // Exercise 10: "Ticket Inspection!"
    public static String ticketInspection() {
        String result = "";
        String passengerTicket1 = "Rose";
        String passengerTicket2 = "Invalid";
        String passengerTicket3 = "Jack";
        String passengerTicket4 = "Invalid";
        String passengerTicket5 = "Molly";
        int i = 1;
        do {
            if (i == 1 && !passengerTicket1.equals("Invalid")) {
                result += "Passenger boarding: " + passengerTicket1 + "\n";
            } else if (i == 2 && !passengerTicket2.equals("Invalid")) {
                result += "Passenger boarding: " + passengerTicket2 + "\n";
            } else if (i == 3 && !passengerTicket3.equals("Invalid")) {
                result += "Passenger boarding: " + passengerTicket3 + "\n";
            } else if (i == 4 && !passengerTicket4.equals("Invalid")) {
                result += "Passenger boarding: " + passengerTicket4 + "\n";
            } else if (i == 5 && !passengerTicket5.equals("Invalid")) {
                result += "Passenger boarding: " + passengerTicket5 + "\n";
            }
            i++;
        } while (i <= 5);
        return result;
    }

    // Exercise 11: "The Dining Hall Seating Plan"
    public static String diningHallSeatingPlan() {
        String result = "";
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 4; col++) {
                result += "Table " + row + " Seat " + col + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display results for each exercise
        displayResult("All Aboard!", allAboard());
        displayResult("Lifeboat Log", lifeboatLog());
        displayResult("Customize the Lifeboats!", customizeLifeboats(scanner));
        displayResult("Dinner Menu Disaster", dinnerMenu());
        displayResult("Overpriced Tickets", overpricedTickets(scanner));
        displayResult("Dramatic Stair Climbing", stairClimbing());
        displayResult("The Endless Buffet", endlessBuffet());
        displayResult("Ship Horn Countdown", shipHornCountdown());
        displayResult("Crew Roll Call", crewRollCall());
        displayResult("Ticket Inspection", ticketInspection());
        displayResult("Dining Hall Seating Plan", diningHallSeatingPlan());

        // Close scanner
        scanner.close();
    }
}
