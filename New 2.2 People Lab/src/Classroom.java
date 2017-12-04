
public class Classroom 
{
	private Person[] students;
	private Person teacher;
	
	public Classroom(Person[] students, Person teacher)
	{
		
		this.students = sortStudents(students); //sortStudents(students); 
		this.teacher = teacher;
	}
	
	public Person[] sortStudents(Person[] students) 
	{
		Person[] sorted = new Person[students.length];
		int pos = students.length - 1;
		//String results = " ";
		for (int i = 0; i < students.length; i++)
		{
			int i2 = 0;
			while (i2 < students.length)
			{
				String a = students[i].getFamilyName();
				String b = students[i2].getFamilyName();
				if (a.compareTo(b) < 0)
				{
					pos--;
				}
				i2++; 
			}
			if (sorted[pos] == null)
			{
				sorted[pos] = students[i];
			}
			else
			{
				while (sorted[pos] != null)
				{
					pos = pos - 1;
				}
				sorted[pos] = students[i];
			}
			pos = students.length -1;
		}
		return sorted;
	}
	
	public String getSubject()
	{
		if (this.teacher instanceof Teacher)
		{
			return ((Teacher)this.teacher).getSubject();
		}
		return null;
	}
	
	public double classAverage()
	{
		double aggregate = 0;
		int i = 0;
		while(i < this.students.length)
		{
			if (this.students[i] instanceof Student)
			{
				aggregate+= ((Student)this.students[i]).getGPA();
				i++;
			}
		}
		return aggregate / this.students.length;
	}
	
	public String printClass()
	{
		String result = ((Teacher)this.teacher).toString() + 
						" \nSubject: " + ((Teacher)this.teacher).getSubject() + 
						" \nStudents in class:";
		int i = 0;
		while(i < this.students.length)
		{
			result += "\n" + this.students[i].toString();
			i++;
		}
		return result;
	}
}
