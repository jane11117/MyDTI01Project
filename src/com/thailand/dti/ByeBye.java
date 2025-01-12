/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thailand.dti;

import java.util.Scanner;

/**
 *
 * @author IT306PC
 */
public class ByeBye {
    public static void main(String[] args) {
        //สร้างตัวแปร varible => ชนิดข้อมูล ชื่อตัวแปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float bouble
        double yourSalary;
        
        //รับค่า input โดยใช้ Scanner จะสร้างตัวแทนของ Scanner ขึ้นมา
        //เรียกว่า Object
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        yourName = sc.next();
        System.out.print("Enter your age: ");
        yourAge = sc.nextInt();
        System.out.print("Enter your salary: ");
        yourSalary = sc.nextDouble();
        System.out.println("-------------------------");
        System.out.println("Hi..." + yourName);
        System.out.println("You are" + yourAge + "years old");
        System.out.println("Your salary is" + yourSalary + "Bath");
    }
}
