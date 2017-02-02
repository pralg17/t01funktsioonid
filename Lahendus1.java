import java.util.Scanner;
public class Lahendus1{
	public static int korrutis(int[] m){
		int korruta = 1;
		for (int i=0; i<m.length; i++){
			korruta = m[i] * korruta;
		}
		return korruta;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Mitu arvu soovite korrutada?");
		
		int numbrid = input.nextInt();
		int jada[]=new int[numbrid];
		
		System.out.println("Sisestage arvud ("+ numbrid +" tuki.)");
		for (int i=0; i<jada.length; i++){
			jada[i] = input.nextInt();
		}
		int kokku = korrutis(jada);
		System.out.println("Arvude korrutis on "+kokku);
	}
}