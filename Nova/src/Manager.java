public class Manager {
	Float bonus;
	
	public float getSalary(Float basicSalary) {
		return basicSalary;
	}
	
	public Float getBonus() {
		return bonus;
	}
	
	public float getSalary(Float bonus, Float basicSalary) {
		return basicSalary + bonus;
	}

}
