/**
 * Created by henrysavi on 06/02/17.
 */
/*Jalgratta ülekandearvu kalkulaator*/
public class gear_ratio{

    public static void main(String[] arg) {

        if (arg.length > 1){
            System.out.println(Float.parseFloat(arg[0])/Float.parseFloat(arg[1]));
        }else{
            System.out.println("Sisesta arvud kujul:java ratio 40 14");
        }
    }
}