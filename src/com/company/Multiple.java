package com.company;

public class Multiple {
    private static Integer A;
    private static Integer B;

    public Multiple(int a, int b) {
        A = a;
        B = b;
    }

    public static int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public static int getB() {
        return B;
    }

    public void setB(int b) {
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
