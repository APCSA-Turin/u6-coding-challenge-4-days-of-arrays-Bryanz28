
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ 
        String[][] niceNaughty = new String[2][names.length];
        Random rand = new Random();
        for(int i=0;i<names.length;i++){
            int choice = rand.nextInt(2);
            niceNaughty[choice][i]=names[i];

        }
        return niceNaughty;
    }

    public static void main(String[] args) {

    }
}