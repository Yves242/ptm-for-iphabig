package vehiclepackage;

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
    
    // SETTER METHOD 1 (for license plate)
    public void setLicensePlate(String licensePlate) {
    	this.licensePlate = licensePlate;
    }
    
    
    // GETTER METHOD 1 (for license plate)
    public String getLicensePlate() {
    	return this.licensePlate;
    }
    

    // abstract method (IMPLEMENTED by CHILDREN)
    public abstract double calculateFare(int distance);
    public abstract void printInformation();
}
