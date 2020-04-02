/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberscalc;
 import java.util.Scanner;
/**
 *
 * @author emanismail
 */
public class numbersCalc {
       
   
        public static void main(String args[])
        {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
        sum= num1 - num2;
        System.out.println("Subtract of these numbers: "+sum);
        sum= num1 / num2;
        System.out.println("Division of these numbers: "+sum);
        sum= num1 * num2;
        System.out.println("Multiplicastion of these numbers: "+sum);
        
        }
    
}
