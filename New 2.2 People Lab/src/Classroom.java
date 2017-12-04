
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
				//final value of pos shows the greatest index students[i] should be
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
			// In case there is already a stored value in pos, 
			// we place the next equal value in front b/c pos shows the greatest index student[i] should be;
			else
			{
				while (sorted[pos] != null)
				{
					pos = pos - 1;
				}
				sorted[pos] = students[i];
			}
			// resetting value of pos for the next students[i]
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
