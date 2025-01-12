/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dti.operator;

/**
 *
 * @author IT306PC
 */
public class Km1OPT {
    //Operator ตัวดำเนินการ
    public static void main(String[] args) {
        
        System.out.println(10 + 7);
        System.out.println(10 - 7);
        System.out.println(10 * 7);
        System.out.println(10 / 7);
        System.out.println(10.0 / 7);
        System.out.println(10 / 7.0);
        System.out.println(10 % 7); //Mod หารเอาเศษ
        //Comparation == != < <= > >=
        //เปรียบเทียบได้แต่ Number
        System.out.println(10 > 7);
        System.out.println(10 < 7);
        System.out.println(10 == 7);
        System.out.println(10 != 7);
        //System.out.println("Mod">"Mee"); Error
        System.out.println('A' > 'c');
        System.out.println("-----------------------------------------");
        //Logical !(not) &&(and) ll(or) ใช้กับค่าที่เป็น boolean (true/false)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("-----------------------------------------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("-----------------------------------------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

    }
    
}
