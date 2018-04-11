
public class Senior extends Ricercatori {
	
	public Senior(String id) {
		super(id);
	}

	Float bonus;

	public Float getBonus() {
		return bonus;
	}

	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
	
	public float getSalary(Float bonus, Float basicSalary) {
		return bonus + basicSalary;
	}

	@Override
	public String toString() {
		return "Senior [Nome=" + id + "]";
	}
	
	
}
