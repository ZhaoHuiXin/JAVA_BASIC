/*
	this:看上去是区分局部变量和成员变量同名的情况

	this为什么可以解决这个问题？它代表什么？
		答:this就代表本类实例化的对象；this代表它所在函数所属对象的引用

	this揭示了一点，类中的成员调用都是通过对象完成的。

	this关键字（一个具体对象的引用）的应用:
		当定义类中函数时，该函数的内部要调用该函数的对象时，这时用this来表示这个对象

	this关键字在构造函数间调用：只能用this语句，传相应参数
	
	this语句（this()它就是构造函数）只能定义在构造函数的第一行，初始化要先执行；循环调用要避免
*/
class Person{
	private String name;
	private int age;

	Person(int age){
		this.age = age;
	}

	Person(String name){
		//name = name; // 这里局部变量和成员变量重名，
		//但是构造函数会优先使用局部变量name，导致初始化时无法传值给同名成员变量
		this.name = name;
	}

	Person(String n, int a){
		this(n); // this在构造函数间调用，仅限于构造函数, this语句只能定义在构造函数的第一行
		// this.name = n;
		this.age = a;
	}

	public void speak(){
		/*
		this(15);
			41-this-1.java:34: 错误: 对this的调用必须是构造器中的第一个语句
			this(15);
		    	^
			1 个错误
		*/
		System.out.println("name= "+ this.name + " and age= " + this.age);
	}

	/*
	需求：给人定义一个用于比较年龄是否相同的功能。也就是是否是同龄人
	*/
	public boolean compare(Person p1){
		return this.age == p1.age;
	}
}

class This{
	public static void main(String[] args){
		// Person p = new Person("赵四");
		// p.speak();
		// Person p1 = new Person("蓝十字");
		// p1.speak();
		Person p1 = new Person(20);
		Person p2 = new Person(25);
		System.out.println(p1.compare(p2));
	}
}
