/*
Create a class Car with instance variables make, model, and year. Implement an instance block that initializes the instance variables to empty strings and 0 for year. Implement a parameterized constructor that sets the instance variables make, model,
and year. Implement an instance method getDescription() that returns a string with the format "{make} {model} ({year})".
Create a Car object with make "Kia", model "Seltos", and year 2023 and call the getDescription() method on it.

Expected output:
Kia Seltos 2023
*/
public class Car {
	private String make;
    private String model;
    private int year;

    // Instance block to initialize instance variables
    {
        make = "";
        model = "";
        year = 0;
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Instance method to get the car's description
    public String getDescription() {
        return make + " " + model + " (" + year + ")";
    }
	
	public static void main(String[] args) {
		
		//create an object to Car class by passing car details
		Car car1 = new Car("Kia", "Seltos", 2023);
		//call getDescription method and print results
		String description = car1.getDescription();
        System.out.println(description);  // Output: "Kia Seltos (2023)"

	}

}
