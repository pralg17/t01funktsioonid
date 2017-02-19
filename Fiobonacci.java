package tund_2;

/**
 * Created by User on 02-Feb-17.
 */
public class Fiobonacci {

    static double Fiobon(int number)
    {

      if( number <= 1)
      {
          return number;
      }

        return Fiobon(number - 1) + Fiobon(number - 2);
    }

    public static void main(String[] args) {

      //  System.out.println(Fiobon(5));
        int number = 10;
        for (int i = 1; i < number;i++)
        {
            System.out.println(i + " " + Fiobon(i));
        }

    }
}
