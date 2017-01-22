import java.util.Scanner;

public class studentDetails {

	private int noOfRecord;
	private Scanner sc = new Scanner(System.in);
	private Student obj[];
	public void getNoOfRecords()
	{
		System.out.println("Enter Number of records to be maintained");
		noOfRecord = sc.nextInt();
	}
	public Student[] getDetails()//taking the students details and returning the object value
	{
		 obj=new Student[noOfRecord];
		for(int i=0;i < noOfRecord;i++)
		{
			obj[i]=new Student();
			obj[i].getValue();		
		}
		return obj;
		
	}
}
