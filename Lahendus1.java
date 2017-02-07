public class Lahendus1{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sisesta kolmnurga alus: ");
		alus = scanner.nextInt();
	
		System.out.println("Sisesta kolmnurga korgus: ");
		korgus = scanner.nextInt();

		pindala = (alus * korgus) / 2;
	
		System.out.println("Kolmnurga pindala on " + pindala);
	}
}
