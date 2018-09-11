/*
对给定数组进行排序
*/

import java.util.*;
class ArraySort
{
	public static void main(String[] args)
	{
		int[] arr = {5,1,4,6,2,8,9};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

		int[] arr2 = {5,1,4,6,2,8,9,10,100};
		printArray(arr2);
		selectSort(arr2);
		printArray(arr2);

		int[] arr3 = {5,1,4,6,2,8,9,10,0};
		printArray(arr3);
		Arrays.sort(arr3);
		printArray(arr3);
	}

	public static void bubbleSort(int[] arr)
	{
		for (int x = 0; x < arr.length; x ++ )
		{
			for (int y = 0; y < arr.length-x-1; y ++)
			{
				if (arr[y] > arr[y+1])
				{
					swap(arr, y, y+1);
				}
			}
		}
	}

	public static void selectSort(int[] arr)
	{
		for (int x=0; x < arr.length-1; x ++)
		{
			for (int y=x+1; y< arr.length; y ++)
			{
				if (arr[x] > arr[y])
				{
					swap(arr, x, y);
				}
			}
		}
	}

	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (i == arr.length -1)
			{
				System.out.println(arr[i]);
				return;
			}
			System.out.print(arr[i]+ ", ");
		}
	}

	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}