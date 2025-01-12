/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thailand.dti;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author IT306PC
 */
public class WowWow {
    public static void main(String[] args) throws IOException {
        //สร้างตัวแปร varible => ชนิดข้อมูล ชื่อตัวแปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float bouble
        double yourSalary;
        
        //รับค่า input โดยใช้ Scanner จะสร้างตัวแทนของ Scanner ขึ้นมา
        //เรียกว่า Object
        InputStreamReader input = new   InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        
        System.out.print("Enter your name: ");
        yourName = reader.readLine();
        System.out.print("Enter your age: ");
        yourAge = Integer.parseInt(reader.readLine());
        System.out.print("Enter your salary: ");
        yourSalary = Double.parseDouble(reader.readLine());
        System.out.println("-------------------------");
        System.out.println("Hi..." + yourName);
        System.out.println("You are" + yourAge + "years old");
        System.out.println("Your salary is" + yourSalary + "Bath");
    }
    
}
 