/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author IT306PC
 */
public class BMIProject2 {
    
     public static void main(String[] args){
         String yourName;
         double yourWeight, yourHeight, yourBMI;
         
         Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#.0000");
         
         System.out.println("++++++++++++++++++++++");
         System.out.println("   BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.print("Input your name: ");
        yourName = sc.nextLine();
        System.out.print("Input your weight (kg): ");
        yourWeight = sc.nextDouble();
        System.out.print("Input your height (m): ");
        yourHeight = sc.nextDouble();
        System.out.println("++++++++++++++++++++++++++++++");

       yourBMI = yourWeight / Math.pow(yourHeight,2);
        System.out.println("BMI of" + yourName + "is" + df.format("yourBMI"));
        System.out.println("++++++++++++++++++++++++++++++");
       
}
}