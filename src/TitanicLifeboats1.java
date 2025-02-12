import java.util.Scanner;
import java.util.Random;

public class TitanicLifeboats1 {

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
            //MISSING FROM HERE
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
            //MISSING
            result += "MISSING";
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
        //MISSING while loop
        {
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
        //CORRECT Iterate through 5 courses
        for (int course = 14; course <= 57; course++) {
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
        //MISSING for loop. Iterate through all passangers.
        {
            //result += "Passenger " + j + ": $" + price + "\n";
            //price += 100;
        }
        return result;
    }

    // Exercise 6: "Dramatic Stair Climbing"
    public static String stairClimbing() {
        String result = "\n--- Dramatic Stair Climbing ---\n";
        //MISSING for loop. Iterate through 10 steps, counting down
        //MISSING Add each step to the string.
        result += "Elegant Arrival!\n";
        return result;
    }

    // Exercise 7: "The Endless Buffet"
    public static String endlessBuffet() {
        String result = "\n--- The Endless Buffet ---\n";
        for (int dessert = 1; dessert <= 7; dessert++) {
            result += "Dessert " + dessert + " taken.\n";
        }
        //MISSING Add a final message
        return result;
    }

    // Exercise 8: "Ship Horn Countdown"
    public static String shipHornCountdown() {
        String result = "\n--- Ship Horn Countdown ---\n";
        //MISSING for loop
        //MISSING Add each string to the message
        //MISSING
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
            //MISSING FROM HERE
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
        //MISSING do while
        {
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
        } //MISSING while
        return result;
    }

    // Exercise 11: "The Dining Hall Seating Plan"
    public static String diningHallSeatingPlan() {
        String result = "";
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 4; col++) {
                //MISSING result message
                result += "MISSING" + "\n";
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
