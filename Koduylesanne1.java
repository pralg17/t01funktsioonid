public class Koduylesanne1{
	public static void main(String[] args){
            int pikkus = Integer.parseInt( args[0] );
            int laius = Integer.parseInt( args[1] );
            double diagonaaliSuurus = 0;

            diagonaaliSuurus = diagonaal( pikkus, laius );
            System.out.println( diagonaaliSuurus );
	}

    public static double diagonaal( double a, double b ) {
        double ruutudeSumma = Math.pow( a, 2 ) + Math.pow( b, 2 );

        if ( ruutudeSumma < 0 ) {
            System.out.println( "vastus puudub" );

            return 0;
        }

        return Math.sqrt( ruutudeSumma );
    }
}
