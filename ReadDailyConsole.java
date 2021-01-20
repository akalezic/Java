import java.util.Scanner;

public class ReadDailyConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Declares number of books variable
		int numBooks;
		int sum = 0;
		// Declares time variable
		int time = 0;
		int pagesPerDay = 0;
		int minutesRead = 0;
		System.out.println("How many books do you need to read?");
		// Takes user input for how many books the user needs to read
		numBooks = in.nextInt();
		// Creates array for book titles and array for number of pages reflecting how many books the user needs to read
		String[] titles = new String[numBooks+1];
		int[] pages = new int[numBooks+1];
		System.out.println("How long do you have to read them? (Format: months)");
		time = in.nextInt();
		System.out.println("Enter the titles of the books you need to read and press enter between titles:");
		int counter = 0;
		// takes in book titles with lines as the separators for each value that is entered into
		// each index in the array
		while (counter <= numBooks) {
			titles[counter] = in.nextLine();
			counter++;
		}
		System.out.println("Enter how many pages each book has: ");
		int index = 0;
		while (index < numBooks) {
			pages[index] = in.nextInt();
			index++;
		}
		for (int i = 0; i < pages.length; ++i) {
			sum = sum + pages[i];
		}
		int timeDays = 0;
		timeDays = time * 30;
		pagesPerDay = sum / timeDays;
		minutesRead = pagesPerDay / 2;
		System.out.println("You should read " + pagesPerDay + " pages per day in order to finish your books "
				+ "in " + time + " month(s).");
		System.out.println("This should take you approximately " + minutesRead + " minutes per day.");
	}

}
