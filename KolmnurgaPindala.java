import java.util.Scanner; 
 
public class KolmnurgaPindala{
 	
	public static float triangleSurface(float a, float h){
 		float s = (a * h)/2;
		
 		return s;	
 	}
 	
	public static void main(String[] args){
 		
 		float a, h;
 		Scanner scan = new Scanner(System.in);
 		System.out.print("Sisesta a: ");
 		a = scan.nextFloat();
 		System.out.print("Sisesta h: ");
 		h = scan.nextFloat();
		float s = triangleSurface(a, h);
 		System.out.println("Kolmnurga pindala on: "+s);
 	}
} 