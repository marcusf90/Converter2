package com.codebind;

public class Converter {

    private String s;

    public static void main(String[] args) {

    }


   // public Converter() {     this.s = hexToBin(s);    }


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
