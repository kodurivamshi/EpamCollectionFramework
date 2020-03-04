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
        Scanner scanner = new Scanner(System.in);
        EmployeeList emp = new EmployeeList(1);
        char ch='y',choice='y';
        int option,size,index;
        do {
        	System.out.println("select the option:-\n");
        	System.out.println("1.Add an employee \n 2.Insert the employee \n 3.Remove an employee \n 4.Details of Employee \n 5.Display the Employee list");
        	option=scanner.nextInt();
        	switch(option) {
        	case 1:
        		System.out.print("Enter the employee name :");
            	String name = scanner.next();
            	System.out.print("Enter the employee age :");
            	int age = scanner.nextInt();
            	System.out.print("Enter the employee salary :");
            	double salary= scanner.nextDouble();
            	System.out.print("Enter the employee address :");
            	String address= scanner.next();
            	Employee employee = new Employee(name,age,address,salary);
            	emp.add(employee);
            	break;
        	case 2:
        		System.out.print("Enter the employee name :");
            	name = scanner.next();
            	System.out.print("Enter the employee age :");
            	age = scanner.nextInt();
            	System.out.print("Enter the employee salary :");
            	salary= scanner.nextDouble();
            	System.out.print("Enter the employee address :");
            	address= scanner.next();
            	employee = new Employee(name,age,address,salary);
            	System.out.println("enter the position to insert the employee...\n");
            	int position=scanner.nextInt();
            	emp.add(position-1, employee);
            	System.out.println("successfulluy inserted...\n");
        		break;
        	case 3:
        		size=emp.size();
        		choice='y';
        		System.out.println("the NAMES of the employee:-\n");
        		for(index=1;index<=size;index++) {
        			Employee e=emp.getIndex(index);
        			System.out.println((index)+". "+e.getName()+"\n");
        		}
        		System.out.println("enter the index of particular employee to delete from the list");
        		index=scanner.nextInt();
        		emp.remove(index-1);
        		System.out.println("\nsuccessfully removed.....\n");
        		break;
        		
        	case 4:
        		size=emp.size();
        		choice='y';
        		System.out.println("the NAMES of the employee:-\n");
        		do {
        		for(index=1;index<=size;index++) {
        			Employee e=emp.getIndex(index);
        			System.out.println((index)+". "+e.getName()+"\n");
        		}
        		System.out.println("enter the index of particular employee to see the details:-\n");
        		index=scanner.nextInt();
        		Employee e=emp.getIndex(index);
        		System.out.println("\n"+"NAME:- "+e.getName()+"\nAGE:- "+e.getAge()+"\nSALARY:- "+e.getSalary()+"\nADDRES:- "+e.getAddress());
        		System.out.println("\ndo want to see any other employee details(y/n)?\n");
        		choice=scanner.next().charAt(0);
        		}while(choice=='y');
        		break;
        	case 5:
        		emp.dispaly();
        	}
        	System.out.println("\ndo u want to continue those opeartions(y/n)?\n");
        	ch=scanner.next().charAt(0);
        }while(ch=='y'||ch=='y');
    }
}
