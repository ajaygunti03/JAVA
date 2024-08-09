/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrames;
import java.util.Scanner;
/**
 *
 * @author Ajay Gunti
 */
public class TheGreatestOfTheTwoNumbers 
{
  public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Two numbers to compare:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            if(a>b)
            {
                System.out.println(a+" is Greater Than " +b);
            }
            else
            {
                System.out.println(b+"is Greater Than" +a);
            }
        scanner.close();
    }
}
