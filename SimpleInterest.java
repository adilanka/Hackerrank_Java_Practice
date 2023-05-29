
public class SimpleInterest {
	public static void main(String[] args)
	{
		double p = 10000;
		double t = 1.5;
		double r = 5;
		double si = SI1(p,t,r);
		System.out.println("Simple Interest is: "+ si);
		System.out.println("Simple Interest is: "+ SI1());
	}
	static double SI1(double x, double y, double z)
	{
		double a = x*y/100*z;
		return a;
	}
	static double SI1()
	{
		double p = 10000;
		double t = 1.5;
		double r = 5;
		double a = p*(r/100)*t;
		return a;
	}
}
