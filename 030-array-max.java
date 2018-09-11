/*
给定一个数组{4,56,8,9,0,4,3,2,56,7,98};获取最大值及最小值
*/

class ArrayMaxDemo
{
	public static void main(String[] args)
	{
		int[] arr = {4,56,8,9,0,4,3,2,56,7,98};
		int max = getMax(arr);
		System.out.println(max);
	}

	// 定义一个获取最大值的函数
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int x = 0; x < arr.length; x ++)
		{
			if (arr[x] > max)
			{
				max = arr[x];
			}
		}
		return max;
	}

	// 函数重载获取double类型数组的最大值
	public static double getMax(double[] arr)
	{
		int max = 0;
		for (int i = 0; i < arr.length; i ++)
		{
			if (arr[i] > arr[max])
			{
				max = i;
			}
		}
		return arr[max];
	}
}