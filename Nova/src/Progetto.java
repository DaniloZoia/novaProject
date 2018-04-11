import java.util.ArrayList;

public class Progetto {
	String id;
	Team team;
	ArrayList ricercatori;
	
	
	
	public Progetto(String id) {
		this.id = id;
	}
	
	
	
	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public Team getTeam() {
		return team;
	}




	public void setTeam(Team team) {
		this.team = team;
	}




	public ArrayList getRicercatori() {
		return ricercatori;
	}




	public void setRicercatori(ArrayList ricercatori) {
		this.ricercatori = ricercatori;
	}




	@Override
	public String toString() {
		return "Progetto [id=" + id + "]";
	}

	
	
	
	
}
