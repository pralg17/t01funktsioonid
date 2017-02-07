import java.util.Scanner;
public class eurosdollars{
	static double dollariteks(double eurod){
		return eurod*1.04;
	}
	static double naeladeks(double eurod){
		return eurod*0.84;
	}
	static double rubladeks(double eurod){
		return eurod*63.37;
	}
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Mitu eurot teil on?");
		float eurod = reader.nextInt();
		double dollarid=dollariteks(eurod);
		double naelad=naeladeks(eurod);
		double rublad=rubladeks(eurod);
		System.out.println(eurod+" eurot on "+dollarid+" dollarit, "+naelad+" naela ja "+rublad+" rubla");
		
	}
	
}

/*
PROGRAMM KÜSIB KASUTAJALT MITU EUROT NEIL ON JA VASTAB KASUTAJALE MITU DOLLARIT, NAELA JA RUBLA TAL ON
Mitu eurot teil on?
500
500.0 eurot on 520.0 dollarit, 420.0 naela ja 31685.0 rubla

*/