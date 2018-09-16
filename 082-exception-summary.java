/* 	异常部分总结：
	异常：是对问题的描述，将问题进行对象的封装
	——————————————————————————————————————
	异常体系：
		Throwable
			|--Error
			|--Exception
				|--RuntimeException
	异常体系的特点：异常体系中的所有类及建立的对象都具有可抛性。
				  也就是说可以被 throw 和 throws 关键字所操作
				  只有异常体系具备这个特点。
	——————————————————————————————————————
	throw 和 throws 的用法：
	throw定义在函数内，用于抛出异常对象。
	throws 定义在函数上，用于抛出异常类，可以抛出多个，用逗号隔开

	当函数内容有throw抛出异常对象，并未进行 try 处理。此时必须要在函数上声明throws 异常类，否则编译失败
	注意：RuntimeException异常除外，也就是说，函数内如果抛出的是它，函数上可以不用声明
	——————————————————————————————————————
	如果函数声明了异常，调用者需要进行处理。处理方式2种， 可抛  可try。

	异常有两种：
		1.编译时异常（被检测异常）
			该异常在编译时，如果没有处理（抛 或 try），那么编译失败。
			该异常被标识，代表着可以被处理。
		2.运行时异常（编译时不检测）
			在编译时，不需要处理，编译器不对它进行检查
			该异常发生，建议不处理，让程序停止，需要对代码进行修正。
	——————————————————————————————————————
	异常处理语句： （有3中组合方式，略）
	try
	{
		需要被检测代码	
	}
	catch
	{
		处理异常的代码
	}
	finally
	{
		一定会执行的代码
	}

	注意：
		finally 中定义的通常是 "关闭资源" 代码，因为资源必须要释放

		finally 只有一种情况是不会执行的：
			遇到 System.exit(0);   系统退出，jvm结束。
	——————————————————————————————————————
	自定义异常：
		定义类继承Exception 或 RuntimeException
		1. 为了让该自定义类具备可抛性。
		2. 让该类具备操作异常的共性方法。

		当要定义自定义异常时，可以使用父类已经定义好的功能。
		异常信息传递给父类的构造函数
		class MyException extends Exception{
			MyException(String message){
				super(message);
			}
		}

	自定义异常：按照java的面向对象思想，将程序中出现的特有问题进行封装。

	——————————————————————————————————————
	异常的好处：
		1. 将问题进行封装；
		2. 将正常流程代码和问题处理代码相分离，方便阅读


	异常的处理原则：
		1. 处理方式2种（try  或  throws）
		2. 调用到抛出异常的功能时，抛出几个，就处理几个，一个try 对应多个 catch 的情况
		3. 有多个 catch ， 父类的 catch 放到最下边
		4. catch 内需要定义针对性的处理方式，不要简单的定义printStackTace，输出语句，
		但也不要不写。	
		5. 当捕获到的异常，本功能处理不了时，可以继续在 catch 中抛出
		try
		{
			throw new AException();
		}		
		catch(AException e)
		{
			throw e;
		}

		6. 如果该异常处理不了，但并不属于该功能出现的异常，可以将该异常转换后，再抛出和该功能
		相关的异常。 
			或者异常可以处理，但需要将异常产生后和本功能相关的问题提供出去让调用者知道并处理。
		也可以将捕获异常处理后转换新的异常抛出

		try
		{
			throw new AException();
		}
		catch(AException e)
		{
			throw new BException();
		}

		try
		{
			throw new AException();
		}
		catch(AException e)
		{
			对AException处理;
			throw new BException();
		}
		比如，汇款的例子。🌰

	异常的注意事项：
		在子父类覆盖时：（子类不能抛比父类多的异常）
		1. 子类抛出的异常必须是父类异常的子类或者子集。
		2. 如果父类或者接口没有异常抛出时，子类覆盖出现异常，只能try，不能抛。

	参阅 
		老师 电脑 上课 案例
		图形面积 案例
































*/