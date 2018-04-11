public class Junior extends Ricercatori {

	public Junior(String id) {
		super(id);
	}

	@Override
	public String toString() {
		return "Junior [Nome=" + id + "]";
	}
	
	public float getSalary(Float basicSalary) {
		return basicSalary;
	}
	
	
}
