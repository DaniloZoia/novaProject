public class Manager {
	
	Float bonus;
	
	public Float getBonus() {
		return bonus;
	}

	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
	
	public float getSalary(Float basicSalary, Float bonus) {
		return basicSalary + bonus;
	}
	
	public Manager(String id) {
		super();
	}
	
	@Override
	public String toString() {
		String id = null;
		return "Senior [Nome=" + id + "]";
	}

}
