package Epam.collectionFramework;


import java.util.Scanner;

import CustomCollection.EmployeeList;
//import model.Employee;
import model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "<------ Employee List ----->\n" );
        System.out.print("Enter the total number of employees :");
        Scanner sc = new Scanner(System.in);
        int no_of_employees = sc.nextInt();
        EmployeeList emp = new EmployeeList(no_of_employees);
        for(int index=0;index<no_of_employees;index++) {
        	System.out.print("Enter the employee- "+(index+1)+ " name :");
        	String name = sc.next();
        	System.out.print("Enter the employee- "+(index+1)+ " age :");
        	int age = sc.nextInt();
        	System.out.print("Enter the employee- "+(index+1)+ " salary :");
        	double salary= sc.nextDouble();
        	System.out.print("Enter the employee- "+(index+1)+ " address :");
        	String address= sc.next();
        	Employee employee = new Employee(name,age,address,salary);
        	emp.add(employee);

        }
        System.out.println("<-----The LIST is full----->\n");
        System.out.println("the Created EMPLOYEE list is (by add method):- \n");
        	emp.size();
        	emp.dispaly();
        
        System.out.println("The shrinking Employee list (by remove method):- \n");
        for(int index=no_of_employees-1;index>=0;index--) {
        	System.out.println("\nthe list after deletion is:-\n");
        	emp.remove(index);
        	emp.dispaly();
        	emp.size();
        }
        System.out.println("\n<-----The LIST is NULL----->\n");
    }
}
