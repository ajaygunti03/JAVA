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
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class SalaryProblem 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Employee salary : ");
        long salary = scanner.nextLong();
        long n=10000;
        if(salary>n)
        {
            salary=salary+2000;
            System.out.println("Employee salary after $2000 bonus : "+salary);
        }
        else
        {
            salary=salary+1000;
            System.out.println("Employee salary after $1000 bonus : "+salary);
        }
                
    }
    
}
