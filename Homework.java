import java.util.Scanner; 

public class Homework{
	
	public static float triangleSurface(float a, float b){
		
		float s = (a * b)/2;
		
		return s;
			
	}
	
	public static void main(String[] args){
		
		float a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = scan.nextFloat();
		System.out.print("Enter b: ");
		b = scan.nextFloat();
		float s = triangleSurface(a, b);
		System.out.println("Triangle's surface is: "+s);
		
	}
	
}