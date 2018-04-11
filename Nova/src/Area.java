
public class Area {
	String id;
	Float lat;
	Float lng;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public Float getLng() {
		return lng;
	}
	public void setLng(Float lng) {
		this.lng = lng;
	}
	
	public Area(String id) {		
		this.id = id;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + "]";
	}
	
	
	
	
}
