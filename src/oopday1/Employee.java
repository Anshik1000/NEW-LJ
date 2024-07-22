package oopday1;

public class Employee {
	private String EmployeeName;
	private int EmployeeID;
	private String Desgination;
	private int Salary;
	private String EmailID;
	
	Employee(String EmployeeName,int EmployeeID,String Desgnation,String EmailID){
		this.EmployeeName = EmployeeName;
		this.EmployeeID = EmployeeID;
		this.Desgination= Desgnation;
		this.EmailID = EmailID;
	}
	
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getDesgination() {
		return Desgination;
	}
	public void setDesgination(String desgination) {
		Desgination = desgination;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeID=" + EmployeeID + ", Desgination=" + Desgination
				+ ", Salary=" + Salary + ", EmailID=" + EmailID + "]";
	}
	
	

}
