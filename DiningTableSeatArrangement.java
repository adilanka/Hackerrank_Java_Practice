public class DiningTableSeatArrangement{

// finding factorial
	public static long fact(int n) {
		if (n <= 1)
			return 1;
		return n * fact(n - 1);
	}

	public static long seatingArrangement(int R, int N) {
		int i = N / R;
		// finding combination
		long res = (fact(N) / (fact(N - i) * fact(i)));
		return res;
	}

	public static void main(String[] args) {
		System.out.println("The combination of arrangements for 2 tables and 3 people are: "+seatingArrangement(2, 3));
		System.out.println("The combination of arrangements for 2 tables and 5 people are: "+seatingArrangement(2, 5));
	}
}
