package objectExample;

public class CarClass {

    String make;
    String model;
    int year;

    // Constructor to initialize the object
    public CarClass(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

}
