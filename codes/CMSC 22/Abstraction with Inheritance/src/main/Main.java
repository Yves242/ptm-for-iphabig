package main;
import ticketingsystempackage.*;
import vehiclepackage.*;

// Main class
public class Main {
		
	// main thread to be run
    public static void main(String[] args) {
		
    	// make new ticketing system
        TicketingSystem ticketingSystem1 = new TicketingSystem();

        // Adding Buses
        System.out.println("Adding more buses...");
        ticketingSystem1.addBus(new Bus("BUS123", 40));
        ticketingSystem1.addBus(new Bus("BUS456", 50));
        ticketingSystem1.addBus(new Bus("BUS789", 60));

        // Adding Taxis
        System.out.println("Adding more taxis...");
        ticketingSystem1.addTaxi(new Taxi("TAXI123", 4));
        ticketingSystem1.addTaxi(new Taxi("TAXI456", 4));
        ticketingSystem1.addTaxi(new Taxi("TAXI789", 4));
        ticketingSystem1.addTaxi(new Taxi("TAXI321", 4));
        ticketingSystem1.addTaxi(new Taxi("TAXI654", 4));

        // Attempting to add more than the maximum allowed
        System.out.println("\nAdding beyond what is allowed by the system...");
        ticketingSystem1.addBus(new Bus("BUS000", 30)); // Should print an error
        ticketingSystem1.addTaxi(new Taxi("TAXI000", 4)); // Should print an error

        // Display all vehicles
        System.out.println("\n\nPrinting all vehicle information...");
        ticketingSystem1.showVehicles();
        
        
        
        
        // Exploitation test :P
        
        // Scenario: You bought a taxi..
        Taxi myTaxi = new Taxi("XKD433", 5);
        
        // Issue: FOR SOME REASON, it has license plate. Nakaw? IDK. 
		// Of course you want to change the license plate.
        // question is: Kaya bang baguhin using code below?
		// take note: this is NOT a private variable.
//        myTaxi.licensePlate = "OMG123";        
        
    }
}
