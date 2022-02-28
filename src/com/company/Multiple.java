package com.itClassWork32.src.com.company;

public class Multiple {
    private static Integer A;
    private static Integer B;

    public Multiple() {
    }

    public static int getA() {
        return A;
    }

    public static void setA(int a) {
        A = a;
    }

    public static int getB() {
        return B;
    }

    public static void setB(int b) {
        B = b;
    }

    @Override
    public String toString() {
        return "Multiple{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
