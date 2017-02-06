/*
Leiab kolmnurga pindala kasutades k6iki kolme kylge
*/
import java.util.Scanner; 
public class Lahendus1{
	public static float arvutus(float a, float b, float c){
		float umbermoot = a + b + c;
		float p = umbermoot/2;
		float s = (p-a)*(p-b)*(p-c);
		return s;
	}

	public static void main(String[] args){
		float a, b, c;
 		Scanner scan = new Scanner(System.in);
 		System.out.print("Sisesta esimene kulg [cm]: ");
 		a = scan.nextFloat();
 		System.out.print("Sisesta teine kulg [cm]: ");
 		b = scan.nextFloat();
 		System.out.print("Sisesta kolmas kulg [cm]: ");
 		c = scan.nextFloat();
 		float s = arvutus(a, b, c);
 		System.out.println("Kolmnurga pindala on "+(Math.round(Math.sqrt(s)))+" ruutsentimeetrit");
	}
}