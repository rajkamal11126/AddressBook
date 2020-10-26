import java.util.Scanner;

public class TestBook {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		String input, s;
		int cs;
		while (true) {
			System.out.println("enter 1 for person detail");
			System.out.println("enter 2 for edit");
			System.out.println("enter 3 for exit");
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
				System.exit(0);
			}
		}
	}

}
