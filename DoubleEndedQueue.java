import java.util.Deque;
import java.util.ArrayDeque;
public class DoubleEndedQueue {

	public static void main(String[] args) {
		Deque<String> names = new ArrayDeque<>();
		names.add("Apple");
		names.add("Dog");
		names.add("Bone");
		names.add("Pen");
		names.add("Speakers");
		
		System.out.println(names);
		
		names.remove("Bone");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names.remove(2));
		}

}
