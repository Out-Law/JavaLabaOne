package com.company;

import java.awt.geom.AffineTransform;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {
        String res = "";
        Boolean flag = true;
        int a = 0;
        int iTemp;

        for (int i = 0; i<arr.length; i++) {

            a = arr[i];
            iTemp = 0;
            res += Integer.toString(arr[i]);
            for (int j = i+1; j<arr.length; j++)
            {
                iTemp++;
                if(arr[i] != arr[j] - 1)
                {
                    if(iTemp == 1){
                        res += ",";
                    }
                    if(iTemp == 2){
                        res += "," + Integer.toString(arr[j-1]) + ",";
                    }
                    if(iTemp>2){
                        res += "-" + Integer.toString(arr[j - 1]) + ",";
                    }
                    j = arr.length;
                }
                else {
                    i++;
                    if(j == arr.length-1)
                    {
                        if(iTemp == 1){
                            res += "," + Integer.toString(arr[j]) + ",";
                        }
                        if(iTemp>1){
                            res += "-" + Integer.toString(arr[j]) + ",";
                        }
                    }
                }
            }
        }
        res = res.replaceAll(",$", "");
        return res;
    }

    public static void main(String[] args)
    {
        String res = rangeExtraction(new int[] {-6,-5,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20,22,23});
        System.out.println(res);
    }
}
