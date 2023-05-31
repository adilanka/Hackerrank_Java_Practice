
public class PersonDemo {

	public static void main(String[] args) {
		Person policeman;
		policeman = new Person();
		Person subinspector;
		subinspector = policeman;
		policeman.name = "ABCD";
		policeman.age = 45;
		System.out.println(policeman.name);
		System.out.println(policeman.age);
		System.out.println(subinspector.name);
		System.out.println(subinspector.age);
	}

}

class Person
{
	String name;
	int age;
}