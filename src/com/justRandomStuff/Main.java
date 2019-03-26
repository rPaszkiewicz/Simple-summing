package com.justRandomStuff;

import java.util.*;

public class Main {

    public static void main(String[] args)  {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter numbers to sum:");

        while(reader.hasNextLine()) {
            String num = reader.nextLine();
            String num1 = num.replaceAll("\\s","");
            int sum =0;
            if (num.length()<2)
                continue;
            for (int i=0; i<num1.length(); i++) {
                sum+=Character.getNumericValue(num1.charAt(i));
            }
            System.out.println(sum);
            //break;
        }
    }
}










































