package sort;

import java.util.List;

public class InsertSort implements ListSorter<Cat>
{

	public List<Cat> sort(List<Cat> list)
	{	
		for(int i = 1; i < list.size(); i++)
		{
			int j;
			Cat value = list.get(i);
			for(j = i; j > 0 && value.compareTo(list.get(j - 1)) < 0; j--)
			{
				list.set(j, list.get(j - 1));
			}
			list.set(j, value);
		}
			
		return list;
	}	
}
