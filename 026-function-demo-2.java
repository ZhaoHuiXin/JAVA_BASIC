class FunctionDemo2
{	
	public static void main(String[] args)
	{
		int sum = getSum(100,5);
		System.out.println("sum="+sum);

		System.out.println(isEqual(5, 6));
	}
	/*
		如何定义一个函数：
		1.先明确结果(返回值类型)
		2.明确是否需要参数(参数列表，参数的类型和参数的个数)
	*/
		/*
		需求：定义一个函数，完成3+4的运算，并将结果返回给调用者
			思路：
			1.明确结果是个整数的和
			2.在实现该功能的过程中没有未知内容参与运算。
		*/
	public static int getSum(int x, int y)
	{
		return x + y;
	}
	// 判断两个数是否相同

	public static boolean isEqual(int x, int y)
	{
		return x == y; 
	}
}