import java.util.Scanner;

public class pindala{
	
	public static void main(String[] args){
		
		//alus ja kõrgus
		int alus = 0;
		int korgus = 0;
		
		int pindala = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Sisesta kolmnurga alus: ");
		alus = scanner.nextInt();
	
		System.out.println("Sisesta kolmnurga korgus: ");
		korgus = scanner.nextInt();

		pindala = (alus * korgus) / 2;
	
		System.out.println("Kolmnurga pindala on " + pindala);
	}

}