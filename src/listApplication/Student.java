public class Student {
	private String firstName;
	private String lastName;
	private float stuGPA;
	private Address [] addresses;
	
	private int count = 0;

	public Student(String fn, String ln, float gpa) {
		firstName = fn;
		lastName = ln;
		stuGPA = gpa;
		addresses = new Address[3];
	}

	public void setfirstName(String fn) {
		firstName = fn;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String ln) {
		lastName = ln;
	}

	public void setstuGPA(float gpa) {
		stuGPA = gpa;
	}

	public float getstuGPA() {
		return stuGPA;
	}
	
	
	public void addAddress(Address address) {
		if(count < 3) {
			addresses[count] = address;
			count++;
		}
	}

	public Address [] getAddresses() {
		return this.addresses;
	}
	
	@Override
	public String toString() {
		String allAddresses = "";
		for(int i = 0; i < 3; i++) {
			allAddresses = allAddresses + addresses[i] + "\n";
		}
		return "First name: " + firstName + " \nLast name: " + lastName + " \nGPA: " + stuGPA + "\nAddresses: \n" + allAddresses;
	}
}
