public class kodutoo1{

	public static int summa(int number1, int number2){
        //calculating number1 + number2;
        return number1 + number2;
	}
    public static int vahe(int number1, int number2){   //calculating number1 - number2;
        
		return number1 - number2;
		
	}
    public static int korruta(int number1, int number2){    //calculating number1 * number2;

		return number1 * number2;
		
	}
	public static double jaga(int number1, int number2){
        //calculating number1 / number2;
        return number1 / number2;
		
	}
		
	public static void main(String[] args){
		
		int number1 = 10;
		int number2 = 5;
		//Displaying the values
		System.out.println("number1 : "+number1);
		System.out.println("number2 : "+number2);
		System.out.println("summa : "+summa(number1, number2));
		System.out.println("vahe : "+vahe(number1, number2));
		System.out.println("korrutis : "+korruta(number1, number2));
		System.out.println("jagatis : "+jaga(number1, number2));
    }
}