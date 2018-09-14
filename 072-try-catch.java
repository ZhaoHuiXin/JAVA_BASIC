/*
	异常处理：
	try{
		需要被检测的代码；
	}catch{
		处理异常的代码；（处理方式）
	}finally{
		一定会执行的语句；
	}

	对捕获到的异常对象进行常见方法操作：
	1.String  e.getMessage(); 获取异常的信息
	2.String  e.toString(); 异常名称：异常信息
	3.void 	  e.printStackTrace();  打印堆栈中的跟踪信息(异常名称：异常信息：异常出现的位置)

	JVM默认异常处理机制就是调用e.printStackTrace();方法，打印异常的堆栈跟踪信息
*/


class Demo{
	int div(int a, int b){
		return a/b;  // JVM   AritchmeticException obj =  new AritchmeticException();
	}
}

class ExceptionDemo2{
	public static void main(String[] args){
		Demo d = new Demo();
		try{
			int x = d.div(4, 0); // obj; obj被抛出，默认没人检测到，主函数被JVM调用
			// jvm对该对象的默认处理方式是程序停止。
			// try可以检测到Exception对象，catch 可以抓到一个Exception类型对象
			// 注意 Exception对象一被抛出，👇这句打印就不执行了，直接跳转到catch
			System.out.println("x=" + x);
		}catch (Exception e){ // Exception e = new ArithmeticException();
			System.out.println("除0啦！");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace(); 
		}

		System.out.println("over");

	}
}