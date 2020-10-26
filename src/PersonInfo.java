
public class PersonInfo {
	private String name;
	private String address;
	private Long phoneNum;
	private String city;
	private String state;
	private String zip;
	private String email;

	// Standard setters
	public void setName(String sname) {
		name = sname;
	}

	public void setAddress(String saddress) {
		address = saddress;
	}

	public void setPhoneNum(Long sphoneNum) {
		sphoneNum = phoneNum;
	}

	public void setCity(String scity) {
		scity = city;
	}

	public void setState(String sstate) {
		sstate = state;
	}

	public void setZip(String szip) {
		szip = zip;
	}

	public void setEmail(String semail) {
		semail = email;
	}

	// standard getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getEmail() {
		return email;
	}

	public PersonInfo(String n, String a, Long p, String c, String s, String z, String e) {
		setName(n);
		setAddress(a);
		setPhoneNum(p);
		setCity(c);
		setState(s);
		setZip(z);
		setEmail(e);
	}

	// method to print the entities
	public void print() {
		System.out.println("name: " + name + "address: " + address + "phone no: " + phoneNum + "city: " + city
				+ "state: " + state + "zip: " + zip + "email: " + email);
	}

}
