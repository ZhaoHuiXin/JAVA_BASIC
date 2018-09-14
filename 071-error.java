/*
	异常：就是程序在 “运行时” 出现的不正常情况。
	异常由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述，并封装成对象。
			其实就是java对不正常情况进行描述后的对象提现。（把问题封装成对象就是异常）
	对于问题的划分：
		1.严重的问题：
			通过Error类进行描述，对于Error一般不编写针对性代码进行处理（癌了）
		2.非严重的问题：
			通过Exception进行描述，可以使用针对性的处理方式进行处理（感冒发烧，磕点药）
	无论error或exception都有一些共性内容。比如：不正常情况的信息，引发原因等（有共性就向上抽取）
	Throwable 类 java.lang包中 （使用原则，看父类定义建立子类对象）
		|--Error

		|--Exception
*/

class Demo{
	int div(int a, int b){
		return a/b;
	}
}

class ExceptionDemo1{
	public static void main(String[] args){
		// Demo d = new Demo();
		// int x = d.div(4, 0); // Exception
		// System.out.println("x=" + x);

		// System.out.println("over");

		// byte[] arr = new byte[1024*1024*10000]; // OutOfMemoryError:Java heap space...
	}
}