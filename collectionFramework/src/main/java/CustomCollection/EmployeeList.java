package CustomCollection;

import java.util.ArrayList;

import model.Employee;

//import model.Employee;

public class EmployeeList {
	ArrayList<Employee> emp;
	
	
	public EmployeeList(int n){
		emp = new ArrayList<Employee>(n);
	}

	public void indexOf(Employee e){
		emp.indexOf(e);
	}

	public boolean add(Employee e)
	{
		 return emp.add(e);
	}
	

	public void add(int i, Employee e) {
		emp.add(i, e);
	}

	public Employee remove(int i){
		return emp.remove(i);
		//return null;
	}

	public void remove(Employee e){
		emp.remove(e);
	}

	public void dispaly() {
		for(int i=0;i<emp.size();i++) {
			Employee e=emp.get(i);
			System.out.println("\nEMPLOYEE-"+(i+1)+"\n"+"NAME:- "+e.getName()+"\nAGE:- "+e.getAge()+"\nSALARY:- "+e.getSalary()+"\nADDRES:- "+e.getAddress());
		}
		
	}
	
	public void size() {
		
		System.out.println("\nthe Employee list SIZE is:- "+emp.size()+"\n");
		
	}

	
}
