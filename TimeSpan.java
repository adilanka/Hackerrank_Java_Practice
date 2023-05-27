
public class TimeSpan {
	
	private double hours;
	private double minutes;
	public TimeSpan(int h, int m)
	{
		hours=h;
		if(m>59)
		{
			hours++;
			minutes = m-60;
		}
		else
		{
			minutes = m;
		}
	}
	public int getHours()
	{
		int x = (int) hours;
		return x;
	}
	public int getMinutes()
	{
		int y = (int) minutes;
		return y;
	}
	public void add(int h,int m)
	{
		hours=hours+h;
		minutes=minutes+m;
		if(minutes>59)
		{
			hours++;
			minutes=minutes-60;
		}
	}
	public void add(TimeSpan t)
	{
		hours = t.getHours()+this.getHours();
		minutes = t.getMinutes()+this.getMinutes();
		if(minutes>59)
		{
			hours++;
			minutes = minutes-60;
		}
	}
	public double getTotalHours()
	{
		double time = hours;
		double x = (minutes/60);
		return time+x;
	}
	public String toString()
	{
		int x = (int) hours;
		int y = (int) minutes;
		return (x+"h"+" "+y+"m");
	}
	public static void main(String[] args) 
	{
		TimeSpan t = new TimeSpan(2,90);
		TimeSpan t2 = new TimeSpan(3,15);
		System.out.println("Hours: "+t.getHours());
		System.out.println("Minutes: "+t.getMinutes());
		t.add(1, 45);
		t.add(t2);
		System.out.println("Hours: "+t.getHours());
		System.out.println("Minutes: "+t.getMinutes());
		System.out.println("Time in hours: "+t.getTotalHours());
		System.out.println("Time Span: "+t.toString());
	}

}
