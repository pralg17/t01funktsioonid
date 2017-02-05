/* See programm v2lja arvutab kaugus kahe punkti vahel tasapinnalises ristkoordinaatide susteemis */

import	java.util.Scanner; // input turned ON

public class kaugus {
	public static void main(String args[]) {
		
		double x1, y1, x2, y2, result;
		
	System.out.println ("Sisesta kaks esimesed punkti kordinaadid [x1 y1]: "); 
	Scanner in = new Scanner (System.in);
	x1 = in.nextDouble(); //v6ttame andmed kasutajalt
	y1 = in.nextDouble();
	
	System.out.println("Sisesta kaks teised punkti kordinaadid [x2 y2]: ");
	x2 = in.nextDouble();
	y2 = in.nextDouble();
	
	result = Math.sqrt(Math.pow(x2, 2) - Math.pow(x1, 2) + Math.pow(y2, 2) - Math.pow(y1, 2));
	
	if(x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
		
		System.out.println("Kaugus punktide vahel on: " + Math.abs(result) + " yhiku."); // Math.abs() arvutab valja absoluutne erinevus (vahe)
		
	} else {
		
		System.out.println("Kaugus punktide vahel on: " + result + " yhiku.");
	
	
  
		}
 
	}
	
} 

public class kaugus1 {
	static double kaugused(double x1, double y1, double x2, double y2) {
		if(x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
			
		return Math.abs(Math.sqrt(Math.pow(x2, 2) - Math.pow(x1, 2) + Math.pow(y2, 2) - Math.pow(y1, 2)));
		
	} else {
		return Math.sqrt(Math.pow(x2, 2) - Math.pow(x1, 2) + Math.pow(y2, 2) - Math.pow(y1, 2));
  }
 }	
	public static void main (String args[]) {
	System.out.println("Kaugus punktide vahel on: " + kaugused(-1,-4,3,4) + " yhiku"); 
	
	}
}