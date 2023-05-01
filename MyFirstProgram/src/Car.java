
public class Car{

	private String model;
	private String make;
	private int year;
	
	// Constructor methods:
	Car(String model, String make, int year){
		this.model = model;
		// or: this.setModel(model);
		this.make = make;
		this.year = year;
	}
	Car(Car copiedCar){
		this.copy(copiedCar);
	}
	
	// getter methods:
	void setModel(String newModel) {
		model = newModel;
	}
	void setMake(String newMake) {
		make = newMake;
	}
	void setYear(int newYear) {
		year = newYear;
	}
	
	// setter methods:
	String getModel() {
		return model;
	}	
	String getMake() {
		return make;
	}
	int getYear() {
		return year;
	}
	
	// copy method
	void copy(Car copiedCar) {
		this.setMake(copiedCar.make);
		this.setModel(copiedCar.model);
		this.setYear(copiedCar.year);
	}
	
}
