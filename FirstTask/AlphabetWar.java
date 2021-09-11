package com.company;

import java.util.HashMap;

public class AlphabetWar {

    public static String alphabetWar(String fight) {
        String res = "";
        int finalNumberRight = 0;
        int finalNumberLeft = 0;

        HashMap<String, Integer> AlphabetRight = new HashMap<>();
        AlphabetRight.put("w", 4);
        AlphabetRight.put("p", 3);
        AlphabetRight.put("b", 2);
        AlphabetRight.put("s", 1);

        HashMap<String, Integer> AlphabetLeft = new HashMap<>();
        AlphabetLeft.put("m", 4);
        AlphabetLeft.put("q", 3);
        AlphabetLeft.put("d", 2);
        AlphabetLeft.put("z", 1);

        for (int i = 0; i < fight.length(); i++) {
            String s = fight.substring(0 + i, 0 + i+1);
            if(AlphabetLeft.containsKey(s) == true)
            {
                finalNumberLeft += AlphabetLeft.get(s);
            }
            if(AlphabetRight.containsKey(s) == true)
            {
                finalNumberRight += AlphabetRight.get(s);
            }
        }

        if (finalNumberLeft > finalNumberRight)
        {
            return "Right side wins!";
        }
        if (finalNumberLeft < finalNumberRight)
        {
            return "Left side wins!";
        }

        return "Let's fight again!";
    }


    public static void main(String[] args)
    {
        String res = alphabetWar("wwwwwwz");
        System.out.println(res);
    }
}
