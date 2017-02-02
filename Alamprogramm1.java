public class Alamproge1 {
	
	static double toCm (double inches) {
		return inches * 2.54;
	}
	
	static double toInch(double cm) {
		return cm / 2.54;
	}
	
	static double round (double number, int spaces) {
		return Math.round(number*Math.pow(10.0, spaces))/Math.pow(10.0, spaces);
	}
	
	public static void main(String[] arg) {
		if (arg.length == 2) {
			if (arg[0].equals("cm")) {
				try {
					double cm = Double.parseDouble(arg[1]);
					System.out.println(round(toCm(cm), 2));
				} catch (Exception ex) {
					System.out.println("Tegemist pole arvuga");
				}
			} else if (arg[0].equals("inch")) {
				try {
					double inch = Double.parseDouble(arg[1]);
					System.out.println(round(toInch(inch), 2));
				} catch (Exception ex) {
					System.out.println("Tegemist pole arvuga");
				}
			}
		} else {
			System.out.println("Käsurealt tuleb sisestada 2 argumenti -> esimesel kohal milleksteisendada soovid (cm/inch) ja teiseks kogus");
		}
	}
}

/*
java Alamproge1 cm 1
2.54
*/