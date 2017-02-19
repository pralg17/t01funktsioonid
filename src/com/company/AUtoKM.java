package com.company;

public class AUtoKM {
    /*
    Astronomical units to kilometers, and backwards.
     */

    static double auToKm(double au) {
        return au * 149597871;
    }

    static double kmToAu(double km) {
        return km / 149597871;
    }

    public static void main(String[] args) {
        double au = 3.5;
        double km = 523592547;
        if (args.length >= 2) {
            try {
                au = Double.parseDouble(args[0]);
                km = Double.parseDouble(args[1]);
            } catch (Exception e) {
                throw new IllegalArgumentException("One of the entered arguments was not a number.");
            }
        }
        System.out.printf("%.2f Astronomical Unit(s) is %.2f Kilometer(s) \n", 1.0, auToKm(1.0));

        System.out.printf("%.2f Astronomical Unit(s) is %.2f Kilometer(s) \n", au, auToKm(au));
        System.out.printf("%.2f Kilometers(s) is %.2f Astronomical Unit(s) \n", km, kmToAu(km));
    }
}

/* NO ARGUMENTS
1.00 Astronomical Unit(s) is 149597871.00 Kilometer(s)
3.50 Astronomical Unit(s) is 523592548.50 Kilometer(s)
523592547.00 Kilometers(s) is 3.50 Astronomical Unit(s)
 */

/* ARGUMENTS: 2.5 5485213
1.00 Astronomical Unit(s) is 149597871.00 Kilometer(s)
2.50 Astronomical Unit(s) is 373994677.50 Kilometer(s)
5485213.00 Kilometers(s) is 0.04 Astronomical Unit(s)
 */

/* ARGUMENTS: 554 U
Exception in thread "main" java.lang.IllegalArgumentException: One of the entered arguments was not a number!

 */