
public class LambdaExpression {

	public static void main(String[] args) {
		Employee x = new Employee(1001,50000);
		Employee y = new Employee(1002,25000);
		/*Testable t=(Employee a,Employee b)->{
			if(a.getSalary()>b.getSalary())
			{
				return b;
			}
		};*/
		//System.out.println(t.test(x,y));
	}

}

interface Testable
{
	Employee test(Employee x, Employee y);
}

class Employee
{
	int empId;
	int salary;
	Employee(int a, int b)
	{
		empId=a;
		salary = b;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return empId+" "+salary;
	}
}
