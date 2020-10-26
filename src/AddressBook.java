import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
	ArrayList<PersonInfo> persons;

	public AddressBook() {
		persons = new ArrayList<PersonInfo>();
	}

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

	// method to delete person details
	public void deletePerson(String n) {
		// delete person record by name by iterating over array list
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.getName())) {
				p.print();
				persons.remove(i);
			}
		}
	}

	// method to check duplicate name
	public void checkDuplicate(String n) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.getName())) {
				p.print();
				System.out.println("Person name already exit");
			}
		}
	}

	// method to search by city name
	public void searchByCity(String c) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (c.equals(p.getCity())) {
				p.print();
			}
		}
	}

	// method to sort by state name
	public void sortByState(String s) {
		List<PersonInfo> sortedList = persons.stream().sorted(Comparator.comparing(PersonInfo::getState).reversed())
				.collect(Collectors.toList());

		sortedList.forEach(System.out::println);

	}

}
