
public class Book {
	private String author;
	private String title;
	private int pages;
	private String refNumber;
	private int borrowed;
	private boolean courseText;
	
	public Book(String bookAuthor, String bookTitle, int pageCount,boolean CourseText)
	{
	author = bookAuthor;
	title = bookTitle;
	pages = pageCount;
	refNumber = "";
	courseText = Book.isCourseText(CourseText);
	}
	public void setRefNumber(String ref)
	{
		if(ref.length()<3)
			System.out.println("The length of the reference cannot be less than 3!!");
		else
			refNumber = ref;
	}
	public void borrow()
	{
		borrowed++;
	}
	private static boolean isCourseText(boolean CourseText)
	{
		if(CourseText)
			return true;
		else
			return false;
	}
	public String getAuthor()
	{
		return ("The author is: "+author);
	}
	public String getTitle()
	{
		return ("The title is: "+title);
	}
	public int getPages()
	{
		return pages;
	}
	public String getRefNumber()
	{
		return ("The reference number is: "+refNumber);
	}
	public int getBorrowed()
	{
		return borrowed;
	}
	public void printAuthor()
	{
		System.out.println('\n'+"The author of the book is: "+ author);
	}
	public void printTitle()
	{
		System.out.println('\n'+"The title of the book is: "+ title);
	}
	public void printDetails()
	{
		System.out.println("\nThe Title of the book is: "+title);
		System.out.println("The Author of the book is: "+author);
		System.out.println("The number of pages in the book is: "+pages);
		if (refNumber.length()>0)
			System.out.println("The reference number of the book is: "+refNumber);
		else
			System.out.println("ZZZ");
		System.out.println("The number of times the book is borrowed is: "+borrowed);
		if(courseText)
			System.out.println("The given book is a course book.");
		else
			System.out.println("The given book is not a course book");
	}
	public static void main(String[] args)
	{
		Book b = new Book("Song Shong","Omniscient Reader's Viewpoint",2706,false);
		Book b1 = new Book("Rick Rordon","Percy Jackson Part 1",574,false);
		b.setRefNumber("AL4917");
		b1.setRefNumber("AL");
		b.borrow();
		System.out.println(b.getAuthor());
		System.out.println(b.getTitle());
		System.out.println("The number of pages in the book is: "+b.getPages());
		System.out.println(b.getRefNumber());
		b.printDetails();
		b1.printDetails();
	}
}
