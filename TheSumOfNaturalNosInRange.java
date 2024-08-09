/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package javaprogrames;

import java.util.Scanner;

/**
 *
 * @author Ajay Gunti
 */
/*public class TheSumOfNaturalNosInRange 
{
    public class print
    {
        logic()
        {
            for(int i=s;i<=n;i++)   
            {
                sum+=i;
            }
            System.out.println("The sum of natural No's in Range : "+sum);
            // Close the Scanner object
        }
    }
    public static void main (String[]args)
   {
       int sum =0;
       // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter Start: ");

        // Read the number entered by the user
        int s = scanner.nextInt();
        // Prompt the user to enter a number
        System.out.println("Enter  Range: ");

        // Read the number entered by the user
        int n = scanner.nextInt();
        print ajay = new print();
        ajay.logic();
        scanner.close();
   }
}*/
package javaprogrames;

import java.util.Scanner;

/**
 *
 * @author Ajay Gunti
 */
public class TheSumOfNaturalNosInRange 
{
    public static class Print 
    {
        public void logic(int s, int n) 
        {
            int sum = 0;
            for(int i = s; i <= n; i++)   
            {
                sum += i;
            }
            System.out.println("The sum of natural No's in Range : " + sum);
        }
    }
    public static void main (String[] args) 
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter Start: ");

        // Read the number entered by the user
        int s = scanner.nextInt();
        // Prompt the user to enter a number
        System.out.println("Enter Range: ");

        // Read the number entered by the user
        int n = scanner.nextInt();
        
        Print print = new Print();
        print.logic(s, n);
        
        // Close the Scanner object
        scanner.close();
    }
}