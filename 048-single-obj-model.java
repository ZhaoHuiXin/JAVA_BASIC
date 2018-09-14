/*
	s设计模式：解决某一类问题最行之有效的方法
	java中23种设计模式
	单例模式：  一个类在内存中只存在一个对象。

	想要保证对象唯一：
		1.为了避免其他程序过多建立该类对象。先控制禁止其他程序建立该类对象；
		2.还为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象；
		3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
	如何用代码体现：
		针对1：将构造函数私有化
		针对2：在类中创建一个本类对象
		针对3：提供一个方法可以获取该对象

	对于事物该怎么描述还怎么描述，
	当需要将该事物的对象保证在内存中唯一时，就将以上3步加上即可。
*/

class Single{
	private int num;
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return this.num;
	}
	private Single(){};	 

	// 静态方法只能访问静态变量，所以要使用static，再加private哦，隐藏起来； ➕不➕final都可
	// private static final Single s = new Single();
	private static Single s = new Single();

	// 不能实例化，但是想要方法被访问，要使用静态；
	public static Single getInstance(){
		return s;
	}
}

class SingleDemo{
	public static void main(String[] args){
		Single ss = Single.getInstance();
		System.out.println(ss.getNum());
		ss.setNum(100);
		System.out.println(ss.getNum());
		Single ss1 = Single.getInstance();
		System.out.println(ss1.getNum());
	}
}

class Student{
	private int age;

	// STEP 2
	private static Student s = new Student();

	// STEP 1
	private Student(){};

	// STEP 3
	public static Student getStudent(){
		return s;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
}













