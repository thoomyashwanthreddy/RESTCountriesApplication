package main;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		getCountryCapital();
	}
	
	public static void getCountryCapital() {

		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the alpha numeric 2 or 3 digit code:");

			Controller controller = new Controller();
			String capital = controller.fetchCapitalCityBasedOnCode(input.nextLine());

			if (null != capital && !capital.isEmpty()) {
				System.out.println("Capital: " + capital);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getCountryCapital();
		}
	}
}