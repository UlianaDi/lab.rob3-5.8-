package com.company;

public class first {
    public static void main(String[] args) {
        int i = 30;
        if (i > 50) {
            if (i < 100) {
                System.out.println("Число " + i + " є на проміжку (50;100)");
            }
        }
        if (i < 50) {
            System.out.println("Число " + i + " відсутнє на проміжку (50;100)");
        }
        if (i > 100) {
            System.out.println("Число " + i + " відсутнє на проміжку (50;100)");
        }
    }
}







