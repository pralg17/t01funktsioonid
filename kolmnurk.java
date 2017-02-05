public class kolmnurk{
	static double pythagor (double a, double b) {
		if (a > 0 && b > 0) {
		return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		} else {
			System.out.println("Peavad olema positiivsed arvud");
			return -1;
	 }
	}
	
	public static void main (String[] args) {
		
		System.out.println("Hyptenoosipikkus on: ", pythagor(2, 4));
	}
	
}

// vastus on: 4.47213595499958 
