/*
	子父类中的构造函数：
		1.为什么子类一定要访问父类中的空参数的构造函数？
			答：因为父类中的数据，子类可以直接获取；所以子类对象在建立时，
		需要先查看父类是如何对这些数据进行初始化的，所以子类在对象初始化时，
		要先访问一下父类中的构造函数;
			如果要访问父类中指定的构造函数，可以通过手动定义super的方式来指定。

		当父类中重写了构造函数，没有空参数的构造函数了，那么子类一定要显示的调用父类中改写的构造函数
		注意：super也应该放在构造函数的第一行。如果子类中将this放在了第一行，那么就会调用this中的
		super，本函数不用再写super。
		结论：
			子类中所有的构造函数，默认都会访问父类中空参数的构造函数
			因为子类中每一个构造函数的第一行都有一个空参数的隐式的super()
			当父类中没有空参数的构造函数时，子类必须通过手动super或者
		this语句形式来指定访问一个父类中的构造函数。
			当然，子类中的函数第一行也可以手动指定this来访问本类中的构造函数，
		子类中至少有一个构造函数会访问父类中的构造函数

		2.为啥this、super不能放在同一行？
			答：他俩都得放在第一行，因为初始化动作要先做
*/
class InheritConstuctor
{
	public static void main(String[] args){
		Zi z1 = new Zi();
		Zi z2 = new Zi(3);
		Student s = new Student("lili"); 
		s.method();

		s.show();
	}
}

class Fu{
	Fu(){
		System.out.println("fu init");
	}

	Fu(int num){
		MyUtil.println("fu init DIY,num = " + num);
	}
}

class Zi extends Fu{
	Zi(){
		// super(); 子类构造函数默认有条隐式的语句，
		// 它会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行都有该隐式的super()
		System.out.println("zi init");
	}

	Zi(int x){
		super(x);
		System.out.println("zi..." + x);
	}
}

class Person{
	private String name;
	Person(String name){
		this.name = name;
	}
	void show(){
		MyUtil.println(this.name);
	}
}

class Student extends Person{
	private String name;
	Student(String name){
		// 调用父类含参数的构造函数
		super(name);
		this.name = name + " Student";
	}

	void method(){
		super.show();
		MyUtil.println(name);
	}
}