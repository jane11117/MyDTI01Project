/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydti01project;

//คลาสใดๆ ที่อยู่ใน java.lang ไม่จำเป็นต้อง import
//import java.lang.System;
//import java.lang.Sring;

/**
 *
 * @author IT306PC
 */
public class Sawasdee {
    public static void main(String[] args) {
        //sout แล้วกด TAB
        //แสดง String คือ ตัวอักษรตั้งแต่ 1 ขึ้นไป
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.print("CCC");
        System.out.println("DDD");
        System.out.println("EEE");
        System.out.println("");
        //แสดง Numder
        System.out.println(123456);
        System.out.println(123.456);
        //แสดง Boolean
        System.out.println(true);
        System.out.println(false);
        //แสดง Character คือตัวอักษร 1 ตัว
        System.out.println('A');
        System.out.println('#');
        System.out.println('5');
        //----------------------------
        //แสดงข้อมูลประเภทปนกัน ให้ใช้เครื่องหมาย + ในการเชื่อม
        System.out.println("AAA"+123456+'X'+true+555+"BBB");
        System.out.println(10+10+"10"+10);
        System.out.println("10"+10+10+10);
    }
}
