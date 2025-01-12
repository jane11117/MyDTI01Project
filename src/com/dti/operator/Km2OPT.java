package com.dti.operator;

import java.util.Scanner;

public class Km2OPT {
    public static void main(String[] args) {
        //Ternary Opt. _____"_____:_____
        //เงื่อนไขที่ต้องพิสูจน์ ทำเมื่อเป็นจริง : ทำเมื่อเป็นจริง
        
        int score;
        Scanner sc = new Scanner(System.in);
        String result;
    
        System.out.println("----------------------------");
        System.out.println("  Program Check Age");
        System.out.println("----------------------------");
        System.out.println("Input your score: ");
        score = sc.nextInt();
        System.out.println("----------------------------");
        result = score >= 50 ? "Pass..." : "NOT Pass...";
        System.out.println("Result is" + result);
    }
    
}
