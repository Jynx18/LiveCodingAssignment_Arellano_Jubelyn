/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellanojubelyn1;
import java.util.Scanner;
/**
 *
 * @author Arellano_CPE113
 */
public class ArellanoJubelyn1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Odd or Even");
        System.out.println("2. Triangle");
        System.out.print("Choice:  ");
        int choice = input.nextInt();
        
        if (choice == 1){
             System.out.println("Odd or Even");
        System.out.print("Enter a number: ");
        int a = oddOrEven(input.nextInt());
        System.out.println("Result: " + a);
        } else if (choice == 2){
            System.out.println("Triangle");
            
            System.out.println("Enter first side: ");
            int z = input.nextInt();
            
            System.out.println("Enter second side: ");
            int x = input.nextInt();
            
            System.out.println("Enter third side: ");
            int c = input.nextInt();
            
            System.out.println("Result: " + classifyTriangle(z,x,c));
        } else
            System.out.println(" Invalid choice.");
            
    }

    static int oddOrEven(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        } 
    }
    
    static int classifyTriangle(int z, int x, int c){
        if ( z <= 0 || x <= 0 || c <= 0 || 
                z + x <= c || z + c <= x ||x + c <= z   ){
            return 0;
        }else if (z == x && x == c){
            return 1;
        } else if(z == x || z == c || x == c ){
            return 2;
        } else {
            return 3;
        }
    }
    
}

