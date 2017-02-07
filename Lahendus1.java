import java.util.Scanner;
public class Lahendus1{
	public static float ristkylikuS(float a, float b){
		float S = a * b;
		return S;
	}
		
		
	
	public static void main(String[] args){
		float a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sisesta ristkyliku esimene kylg[cm]: ");
		a = scan.nextFloat();
  		System.out.print("Sisesta teine kylg [cm]: ");
  		b = scan.nextFloat();
        float S = ristkylikuS(a, b);
  		System.out.println("Ristkyliku pindala on "+S+" ruutsentimeetrit");
	}
}