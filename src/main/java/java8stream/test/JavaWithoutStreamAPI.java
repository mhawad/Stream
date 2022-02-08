package java8stream.test;

import java.util.*;

public class JavaWithoutStreamAPI {
	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<>();
		// Adding Employees
		employeesList.add(new Employee(7500, "Daniel", 35));
		employeesList.add(new Employee(500, "Justin", 69));
		employeesList.add(new Employee(2000, "Bavly", 34));
		employeesList.add(new Employee(900, "George", 26));
		employeesList.add(new Employee(670, "Mirna", 19));

		List<Employee> employeeFilteredList = new ArrayList<>();

		for (Employee employee : employeesList) {

			// filtering data of list
			if (employee.getSalary() > 1000 && employee.getAge() > 30 && employee.getName().startsWith("B")
					|| employee.getName().startsWith("D")) {
				employeeFilteredList.add(employee);

			}

		}
		for (Employee employee : employeeFilteredList) {
			System.out.println(employee.getName());

		}

	}

}
