/*
	多异常的处理：
		1.声明异常时，建议声明更为具体的异常。这样处理的可以更具体。
		2.对方声明几个异常，就对应有几个catch块，不要定义多余的catch块
	如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。

	建议在进行catch处理时，catch一定要定义具体的处理方式。
	不要简单的一句 e.printSackTrace(),也不要简单的写一条输出语句。

*/

class Demo{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{	
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}

class ExceptionDemo3{
	public static void main(String[] args) 	
	{ 
		Demo d = new Demo();

		try
		{
			int x = d.div(5,0);
			System.out.println("x="+x);
		} 
		// catch (ArithmeticException e)
		// {
		// 	System.out.println(e.toString());
		// 	System.out.println("被0除了！");
		// }
		// catch (ArrayIndexOutOfBoundsException e)
		// {
		// 	System.out.println(e.toString());
		// 	System.out.println("角标越界了！");
		// }

		// 只写一个catch， 多态性，什么异常都能处理；但是没有针对性，最好写针对性处理
		catch (Exception e)
		{
			System.out.println(e.toString()); 
		}

		System.out.println("over");
	}
}

/*
	注意，函数当中只要有异常发生，这个函数就已经结束了，所以上面两个异常不能同时发生
*/