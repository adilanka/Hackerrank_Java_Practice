import java.util.*;

public class Exp4B {

	public static void main(String[] args) 
	{
		AList<Integer> h = new AList<Integer>();
		h.add(4);
		h.add(19);
		h.add(21);
		h.add(45);
		h.add(10);
		h.display();
		
		h.insert(0, 15);
		h.display();
		
		h.remove(2);
		h.display();
		
		h.appendAtEnd(88);
		h.display();
		
		h.deleteContent();
		h.display();
	}
}

class AList <T>
{
	private List<T> a = new ArrayList<>();
	
	public void add(T t)
	{
		a.add(t);
	}
	public void insert(int x,T t)
	{
		a.add(x,t);
	}
	public void remove(int x)
	{
		a.remove(x);
	}
	public void appendAtEnd(T t)
	{
		int x = a.size();
		a.add(x, t);
	}
	public void deleteContent()
	{
		a.removeAll(a);
	}
	public void display()
	{
		System.out.print("{ ");
		for(T element: a)
		{
			System.out.print(element+" ");
		}
		System.out.println("}");
	}
	
}
