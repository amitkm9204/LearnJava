
public class StudentMain {

	public static void main(String args[])
	{
		studentDetails obj  = new studentDetails();
		Student returnObj[];
		obj.getNoOfRecords();
		returnObj = obj.getDetails();
		studentSearch sobj = new studentSearch(returnObj);
		sobj.getSearchValue();
		sobj.searchResult();
	
	}
}
