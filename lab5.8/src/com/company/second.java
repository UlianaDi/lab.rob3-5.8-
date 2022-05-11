package com.company;

public class second {
    public static void main (String[] args){
        int a, b, c, d, i;;
        i = 750;
        a = i / 100;
        b = i / 10 % 10;
        c = i % 100 % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a>b){
            if (a>c){ System.out.println("Найбільше число : "+a); }
            else{ System.out.println("Найбільше число : "+c); }
        }
        else if (b>c){ System.out.println("Найбільше число : "+b); }
        else{ System.out.println("Найбільше число : "+c); }
    }
}

