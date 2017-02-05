import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alamproge1_2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static double toCm (double inches) {
		return inches * 2.54;
	}

	static double toInch(double cm) {
		return cm / 2.54;
	}

	static double toMile (double km) {
		return km / 1.609344;
	}

	static double toKm (double mile) {
		return mile * 1.609344;
	}

	static double round (double number, int spaces) {
		return Math.round(number*Math.pow(10.0, spaces))/Math.pow(10.0, spaces);
	}

	static String askInput (String question) {
		System.out.println(question);
		try {
			String output = br.readLine();
			return output;
		} catch (Exception exception) {
			return "Invalid input";
		}
	}

	public static void main(String[] arg) {
		System.out.println("Centimeters to inches = cmtoinch");
		System.out.println("Inches to centimeters = inchtocm");
		System.out.println("Kilometers to miles = kmtomile");
		System.out.println("Miles to kilometers = miletokm");
		String choice = askInput("Feel free to choose one of the options mentioned above");
		if (choice.equals("cmtoinch")) {
			String amount = askInput("How many centimeters would you like to convert?");
			double amnt = Double.parseDouble(amount);
			System.out.println(amnt+"cm = "+round(toInch(amnt), 2)+"inches");
		} else if (choice.equals("inchtocm")) {
			String amount = askInput("How many inches would you like to convert?");
			double amnt = Double.parseDouble(amount);
			System.out.println(amnt+"inches = "+round(toCm(amnt), 2)+"cm");
		} else if (choice.equals("kmtomile")) {
			String amount = askInput("How many kilometers would you like to convert?");
			double amnt = Double.parseDouble(amount);
			System.out.println(amnt+"km = "+round(toMile(amnt), 2)+"miles");
		} else if (choice.equals("miletokm")) {
			String amount = askInput("How many miles would you like to convert?");
			double amnt = Double.parseDouble(amount);
			System.out.println(amnt+"miles = "+round(toKm(amnt), 2)+"km");
		} else {
			System.out.println("Unknown conversion type.");
		}
	}
}

/*
java Alamproge1_2
Centimeters to inches = cmtoinch
Inches to centimeters = inchtocm
Kilometers to miles = kmtomile
Miles to kilometers = miletokm
Feel free to choose one of the options mentioned above
cmtoinch
How many centimeters would you like to convert?
2.54
2.54cm = 1.0inches
*/
