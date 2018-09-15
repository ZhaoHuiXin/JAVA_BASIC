/*
	在函数上声明异常
	便于提高安全性，让调用处进行处理。不处理就编译失败
*/

class Demo{
	int div(int a,int b)throws Exception // 在功能上通过throws关键字声明了该功能有可能会出现的问题
	{
		return a/b;
	}
}

class ExceptionDemo3{
	public static void main(String[] args) //throws Exception// 处理方式1：将异常抛给JVM默认处理	
	{ 
		Demo d = new Demo();

		// int x = d.div(4, 1); //错误: 未报告的异常错误Exception; 必须对其进行捕获或声明以便抛出
		// 处理方式2：try catch
		try{
			int x = d.div(4,0);
			System.out.println("x="+x);
		} catch (Exception e){
			System.out.println(e.toString());
		}
		System.out.println("over");
	}
}