public class Funktsioon{
	public static double mass(double v, double t){
		double mass = 0;
		mass = v*t;
		return mass;
	}
	
	public static void main(String[] args){
		System.out.println("Entered surface gravity, density and volume seperated by spaces.");
		double gravityModifier = Double.parseDouble(args[0]);
		double density = Double.parseDouble(args[1]);
		double volume = Double.parseDouble(args[2]);
		double MassI = Double.parseDouble(args[3]);
		double weightHelp = mass(density, volume);
		double massOnPlanet = weightHelp*gravityModifier;
		if (MassI>0){
			System.out.println("Item mass is "+MassI);
			System.out.println("Item mass on the body is "+MassI*gravityModifier);
		}else{
			System.out.println("Item mass is "+weightHelp);
			System.out.println("Item mass on the body is "+massOnPlanet);
		}
	
		
	}
	
}

//[krisveen@greeny t01funktsioonid]$ java Funktsioon 0.3 0 0 86
//Entered surface gravity, density and volume seperated by spaces.
//Item mass is 86.0
//Item mass on the body is 25.8
//[krisveen@greeny t01funktsioonid]$ java Funktsioon 0.3 50 50 0
//Entered surface gravity, density and volume seperated by spaces.
//Item mass is 2500.0
//Item mass on the body is 750.0

//Mercury - 0.38
//Venus - 0.9 
//Earth's moon - 0.16 
//Mars - 0.38 
//Jupiter - 2.36 
//Saturn - 1.08 
//Uranus - 0.8  
//Neptune - 1.12 
//Pluto - 0.05 