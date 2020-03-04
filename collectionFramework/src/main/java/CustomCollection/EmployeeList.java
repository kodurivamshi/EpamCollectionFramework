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
	
	public Employee getIndex(int index) {
		return emp.get(index-1);
	}
	
	public void dispaly() {
		for(int i=0;i<emp.size();i++) {
			Employee e=emp.get(i);
			System.out.println("\nEMPLOYEE-"+(i+1)+"\n"+"NAME:- "+e.getName()+"\nAGE:- "+e.getAge()+"\nSALARY:- "+e.getSalary()+"\nADDRES:- "+e.getAddress());
		}
	}
	
	public int size() {
		
		System.out.println("the Employee list SIZE is:- "+emp.size()+"\n");
		return emp.size();
	}

	
}
