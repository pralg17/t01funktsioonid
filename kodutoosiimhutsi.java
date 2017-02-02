public class kodutoosiimhutsi{
    static double tundideks(double minutid){
            return minutid/60;
    }

    static double minutiteks(double tunnid){
        return tunnid*60;
    }

    public static void main(String[] args) {
        System.out.println(tundideks(360)+" tundi");
        System.out.println(minutiteks(6)+" minutit");

    }
}
