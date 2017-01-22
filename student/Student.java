import java.util.Scanner;

public class Student {

	private int rollNo;
	private String Name;
	private float Cmarks;
	private float JavaMarks;
	private Scanner sc = new Scanner(System.in);
	public void getValue()
	{
		System.out.println("Roll No : ");
		rollNo = sc.nextInt();
		System.out.println("C marks : ");
		Cmarks = sc.nextFloat();
		System.out.println("Java marks : ");
		JavaMarks = sc.nextFloat();
		System.out.println("Name : ");
		Name = sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Roll No : " + rollNo);
		System.out.println("Name : "+Name);
		System.out.println("C Marks : "+Cmarks);
		System.out.println("Java Marks : "+JavaMarks);
	}
	public int getRoll()
	{
		return rollNo;
	}
}
