package oopday1;

public class Mclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Dr Scooper",1,"Physicist","DrScooper@phd.com");
		System.out.println(emp1);
		emp1.setSalary(10000);
		System.out.println(emp1.getSalary());
	}

}
