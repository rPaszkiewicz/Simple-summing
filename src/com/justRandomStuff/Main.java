package com.justRandomStuff;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj podstawę");
        int num = reader.nextInt();
        System.out.println("Podaj wykładnik");
        int num1 = reader.nextInt();

        powering(num,num1);
    }

    public static void powering(int num, int num1){
        int pow = (int)Math.pow(num,num1);
        StringBuilder sb = new StringBuilder().append(pow);

        System.out.println(sb.substring(sb.length()-1));
    }
}



















































