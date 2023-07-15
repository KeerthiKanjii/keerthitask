package encapsulation;

public class Patient {

	private int id;
	private String firstName;
	private String Ssn;

	public int getId() {

		return id;
	}

	public Patient() {
		super();
		this.id = id;
		this.firstName = firstName;
		Ssn = getSsn();
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSsn() {
		return Ssn;
	}

	public void setSsn(String ssn) {
		Ssn = ssn;
	}

	public void setId(int id) {
		this.id = id;
	}
}
