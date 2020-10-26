import java.util.Scanner;

public class TestBook {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		String input, s;
		int cs;
		
		// choices for edit delete and edit the details
		while (true) {
			System.out.println("enter 1 for person detail");
			System.out.println("enter 2 for edit");
			System.out.println("enter 3 for delete");
			System.out.println("enter 4 for exit");
			input = scan.nextLine();
			cs = Integer.parseInt(input);
			switch (cs) {
			case 1:
				ab.addPerson();
				break;
			case 2:
				System.out.println("Enter name to edit");
				s = scan.next();
				ab.editPerson(s);
				break;
			case 3:
				System.out.println("Enter name to delete");
				s = scan.next();
				ab.deletePerson(s);
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
