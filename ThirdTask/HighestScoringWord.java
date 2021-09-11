package com.company;

import java.util.HashMap;

public class HighestScoringWord {

    public static String high(String s) {
       String res = "";
       String alphabet = "abcdefghijklmnopqrstuvwxyz";
       HashMap<String, Integer> pointsAlphabet = new HashMap<>();
       String[] parts = s.split(" ");
       int temp = 0;
       int resNumber = 0;

       for (int i = 1; i<=26; i++)
       {
           pointsAlphabet.put(alphabet.substring(0+i-1,0+i), i);
       }

       for (int i = 0; i<parts.length; i++)
       {
           temp = 0;
           for (int j = 0; j<parts[i].length(); j++)
           {
               temp += pointsAlphabet.get(parts[i].substring(0+j,0+j+1));

               if(temp>0 && temp>resNumber)
               {
                   resNumber = temp;
                   res = parts[i];
               }
           }
       }

        return res;
    }

    public static void main(String[] args)
    {
        String res = high("man i need a taxi up to ubud");
        System.out.println(res);
    }
}
