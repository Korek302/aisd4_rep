package sort;

import java.util.List;

public class ShellSort implements ListSorter<Cat>
{
	int[] gapArray;
	
	public ShellSort(int[] gapArray)
	{
		this.gapArray = gapArray;
	}
	
	public List<Cat> sort(List<Cat> list)
	{	
		
		int size = list.size();
		int i = 0;
        do {   
        	
        	int gap = gapArray[i];
        	
        	for(int j = gap; j < size; j++)
        	{
        		int k = j;
        		Cat value=list.get(k);
        		while( k >= gap && value.compareTo(list.get(k-gap)) < 0)
        		{
        			list.set(k, list.get(k-gap));
        			k -= gap; 
        		}
        		list.set(k,value);
           }
        	
           i++;
           
        }while (i < gapArray.length);
        
        return list;
	}
	
}
