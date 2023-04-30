
public class Car{

	private String model;
	private String make;
	private int year;
	
	Car(String model, String make, int year){
		this.model = model;
		this.make = make;
		this.year = year;
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
	
}
