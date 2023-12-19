package task;

//Parent Class member
class Members

{
	//Variables
	String Name;
	int Age;
	String Address;
	int Salary;
	
	//Method Print details
	public void printdetails()
	{
		System.out.println("Name : "+Name +"\nAge : "+Age +"\nAddress : "+Address +"\nSalary : "+Salary);
	}
	
}

//Child class 1 worker inherits Members
class Worker extends Members
{
	String Specialization;
}

//Child class 2 Manager inherits Worker
class Manager extends Members
{
	String Department;
}

public class Company {

	public static void main(String[] args) {
		
		//Object
		Worker w=new Worker();
		w.Name="John";
		w.Age=33;
		w.Address="Leo";
		w.Salary=50000;
		w.printdetails();	
		
		w.Specialization="Python";
		System.out.println("\nSpecialization : "+w.Specialization);

		
		//object for manager
		Manager m=new Manager();
		m.Department="Development";
		System.out.println("\nDepartment : "+m.Department);
		
		

	}

}
