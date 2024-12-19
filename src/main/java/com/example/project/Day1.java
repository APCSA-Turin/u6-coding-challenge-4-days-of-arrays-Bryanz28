package com.example.project;
import java.util.Random;

public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.equals(null)||name.equals("")) {
           throw new IllegalArgumentException("Name cannot be null or empty");
        }
        Random rand = new Random();
        int idx = rand.nextInt(5);
        return elf_names[idx]+name;  
    }
}