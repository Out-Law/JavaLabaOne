package com.company;

import java.util.Arrays;

public class createPhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String res = "(" + Integer.toString(numbers[0]) + Integer.toString(numbers[1]) + Integer.toString(numbers[2])+
            ") " + Integer.toString(numbers[3]) + Integer.toString(numbers[4]) + Integer.toString(numbers[5])+ "-" +
                Integer.toString(numbers[6]) + Integer.toString(numbers[7]) + Integer.toString(numbers[8]) +
                 Integer.toString(numbers[9]);
        return res;
    }

    public static void main(String[] args)
    {
        String res = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(res);
    }


}



