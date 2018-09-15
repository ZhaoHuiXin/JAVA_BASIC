/*	

	finally 作用：（通常用于关闭资源,只要程序调用资源，就一定要做关闭资源的动作）
		1.比如断开数据库连接
*/


class FuShuException extends Exception{
	FuShuException(String message){
		super(message);
	}
}

class Demo{
	int div(int a, int b) throws FuShuException{
		if(b < 0){
			throw new FuShuException("出现了除数是负数异常");
		}
		return a/b;
	}
}

class ExceptionDemo5{
	public static void main(String[] args){
		Demo d = new Demo();
		try{
			int x = d.div(4,0);
			System.out.println("x=" + x);
		}
		catch(FuShuException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally"); // finally中存放的是一定会被执行的代码
		}
		System.out.println("over");

	}
}

/*

class NoException extends Exception{ 
	
}

public void method() throws NoException{
	连接数据库;

	数据操作; // throw ne SQLException();

	关闭数据库连接; // 该动作 无论数据操作是否成功都要执行

	更为：
	try{

		连接数据库;

		数据操作;
	}
	catch (SQLException e) 
	// 数据库操作发生异常有2种处理动作，（特定的数据库异常处理方式）
	，没必要抛出去(因为调用者一般不会解决该类问题)，而且还暴露程序封装性

	{
		会对数据库进行异常处理;
		throw new NoException();
		，分层思想(模块化)，无须暴露本层问题，只暴露对方能识别的问题——(问题的封装)
	}
	finally{
		关闭数据库连接;
	}
}
*/






