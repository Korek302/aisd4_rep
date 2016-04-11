package sort;

import java.util.List;

public class SelectSort implements ListSorter<Cat>
{

	public List<Cat> sort(List<Cat> list)
	{	
		for(int i = 0; i < list.size() - 1; i++)
		{
			int min = i;
			for(int j = i + 1; j < list.size(); j++)
				if(list.get(min).compareTo(list.get(j)) > 0)
					min = j;
			swap(list, i, min);
		}
		
			
		return list;
	}	
	
	void swap(List<Cat> list, int left, int right)
	{
        if (left != right)
        {
            Cat temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
        }
	}
}
