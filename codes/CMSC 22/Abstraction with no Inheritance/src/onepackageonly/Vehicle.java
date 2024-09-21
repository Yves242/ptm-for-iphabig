package onepackageonly;

// abstract class for BOTH Bus and Taxi
public abstract class Vehicle {
	
	// variables
    protected String licensePlate;
    protected int capacity;

    // constructor
    public Vehicle(String licensePlate, int capacity) {
        this.licensePlate = licensePlate;
        this.capacity = capacity;
    }

    // abstract method (IMPLEMENTED by CHILDREN)
    public abstract double calculateFare(int distance);
    public abstract void printInformation();
}
