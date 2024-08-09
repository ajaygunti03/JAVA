/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrames;

/**
 *
 * @author Ajay Gunti
 */
import java.util.Scanner;
public class HelloName 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name Mowa:");
        String name = scanner.next();
        System.out.println("Hello "+name+" mowa");
    }
    
}
