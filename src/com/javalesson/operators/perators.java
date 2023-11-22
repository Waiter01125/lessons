package com.javalesson.operators;

public class perators {
    public static void main(String[] args) {
        // + - / * \
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double q = a % b;


        // a = a + 5;
        // a += 5;
        ++a;
        //     System.out.println("Now a = " + a);

        --b;
        //      System.out.println("Now b = " + b);

        double n = 7;
        double m = 7;

        double res1 = 2 * n++;
        double res2 = 2 * ++m;

        //    System.out.println("Res1 = " + res1);
        //    System.out.println("Res2 = " + res2);

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = n == m;

        System.out.println("BoolVal = " + boolVal);

        boolean boolVal2 = y > z;

        boolean resulBoolean = boolVal || boolVal2;

        System.out.println("resulBoolean = " + resulBoolean);

        int res = (x < y) && (z < y) ? x : y;

        System.out.println("Ternaty res = " + res);

        System.out.println("NOT = "+!(x<y));


    }
}
