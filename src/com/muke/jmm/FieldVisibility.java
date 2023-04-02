package com.muke.jmm;

public class FieldVisibility {

    int a = 1;
    int b = 2;

    private void change() {
        a = 3;
        b = a;
    }

    private void print() {
        System.out.println("b=" + b + ";a=" + a);
    }

    public static void main(String[] args) {

    }
}
