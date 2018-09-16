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
	int num = 4;

	// 行为
	void run() // Car类中可以不写主函数
	{
		System.out.println(color + ".." + num);
	}

}

class Oop2
{
	/* 匿名对象
	Car c = new Car();
	c.num = 5;
	==> new Car().num = 5;  这种匿名对象调用属性创建完就被垃圾回收了
	==> 和上面不是一个对象哦 new Car().color = "black";
	==> 和上面不是一个对象哦 new Car().run();  调用匿名对象的方法还有点意义

	匿名对象使用方式：
		1.当对对象的方法只调用一次时，可用匿名对象完成，这样简化；
	可是如果对一个对象进行多个成员调用，必须给这个对象起个名字。
		2.可以将匿名对象作为实际参数进行传递。
	*/

	// 需求：汽配厂，将来的车改成黑色三轮
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run;
	}

	public static void main(String[] args)
	{
		Car q = new Car();
		show(q);
		show(new Car());
	}
}

