import java.util.Scanner;
public class pudrucal{
	
	static double banaan(double kogus){
		return kogus*0.93;
	}	
	static double mesi(double kogus){
		return kogus*3.3;
	}
	static double kaerahelbed(double kogus){
		return kogus*3.5;
	}
	static double piim(double kogus){
		return kogus*0.52;
	} 
	
	public static void main(String[] arg){	
		Scanner reader = new Scanner(System.in);
		
        System.out.println("Mittu grammi banaani lisasite?");
        float n = reader.nextInt();
		
		System.out.println("Mittu grammi mett lisasite?");
        float m = reader.nextInt();
		
		System.out.println("Mittu grammi kaerahelbeid lisasite?");
        float s = reader.nextInt();
		
		System.out.println("Mittu grammi piima lisasite?");
        float p = reader.nextInt();
		
		System.out.println("Banaanist saad caloreid: "+banaan(n));
		System.out.println("Meest saad caloreid: "+mesi(m));
		System.out.println("Kaerahelvestest saad caloreid: "+kaerahelbed(s));
		System.out.println("Piimast saad caloreid: "+piim(p));
		System.out.println("Kokku on: "+(banaan(n)+mesi(m)+kaerahelbed(s)+piim(p))+" kcal");
	}
}