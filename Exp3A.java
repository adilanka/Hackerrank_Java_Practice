
public class Exp3A {

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setName("Aditya Lanka");
		System.out.println(s.getName());
		System.out.println(s.getGPA());
		System.out.println(s.getId());
		System.out.println(s.toString());
		
		Undergrad u = new Undergrad();
		u.setName("Karthik");
		u.setYear(2);
		System.out.println(u.getName());
		System.out.println(u.getGPA());
		System.out.println(u.getId());
		System.out.println(u.getYear());
		System.out.println(u.toString());
		
		Graduate g = new Graduate();
		g.setName("Alexis");
		g.setThesisTitle("ABCD");
		System.out.println(g.getName());
		System.out.println(g.getGPA());
		System.out.println(g.getId());
		System.out.println(g.getThesisTitle());
		System.out.println(g.toString());
	}

}

class Student
{
	private String name;
	private String id;
	private int gpa;
	
	public String getName()
	{
		return name;
	}
	public int getGPA()
	{
		return gpa;
	}
	public String getId()
	{
		return id;
	}
	public void setName(String s)
	{
		name=s;
	}
	public String toString()
	{
		return "Name: "+name+"\nID: "+id+"\nGPA: "+gpa+"\n";
	}
}

class Undergrad extends Student
{
	private int year;
	
	public void setYear(int y)
	{
		year = y;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return "Name: "+this.getName()+"\nID: "+this.getId()+"\nGPA: "+this.getGPA()+"\nYear: "+year+"\n";
	}
}

class Graduate extends Student
{
	private String thesisTitle;
	
	public void setThesisTitle(String t)
	{
		thesisTitle = t;
	}
	public String getThesisTitle()
	{
		return "Thesis Title: "+thesisTitle;
	}
	public String toString()
	{
		return "Name: "+this.getName()+"\nID: "+this.getId()+"\nGPA: "+this.getGPA()+"\nThe thesis title is: "+thesisTitle+"\n";
	}
}