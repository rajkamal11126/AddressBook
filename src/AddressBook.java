import java.util.Scanner;

public class AddressBook {
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
	}

}
