import java.util.Scanner;
public class esimene{
	public static void ruudupindala(){
		Scanner lolo = new Scanner(System.in);
		System.out.println("Sisesta ruudu külg");
		int number = lolo.nextInt();
		System.out.println("Pindala:"+number*number);
 
	}
	public static void main(String[] args){
		ruudupindala();
	}
	if (ruudupindala < 0 ) {
             System.out.println( "Puudub" );
 	return 0;
}

/*
Sisesta ruudu külg
4
Pindala:16

*/
