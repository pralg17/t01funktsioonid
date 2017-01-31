public class Hello5 {
    public static void main(String[] args) {
		try{
	    int arv1=Integer.parseInt(args[0]);
		for(int i=0;i<arv1; i++){
		System.out.print("*");
		}
		} catch(ArrayIndexOutOfBoundsException veaandmed) {
			System.out.println("Kogus puudub");
		} catch(NumberFormatException veaandmed) {
			System.out.println(args[0]+ " pole arv");
		
			
		}
	}
}