import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alamproge1 {
	
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
	
	static double counter (int count) {
		return count++;
	}
	
	public static void main(String[] arg) {
		System.out.println("Choose your conversion:");
		System.out.println("Centimeters to inches = cmtoinch");
		System.out.println("Inches to centimeters = inchtocm");
		System.out.println("Kilometers to miles = kmtomile");
		System.out.println("Miles to kilometers = miletokm");
		try {
			String to = br.readLine();
			if (to.equals("inchtocm")) {
				System.out.println("How many inches would you like to convert?");
				try {
					String amount = br.readLine();
					double amnt = Double.parseDouble(amount);
					System.out.println(amnt+"inches = "+round(toCm(amnt), 2)+"cm");					
				} catch (Exception e) {
					System.out.println("Not a number");
				}
			} else if (to.equals("cmtoinch")) {
				try {
					System.out.println("How many centimeters would you like to convert?");
					String amount = br.readLine();
					double amnt = Double.parseDouble(amount);
					System.out.println(amnt+"cm = "+round(toInch(amnt), 2)+"inches");
				} catch (Exception e) {
					System.out.println("Not a number");
				}
			} else if (to.equals("kmtomile")) {
				try {
					System.out.println("How many kilometers would you like to convert?");
					String amount = br.readLine();
					double amnt = Double.parseDouble(amount);
					System.out.println(amnt+"km = "+round(toMile(amnt), 2)+"miles");
				} catch (Exception e) {
					System.out.println("Not a number");
				}
			} else if (to.equals("miletokm")) {
				try {
					System.out.println("How many miles would you like to convert?");
					String amount = br.readLine();
					double amnt = Double.parseDouble(amount);
					System.out.println(amnt+"miles = "+round(toKm(amnt), 2)+"km");
				} catch (Exception e) {
					System.out.println("Not a number");
				}
			} else {
				System.out.println("Uknown conversion type");
			}
		} catch (Exception e) {
			System.out.println("Unknown conversion type");
		}
	}
}

/*
java Alamproge1
Choose your conversion:
Centimeters to inches = cmtoinch
Inches to centimeters = inchtocm
Kilometers to miles = kmtomile
Miles to kilometers = miletokm
miletokm
How many miles would you like to convert?
1
1.0miles = 1.61km
*/