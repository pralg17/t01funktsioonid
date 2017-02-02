import java.util.Scanner;

public class programm{
	
	public static String tervitus(){
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Sisesta oma nimi: ");
		s = in.nextLine();
		return ("Tere, "+s);
	}
	
	public static void main(String[] args){
		System.out.println(tervitus());
	}
	
}
/*
Sisesta oma nimi:
Greg
Tere, Greg
*/