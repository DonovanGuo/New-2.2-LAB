
public class Teacher extends Person
{
	private String subject;
	private String title; //Mr, Ms, Mx, Mrs
	
	public Teacher(String FirstName, String FamilyName, String BirthDate, int height, String subject, String title)
	{
		super(FirstName, FamilyName, BirthDate, height);
		this.subject = subject;
		this.title = title;
	}

	public String getSubject() {
		return this.subject;
	}
	
	public String getTitle()
	{
		return this.title;
	}

	@Override
	public String toString() {
		return "Teacher:" + getTitle() + getFamilyName();
	}
}
