package java8stream.test;

public class Employee {

	private int salary;
	private String name;
	private int age;

	
	public Employee(int salary, String name, int age) {
		super();
		this.salary = salary;
		this.name = name;
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	

}
