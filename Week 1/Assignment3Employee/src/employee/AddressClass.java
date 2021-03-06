package employee;

public class AddressClass {
	
	private int aid;
	private String streetname;
	private int zip;
	
	public AddressClass(int aid, String streetname, int zip) {
		this.aid=aid;
		this.streetname=streetname;
		this.zip=zip;
		
	}
	
	
	public String toString() {
		return "[aid=" + aid + ", streetname=" + streetname + ", zip=" + zip + "]";
	}
}
