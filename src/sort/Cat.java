package sort;

public class Cat implements Comparable<Cat>
{
	int age;
	String race;
	
	public Cat(int age, String race)
	{
		this.age = age;
		this.race = race;
	}

	public int compareTo(Cat compareCat)
	{
		int compareAge = compareCat.age;
		return this.age - compareAge;
	}
	
	public String toString()
	{
		return (/*race+*/" "+age+" ");
	}
}
