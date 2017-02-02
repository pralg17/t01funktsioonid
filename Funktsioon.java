import java.util.Random;

public class Funktsioon{
	//funktsioon pseudojuhusliku arvu genereerimiseks
	public static int randomnum(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	public static void main(String[] args){
		System.out.println(randomnum(1, 10));
	}
}