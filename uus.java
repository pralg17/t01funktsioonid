import java.util.Scanner; // et kasutaja saaks arve lisada, input
public class uus{
	public static void arvutus(){

		  int x, y, z;
		  System.out.println("Kirjuta kaks arvu, mida tahad liita: ");
		  Scanner in = new Scanner(System.in); // Scanner, et saaks katte inputi kasutaja kaest
		  x = in.nextInt();
		  y = in.nextInt();
		  z = x + y;
		  System.out.println("Arvute summa on: "+z);
	   }
	public static void main(String[] args){
		arvutus();
	}
}
