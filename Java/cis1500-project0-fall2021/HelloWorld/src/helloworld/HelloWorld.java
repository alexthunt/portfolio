/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What is your name?");
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine ();
        
        System.out.println("Hi there " + name);
        // TODO code application logic here
    }
    
}
