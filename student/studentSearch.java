import java.util.Scanner;

public class studentSearch {

	private Scanner sc = new Scanner(System.in);
	private int searchRollNo;
	private Student getObj[];
	private boolean flag;
	public studentSearch(Student obj[])
	{
		getObj = obj;
		searchRollNo = 0;
		flag = false;
	}
	/*studentSearch()
	{
		getObj=null;
		searchRollNo = 0;
		flag = false;
	}*/
	public void getSearchValue()
	{
		System.out.println("Enter the roll no to be searched");
		searchRollNo = sc.nextInt();
	}
	public void searchResult()
	{
		for(int i=0;i<getObj.length;i++)
		{
			if(getObj[i].getRoll()==searchRollNo)
			{
				getObj[i].displayDetails();
				flag = true;
				break;
			}
		}
		result();
	}
	public void result()
	{
		if(flag==false)
		{
			System.out.println("no records found");
		}
	}
}
