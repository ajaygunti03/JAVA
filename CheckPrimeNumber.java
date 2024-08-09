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
public class CheckPrimeNumber 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number to check : ");
        int number = scanner.nextInt();
        int i=2;
        while(i<number)
        {
            if(number%i==0)
            {
                boolean isPrime = false;
                break;
            }
            i++;
        }
        {
            if(isPrime==false)
                System.out.println(number+" is not a Prime number");
            else
                System.out.println(number+" is a Prime number");
    }
    
}

/*import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 1) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
*/