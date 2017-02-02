public class Alamprogrammid{
    static double sentimeetriteks(double tollid) {
        return tollid * 2.54;
    }

    static double tollideks(double sentimeetrid) {
        return sentimeetrid / 2.54;
    }

    static double ymarda(double arv, int kohtadearv) {
        long factor = (long) Math.pow(10, kohtadearv);
        arv = arv * factor;
        long tmp = Math.round(arv);
        return (double) tmp / factor;
    }

    static double ymardaTsykliga(double arv, int kohtadearv) {
        double kordaja = 1;
        for(int i=0; i<kohtadearv; i++) {
            kordaja *= 10;
        }
        return Math.round(arv*kordaja)/kordaja;
    }

    public static void main(String[] args) {
        System.out.println(sentimeetriteks(0.5));
        System.out.println(Math.round(tollideks(3)));
        System.out.println(Math.round(tollideks(3)*100)/100.0);
        System.out.println(ymarda(tollideks(89237), 2));
        System.out.println(ymardaTsykliga(tollideks(89237), 2));
    }
}