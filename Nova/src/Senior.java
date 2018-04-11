
public class Senior extends Ricercatori {
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
}
