package com.javaleson;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876_876_543L;

        float myFloatValue = 23.56f;
        double myDoubleValue = 56.45;

        double sum = a + c + b + myLongValue + myFloatValue + myDoubleValue;

        float floatResult = myFloatValue / 2;
        System.out.println("float =" + floatResult);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00A6';

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + " some other string";
        System.out.println(s);

        System.out.println("Characters");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);

        System.out.println(char1 + char2 + char3 + char4 + char5);

        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);
        System.out.println("double sum = " + sum);

        short someShort = b;
        int someInt = someShort;
        someShort = (short) someInt;

        System.out.println();
        someInt = (int) myLongValue;
        System.out.println("someInt = " + someInt);
        System.out.println("someShort = " + someShort);

        double someLongToDouble = myLongValue;
        System.out.println("someLongDouble = " + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong = " + someDoubleToLong);


    }
}