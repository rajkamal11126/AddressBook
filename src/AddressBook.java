import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	ArrayList<PersonInfo> persons;

	public AddressBook() {
		persons = new ArrayList<PersonInfo>();
	}
	//method to add details
	public void addPerson() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Enter your address");
		String add = scan.nextLine();
		System.out.println("Enter your phone number");
		Long pNum = scan.nextLong();
		System.out.println("Enter your city");
		String city = scan.nextLine();
		System.out.println("Enter your state");
		String state = scan.nextLine();
		System.out.println("Enter your zip");
		String zip = scan.nextLine();
		System.out.println("Enter your email");
		String email = scan.nextLine();
		
		// construct new person object
		PersonInfo p = new PersonInfo(name, add, pNum, city, state, zip, email);
		persons.add(p);
	}

	// method to edit the person details
	public void editPerson(String n) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.getName())) {
				p.print();
			}
		}
	}

}
