package entities;

// Esta classe tem como objetivo criar os objetos do tipo "Employee", onde serão registradas as informações dos 
// funcionários.
public class Employee {
	
	String name;
	Integer hours;
	Double valuePerHour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public double payment() {
		return valuePerHour * hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public String toString() {
		return name 
			+ " - $" 
			+ String.format("%.2f",payment());
	}
}
