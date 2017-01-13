package com.codebind;

public class Converter {


    public static void main(String[] args) {


        // Hex to Dec und umgekehrt

/*
        System.out.println("Eingabe hexadezimalzahl:");
        System.out.println("Berechnung Hexadezimal zu Dezimal:" + decToHex() + ".");



        System.out.println("Eingabe Dezimalzahl:");
        System.out.println("Berechnung Dezimal zu Hexadezimal:" + hexToDec() + ".");



        // Binär zu Hexadezimal

        System.out.println("Eingabe Binär:");
        System.out.println("Berechnung Binär zu Hexadezimal " + binToHex() + ".");


        // Hexadezimal zu Binär

        System.out.println("Eingabe Hexadezimal:");
        System.out.println("Berechnung Hexadezimal zu Binär: " + hexToBin() + ".");

        // Binär zu Dezimal

        System.out.println("Berechnung Binär zu Dezimal:");
        System.out.println("Berechnung Binär zu Dezimal: " + binToDec() + ".");

        // Dezimal zu Binär
        System.out.println("Berechnung Dezimal zu Binär:");
        System.out.println("Berechnung Dezimal zu Binär: " + decToBin() + ".");

*/
    }

    public static String decToHex(String s)
    {
        int i = Integer.parseInt(s);
        String hex = Integer.toHexString(i);
        return hex.toUpperCase();
    }


    public static String hexToDec(String s)
    {
        String dec = Integer.toString(Integer.parseInt(s,16));
        return dec;
    }


    public static String binToHex(String s)
    {
        String hex = Integer.toHexString(Integer.parseInt(s,2));
        return hex.toUpperCase();
    }

    public static String hexToBin(String s)
    {
        String binary = Integer.toBinaryString(Integer.parseInt(s,16));
        return binary;
    }


    public static String decToBin(String s)
    {
        int i = Integer.parseInt(s);
        String binary = Integer.toString(i,2);
        return binary;
    }


    public static String binToDec(String s)
    {
        String dec = Integer.toString(Integer.parseInt(s,2));
        return dec;
    }
}
