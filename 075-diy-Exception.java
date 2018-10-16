/*
	自定义异常
		因为项目中会出现特有问题，而这些问题并未被java所描述并封装对象；
	所以对于这些特有问题可以按Java的对问题封装的思想，将特有问题进行自定
	义的异常封装。

	需求：在本程序中，对于除数是负数也视为是错误的，是无法进行运算的
	那么就需要对这个问题进行自定义描述

	当在函数内部出现了throw抛异常对象，那么就必须要给对应的处理动作：
	1.java虚拟机处理（调用者处理）
	2.在内部try  catch处理

	一般情况下，函数内出现异常，函数上需要声明。

	发现打印的结果中只有异常的名称，却没有异常的信息
	：因为自定义的异常并未定义信息

	如何定义异常信息？
		：因为父类中已经把异常信息的操作都完成了。所以子类只要在构造时，
	将异常信息传递给父类通过super语句，那么就可以直接通过getMessage方
	法获取自定义的异常信息。

	注意：
		1.必须是自定义类继承Exception（Exception 和 Error是Throwable下的两个派系
		：异常体系有一个特点：因为异常类和异常对象都需要被抛出，它们都具
	备可抛出性，这个可抛出性是Throwable这个体系中独有特点，只有这个体系中
	的类和对象才可以被throw和throws操作

	throws和throw的区别：
		1.throws 使用在函数上；throw 使用在函数内
		2.throws 后面跟的异常类可以是多个用逗号隔开；throw 后面跟的是异常对象

	throws的都是编译时被检测异常，如果没声明，那么会编译失败
*/
// 自定义负数异常类
// java的异常可以自动抛出，但是自定义异常java不认识，必须手动抛出
class FuShuException extends Exception{
	// 自定义类特有成员变量
	private int value;

	FuShuException(String msg, int value)
	{
		super(msg);
		this.value = value;
	}

	// 自定义类特有方法
	public int getValue()
	{
		return this.value;
	}
}


class Demo{
	int div(int a,int b) throws FuShuException // 一般情况下，函数内出现异常，函数上需要声明。
	{	
		if(b < 0){
			// java的异常可以自动抛出，但是自定义异常java不认识，必须手动抛出
			// 手动通过throw关键字抛出一个自定义异常对象注意是throw不是throws
			throw new FuShuException("负数是除数异常---/ by fushu",b);   
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
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch(FuShuException e){
			System.out.println(e.toString());
			System.out.println("错误的负数是： " + e.getValue());
		}
		

		System.out.println("over");
	}
}


/*
class Throwable
{
	private String message;
	Throwable(Striong message)
	{
		this.message = message;
	}
	public String getMessage(){
		return this.message;
	}
}

class Exception extends Throwable
{
	Exception(String message)
	{
		super(message);
	}
}
*/










