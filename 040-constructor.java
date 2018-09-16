/*
构造函数：
	特点：
		1.函数名与类型相同（与void不同，void也是一种返回值类型，
	代表没有具体结果返回的情况；构造函数没有 return 语句）
		2.不用定义返回值类型
		3.不可以写 return 语句
	作用：
		给对象进行初始化。
	注意：
		1.默认构造函数的特点；
		2.多个构造函数是以重载的形式存在的

	构造函数小细节：
		当一个类中没定义构造函数时，系统会给该类加入一个空参数的构造函数。
	Person(){}; 没有构造函数对象是建立不出来的。
		当类中自定义了构造函数，系统就不会给该类加默认构造函数了。

		一般函数和构造函数在写法上不同，在运行上也有不同，构造函数在对象一建立就运行，
	一般方法是对象调用才执行，给对象添加对象具备的功能。
		一个对象建立，构造函数只运行一次，而一般方法可以被该对象多次调用。

		什么时候用构造函数：当分析事物时，该事物存在具备一些特性或行为，那么将这些内容定义
	在构造函数中。

		执行顺序：构造代码块（就是{}包围的那一坨） --- 构造函数
		如果将类中所有的构造函数私有化，那么就无法创建一个它的对象，因为无法进行初始化
*/

class Person{
	// 对象建立时会调用与之对应的构造函数；构造函数用于给对象进行初始化
	private String name;
	private int age;
	/* 构造代码块：
		作用：给对象进行初始化，而且优先于构造函数执行
		和构造函数的区别：
			构造代码块是给所有对象进行统一初始化的(定义对象共性初始化内容，如cry() )；
			而构造函数是给对应的对象进行初始化(不同的对象分别进行初始)
    */
	{// 这里就是构造代码块，它先于构造函数执行
		System.out.println("person code run")
		cry();
	}

	Person(){
		System.out.println("A: name="+name+"，age="+age);
		
	}

	Person(String n){
		name = n;
		System.out.println("B: name="+name+"，age="+age);
	}

	Person(String n, int a){
		name = n;
		age = a;
		System.out.println("C: name="+name+"，age="+age);
	}

	public void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}
	public void cry(){
		System.out.println("cry ........");
	}


}

class Constructor{
	public static void main(String[] args){
		Person p1 = new Person();

		Person p2 = new Person("尼古拉斯赵四");

		Person p3 = new Person("宇智波赵四", 22);
	}
}