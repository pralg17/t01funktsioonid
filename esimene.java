import java.util.Scanner;

public class esimene{
public static float varvikulu(float kulu, float pind) {
	
   float y= kulu * pind;
   return y;
  
 }

 
 public static void main(String[] args){
	 float a, b;
	 Scanner scan = new Scanner(System.in);
      System.out.println("Sisestage värvikulu m2 kohta: ");
      
	  a = scan.nextFloat();
	  
	  
	  System.out.println("Sisestage värvitava ruumi pindala(m2)");
	 b = scan.nextFloat();
	  
	  float x=varvikulu(a, b);

       System.out.println ("Toa värvimiseks kulub: "+ x +"liitrit värvi");
       
 }
}




