class FunctionReload
{	// 重载：在同一个类中，允许存在一个以上的同名函数，只要它们的参数个数或参数类型不同即可
	// 函数名代表功能，此时不再定义多余的名称，java中可区分。（根据参数个数或参数类型不同，和返回值类型无关）
	// 什么时候用重载：
	// 		当定义的功能相同，但参与运算的未知内容不同。
	// 		那么，这时就定义一个函数名称表示功能，方便阅读，而通过参数列表的不同来区分多个同名函数
	public static void main(String[] args)
	{
		System.out.println(add(4, 5));
		System.out.println(add(4, 5, 6));
		print99();
		print99(3);
	}

	public static int add (int x, int y)
	{
		return x + y;

	}
	// 重载add
	public static int add (int x, int y, int z )
	{
		return x + y + z;
	}

	public static void print99()
	{
		// for (int x=1; x <= 9; x++)
		// {
		// 	for (int y=1; y<=x; y++)
		// 	{
		// 		System.out.print(y+"*"+x+"="+(x*y)+"\t");
		// 	}
		// 	System.out.println();
		// }
		print99(9);
	}
	// 重载print99
	public static void print99(int num)
	{
		for (int x=1; x <= num; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}

	}
	/*
	void show(int a, char b, double c){}
	int show(int a, double c, char b){} 重载：因为参数类型不同
	void show(int a, double c, char b) 重载：因为参数类型不同
	boolean show(int c, char b){} 重载了，因为参数个数不同
	void show(double c){} 重载，参数个butong
	double show(int x, char y, double z){} 没有重载，这个函数不可以和给定函数同时存在于一个类中(重载和返回值类型无关) 

	*/
}