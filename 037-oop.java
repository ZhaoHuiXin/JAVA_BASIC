
/*
面向对象:封装、继承、多态
类和对象的关系：类就是对现实生活中事物的描述；对象就是这类事物实时存在的个体
映射到java中，描述就是class定义的类；
具体对象就是对应java在堆内存(凡是用于存储多个数据的都叫做实体，都放到堆内存当中)中用 new 建立的实体
*/

class Car
{ // 描述事物：就是在描述事物的属性和行为(属性和行为又叫类中的成员变量、成员方法)
	// 属性
	/*
		成员变量作用于整个类中
		局部变量作用于函数或语句中

		成员变量在堆内存中，因为对象的存在才在内存中存在
		而局部变量存在于栈内存
	*/
	String color = "red";
	int wheels = 4;

	// 行为
	void run() // Car类中可以不写主函数，可以不写static
	{
		System.out.println(color + ".." + wheels);
	}
}

class Oop
{
	public static void main(String[] args)
	{
		// 生产🚗，在java中通过new操作符号完成
		Car c = new Car();	// c是一个Car类 类型变量；类类型变量指向对象。
		c.wheels = 5;
		Car c1 = c;
		c1.color = "green";
		c.run();
	}
}
