
class ArrayNest
{
	public static void main(String[] args)
	{
		// int[] arr = new int[3]; // 一维数组


		// 定义了名称为arr的二维数组。二维数组中有3个一维数组
		// 每一个一维数组中有4个元素
		// *第一种定义方式：
		int[][] arr = new int[3][4]; 

		// 定义二维数组长度为3，一维数组不确定的二维数组（没有初始化的，）
		// *第二种定义方式：
		int[][] arr2 = new int[3][];
		System.out.println(arr2[0]); // 结果为null

		arr2[0] = new int[3];
		arr2[1] = new int[2];
		arr2[2] = new int[10];

		System.out.println(arr2[0]); 

		// *第三种定义方式：
		int[][] arr3 = {{3,4,5},{2,1},{6,6,6,6,6,6}};
		int sum = 0;

		for (int x = 0; x < arr3.length; x ++)
		{
			for (int y=0; y < arr3[x].length; y++)
			{
				sum += arr3[x][y];
			}
		}
		System.out.println(sum);
	}

	/*
	数组定义方式：
	一维：int[] x; int x[];
	二维：int[][] y; int y[][]; int[] y[];
	*/ 


}