class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		//java.lang.ArrayIndexOutOfBoundsException: 3;
		// 但是可以编译，编译只检查语法错误；这是运行时错误
		System.out.println(arr[2]); 

		// 遍历数组
		
		for(int x = 0; x < 3; x ++)
		{
			System.out.println(arr[x]);
		}

		int[] arr2 = {3,6,8,0,3,4};
		// array.length  获取数组长度
		for(int x = 0;x < arr2.length; x ++)
		{
			System.out.println(arr2[x]);
		}

		printArray(arr2);
	}

	// 定义一个功能用于打印数组中的元素，元素间用逗号隔开
	public static void printArray(int[] arr)
	{
		for (int x = 0; x < arr.length; x++)
		{	
			if(x == arr.length-1)
			{
				System.out.println(arr[x]);
				return;
			}
			System.out.print(arr[x] + ", ");
		}
	}
}