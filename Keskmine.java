public class Keskmine{

	public static int keskmine(int[] m){
		int abi=m[0];
		for(int i=1; i<m.length; i++){
			abi=abi+m[i];
		}
		return abi;
		
	}
	
	public static void main(String[] args){
	int[] vanused={27, 58, 20, 33, 47};
		int keskmine=keskmine(vanused);
		System.out.println("Keskmine vanus on "+keskmine/vanused.length);
	}
	
}