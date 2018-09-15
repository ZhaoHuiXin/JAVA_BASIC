/*
	手动修改除0的算数异常
		ArithmeticException 父类是RuntimeException；RuntimeException类及其子类如
	果在函数内抛出，在函数上不用 声明。

	Exception 中有一个 特殊的子类异常，RuntimeException
		如果在函数内抛出该异常，在函数上可以不用声明，编译一样通过；
		如果在函数上声明了该异常。调用者可以不进行处理(在调用函数上声明或使用try catch)，编译一样通过
	：之所以不用在函数上声明，是java不需要让调用者处理这样的异常，当该异常发生时，希望程序停止。
	因为在运行时，出现了无法继续运算的情况，希望停止程序后，对代码进行修正。
	
	
	从java的RuntimeException类异常中得到的经验：
		自定义异常时，如果该异常的发生，使得程序无法再继续运行运算，那么就让自定义的异常继承RuntimeException

	需求：当除数为负数时，程序无法继续运行
	
	异常分两种：
		1.编译时被检测的异常
		2.编译时不被检测的异常（运行时异常）
	注意：自定义异常现在有2种选择，要么继承Exception，要么继承RuntimeException


*/

class FuShuException extends RuntimeException
{
	FuShuException(String msg)
	{
		super(msg);
	}
}

class Demo{
	int div(int a,int b) // 如果在函数内抛出RuntimeException异常，在函数上可以不用声明，编译一样通过；
	{	

		if(b < 0)
		{
			throw new FuShuException("出现了除数为负数了");
		}
		if(b == 0){
			// java的异常可以自动抛出，但是自定义异常java不认识，必须手动抛出
			// 手动通过throw关键字抛出一个自定义异常对象注意是throw不是throws
			throw new ArithmeticException("被0除了---/ by zero");   
		}
		return a/b;
	}
}

class ExceptionDemo4{
	// 错误: 未报告的异常错误FuShuException; 必须对其进行捕获或声明以便抛出
	public static void main(String[] args) 	
	{ 
		Demo d = new Demo(); 

		try{
			int x = d.div(4,-9);
			System.out.println("x="+x);
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		catch(FuShuException e){
			System.out.println(e.toString());
		}
		

		System.out.println("over");
	}
}

class Person
{
	// 当name  传入null的时候
	public void checkName(String name){
		//if(name.equals("lisi")) // NullPointerException
		if("lisi".equals(name))// if(name !=null && name.equals("lisi"))
		{
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}








