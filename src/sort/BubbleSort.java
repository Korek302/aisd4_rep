package sort;

import java.util.List;

public class BubbleSort implements ListSorter<Cat>
{

	public List<Cat> sort(List<Cat> list)
	{
		for(int i = 1; i < list.size(); i++)
			for(int left = 0; left < list.size()-i; left++)
			{
				int right = left + 1;
				if(list.get(left).compareTo(list.get(right)) > 0)
				{
					swap(list, left, right);
				}
			}
		return list;
	}
	
	public void swap(List<Cat> list, int left, int right)
	{
        Cat temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }
	
}
