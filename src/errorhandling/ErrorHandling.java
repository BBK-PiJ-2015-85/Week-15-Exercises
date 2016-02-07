package src.errorhandling;

public class ErrorHandling {
	public void launch() {
		String str;
		int result = 0;	
		int num = 0;
		int count = 0;
		boolean validInput = false;
		while (!validInput) {
			System.out.println("How many numbers would you like to enter?");
			try {
				num = Integer.parseInt(System.console().readLine());
				validInput = true;
			} catch (NumberFormatException ex) {
				System.out.println("What you entered was not an integer!");
			}
		}				
		while (num > 0) {
			try {
				System.out.println("Please enter a number: ");
				str = System.console().readLine();
				int tempInt = Integer.parseInt(str);
				result += tempInt;
				num--;
				count++;
			} catch (NumberFormatException ex) {
				System.out.println("What you entered was not an integer!");
			}
		}
		System.out.println("The average of your input is: " + result / count);
	}
	
	public static void main(String[] args) {
		ErrorHandling eh = new ErrorHandling();
		eh.launch();
	}
}