
public class Constructor{
		
		 int EmployeeId;
		 String EmployeeName;
		 String Department;
		 float Salary;
			
		 public Constructor() {
		  EmployeeId=13;
		  EmployeeName="Kumar";
		  Department="Sales";
		  Salary=25000;
		 }
			
		 public Constructor(int EmployeeId,String EmployeeName,String department,float salary) {
		  this.EmployeeId=EmployeeId;
		  this.EmployeeName=EmployeeName;
		  this.Department=department;
		  this.Salary=salary;
		 }
			
		 public void display() {
		  System.out.println("Id of the Employee: "+EmployeeId);
		  System.out.println("Name of the Employee: "+EmployeeName);
		  System.out.println("Department : "+Department);
		  System.out.println("Salary : "+Salary);
		  System.out.println();
		  
		 }
			
		 public static void main(String[] args) {
		  
		  Constructor e= new Constructor();
		  Constructor e1= new Constructor( 31, "Rohit", "Trainee", 50000); 

		  e.display();
		  e1.display();	   
			
		 }

}
