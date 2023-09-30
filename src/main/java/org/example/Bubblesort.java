package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] myarray= {4, 1, 8, 2, 5, 3};
        bubblesort(myarray);

        System.out.println(Arrays.toString(myarray));
    }

    private static void bubblesort(int[] myarray) {
        for (int i = myarray.length- 1; i > 0;  --i){
            for (int j = 0 ; j < i ; ++ j) {

                if (myarray[j] > myarray[j + 1]) {
                    int temp = myarray[j];
                    myarray[j] = myarray[j+1];
                    myarray[j+1] = temp;
                }
            }
        }

    }
}