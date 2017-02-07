public class kodutoo{
	public static void arvud(int a){
	if(a % 2 == 0) {
            System.out.println("Arv " + a + " paaris");
        } else {
            System.out.println("Arv " + a + " paaritu");
    }
}

    public static void main(String args[]) {
        int arv=Integer.parseInt(args[0]);
		arvud(arv);
    }
}