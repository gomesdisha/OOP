
import java.util.Scanner;
class Time
{
	int hour, minute, second;
	Time()
	{
		hour = 0;
		minute = 0;
		second = 0;
	}
	Time(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
	}
	
	void display()
	{
		System.out.println(hour+":"+minute+":"+second);	
	}
	
	void add(Time t1, Time t2)
	{
		Time t = new Time();
		t.second = t1.second + t2.second;
		t.minute = t1.minute + t2.minute + t.second/60;
		t.hour = t1.hour + t2.hour + t.minute/60;
		t.second = t.second%60;
        t.minute = t.minute % 60;
        t.hour = t.hour % 24;
		System.out.println(t.hour+":"+t.minute+":"+t.second);
	}
}

class AddTime
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter hour of t1:");
		int h = in.nextInt();
		System.out.println("Enter minute of t1:");
		int m = in.nextInt();
		System.out.println("Enter second of t1:");
		int s = in.nextInt();
		System.out.println("Enter hour of t2:");
		int h1 = in.nextInt();
		System.out.println("Enter minute of t2:");
		int m1 = in.nextInt();
		System.out.println("Enter second of t2:");
		int s1 = in.nextInt();
		
		Time t1 = new Time(h,m,s);
		Time t2 = new Time(h1,m1,s1);
		t1.display();
		t2.display();
		System.out.println("Resultant Time:");
		t2.add(t1,t2);
	}
}