/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrames;

/**
 * @author Ajay Gunti
 */
import java.util.Scanner;
public class SumOfFirstNNaturalNoS
{
    public static void main(String[] args) 
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the number entered by the user
        int number = scanner.nextInt();

        int sum=0;
		for(int i=0; i<= number;i++)
		{sum=sum+i;}
		System.out.println("The sum of First N natural No's : "+sum);

        // Close the Scanner object
        scanner.close();
    }
}
