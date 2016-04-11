package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestFullySorted
{
	public static void main(String[] args)
	{
		List<Cat> l = new ArrayList<Cat>();
		Random generator = new Random();

		int lowerLimit = 0;
		int upperLimit = 100;
		int quantity = 1000;
		
		upperLimit = upperLimit - lowerLimit + 1;
		
		for(int i = 0; i < quantity; i++)
		{
			l.add(new Cat(generator.nextInt(upperLimit)+lowerLimit, "Pers"));
		}
				
		//gapArray1
		int gapArray1quantity = 0;
		for(int i = 1; i < quantity; i = 3*i+1)	//tutaj
		{
			gapArray1quantity++;
		}
		int[] gapArray1 = new int[gapArray1quantity];
		int temp1 = 0;
		for(int i = gapArray1quantity-1; i >= 0; i--)
		{
			temp1 = 3*temp1+1;					//tutaj
			gapArray1[i] = temp1;
		}
	
		//gapArray2
		int gapArray2quantity = 0;
		for(int i = 1; i < quantity; i = 2*i+1)	//tutaj
		{
			gapArray2quantity++;
		}
		int[] gapArray2 = new int[gapArray2quantity];
		int temp2 = 0;
		for(int i = gapArray2quantity-1; i >= 0; i--)
		{
			temp2 = 2*temp2+1;					//tutaj
			gapArray2[i] = temp2;
		}
			
		//gapArray3
		int gapArray3quantity = 0;
		for(int i = 1; i < quantity; i = 8*i+1)	//tutaj
		{
			gapArray3quantity++;
		}
		int[] gapArray3 = new int[gapArray3quantity];
		int temp3 = 0;
		for(int i = gapArray3quantity-1; i >= 0; i--)
		{
			temp3 = 8*temp3+1;					//tutaj
			gapArray3[i] = temp3;
		}						
		
		//sorting
		ListSorter<Cat> ls = new ShellSort(gapArray1);
		l = ls.sort(l);
		System.out.println(l.toString());		
		
		//BubbleSort
		List<Cat> l1 = new ArrayList<Cat>(l);
		ListSorter<Cat> bubbleSorted = new BubbleSort();
		long startTime1 = System.nanoTime();
		l1 = bubbleSorted.sort(l1);
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("BubbleSort[ns]: "+totalTime1);
		
		//InsertSort
		List<Cat> l2 = new ArrayList<Cat>(l);
		ListSorter<Cat> insertSorted = new InsertSort();
		long startTime2 = System.nanoTime();
		l2 = insertSorted.sort(l2);
		long endTime2 = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println("InsertSort[ns]: "+totalTime2);

		//SelectSort
		List<Cat> l3 = new ArrayList<Cat>(l);
		ListSorter<Cat> selectSorted = new SelectSort();
		long startTime3 = System.nanoTime();
		l3 = selectSorted.sort(l3);
		long endTime3 = System.nanoTime();
		long totalTime3 = endTime3 - startTime3;
		System.out.println("SelectSort[ns]: "+totalTime3);
		
		//ShellSort1
		List<Cat> l4 = new ArrayList<Cat>(l);
		ListSorter<Cat> shellSorted1 = new ShellSort(gapArray1);
		long startTime4 = System.nanoTime();
		l4 = shellSorted1.sort(l4);
		long endTime4 = System.nanoTime();
		long totalTime4 = endTime4 - startTime4;
		System.out.println("ShellSort1[ns]: "+totalTime4);
		
		//ShellSort2
		List<Cat> l5 = new ArrayList<Cat>(l);
		ListSorter<Cat> shellSorted2 = new ShellSort(gapArray2);
		long startTime5 = System.nanoTime();
		l5 = shellSorted2.sort(l5);
		long endTime5 = System.nanoTime();
		long totalTime5 = endTime5 - startTime5;
		System.out.println("ShellSort2[ns]: "+totalTime5);
		
		//ShellSort3
		List<Cat> l6 = new ArrayList<Cat>(l);
		ListSorter<Cat> shellSorted3 = new ShellSort(gapArray3);
		long startTime6 = System.nanoTime();
		l6 = shellSorted3.sort(l6);
		long endTime6 = System.nanoTime();
		long totalTime6 = endTime6 - startTime6;
		System.out.println("ShellSort3[ns]: "+totalTime6);
	}
}
