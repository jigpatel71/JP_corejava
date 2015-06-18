package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingUsingComparable {

	public static void main(String[] args) {

		List<Employee> empList = createAndSortEmployees();

        for (int i = 0; i < empList.size(); i++) {
			Employee emp=(Employee) empList.get(i);
			System.out.println("Emp details before sort: " + emp.getId() + " "+emp.getName()+" "+emp.getYearsOfExp());
		}

		Collections.sort(empList);
		
        for (int i = 0; i < empList.size(); i++) {
			Employee emp=(Employee) empList.get(i);
			System.out.println("Emp details after sort: " + emp.getId() + " "+emp.getName()+" "+emp.getYearsOfExp());
		}
	
	}
	
	public static List<Employee> createAndSortEmployees() {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee empObj1 = new Employee(8,"Joe", 5);
		Employee empObj2 = new Employee(5,"Bill", 2);
		Employee empObj3 = new Employee(2,"Dave",7);
		Employee empObj4 = new Employee(1,"Mike", 3);

		empList.add(empObj1);
		empList.add(empObj2);
		empList.add(empObj3);
		empList.add(empObj4);
		empList.add(new Employee(3,"Jones",9));
		
		return empList;
	}
	
	
}
