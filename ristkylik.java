import java.util.Scanner;
class ristkylik {
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Sisesta ristkyliku pikkus:");
	   double pikkus = scanner.nextDouble();
	   System.out.println("Sisesta ristkyliku laius:");
	   double laius = scanner.nextDouble();
	   //Korrutan küljed omavahel;
	   double pindala = pikkus*laius;
	   System.out.println("ristkyliku pindala on:"+pindala);
   }
}