
public abstract class Person 
{
	private String FirstName;
	private String FamilyName;
	private String BirthDate;
	private int height; // inches
	
	public Person(String FirstName, String FamilyName, String BirthDate, int height)
	{
		this.FirstName = FirstName;
		this.FamilyName = FamilyName;
		this.BirthDate = BirthDate;
		this.height = height;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public String getFamilyName() {
		return this.FamilyName;
	}

	public String getBirthDate() {
		return this.BirthDate;
	}

	public int getHeight() {
		return this.height;
	}

	@Override
	public String toString() {
		return "Person First Name: " + getFirstName() + ", Family Name: " + getFamilyName() + ", Birth date: "
				+ getBirthDate() + ", Height: " + getHeight();
	}
}
