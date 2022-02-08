package java8stream.test;

import java.util.*;

public class JavaWithStreamAPI {
	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<>();
		// Adding Employees
		employeesList.add(new Employee(7500, "Daniel", 35));
		employeesList.add(new Employee(500, "Justin", 69));
		employeesList.add(new Employee(2000, "Bavly", 34));
		employeesList.add(new Employee(900, "George", 26));
		employeesList.add(new Employee(670, "Mirna", 19));
		
		employeesList.stream()
		             .filter(e -> e.getSalary() > 1000)
		             .filter(e -> e.getName().startsWith("B") || e.getName().startsWith("D")) 
		             .filter(e -> e.getAge() > 30)		            		 
		             .forEach(System.out::println);
		
	}

}
