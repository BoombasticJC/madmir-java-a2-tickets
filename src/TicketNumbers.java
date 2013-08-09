import java.util.Scanner;
public class TicketNumbers {

	public static void main(String[] args) {
		int ticketNumber, stem, checkDigit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a 6 Digit Ticket Number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;
		
		while(checkDigit != stem % 7){
			System.out.println("NOT VALID");
			System.out.print("Try Again: ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
			
		}
			System.out.print("Vaild VAYCAY MODE!");

	}

}
