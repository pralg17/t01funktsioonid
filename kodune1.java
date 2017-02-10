import java.util.Scanner;
import static java.lang.Math.pow;
class kodune {
	
	public static void main(String args[]) {
		
		ruutv();
	}
		
	public static void ruutv() {
		
		// ax2 + bx + c = 0
		System.out.println("See programm leiab ruutvõrrandi ax2 + bx + c = 0 lahendid");
		System.out.println("kirjuta X1");
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("kirjuta X2");
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("kirjuta C");
		Scanner scan3 = new Scanner(System.in);
		
		double a, b, c, x1, x2, d;
		
		a = scan1.nextDouble();
		b = scan2.nextDouble();
		c = scan3.nextDouble(); 
		
		//determinandi abil leian, kas on üldse lahendid või need puuduvad
		d = (pow(b, 2) - (4 * a * c));
		

		if (d >= 0) {
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
			System.out.println("X1 = " + x1);
			
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) ) / (2 * a);
			System.out.println("X1 = " + x2);
			
			} else {
				System.out.println("ülesandel puuduvad lahendid");
			}
	}
		
		
}
