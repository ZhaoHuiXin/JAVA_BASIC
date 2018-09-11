/* 	static 关键字
	多个对象中存在共同数据，若在每个对象中都存一份比较占空间，可以将数据共同部分独立出来，让各对象共享，
此时用 static(静态) 修饰
	static是一个修饰符，用于修饰类中成员（成员变量，成员函数），被static修饰的成员变量就不在堆内存中了
！！而是在除堆、栈外的另一片内存（方法区、共享区、数据区），静态修饰的内容被对象所共享。
	当成员被静态修饰后，就多了一种调用方式，除了可以被 对象 调用外，还可以直接被 类名 调用：
类名.静态成员
	static特点：
		1.随着类的加载而加载：
			当Person类进内存的时候，coutry=“china”就已经在内存中开辟了空间；同理它也随Person类的
		消失而消失。说明它的生命周期最长（对内存消耗比较大，不建议定义过多的静态变量）
		2.优先于对象存在：
			静态是先存在的，对象是后存在的；
		3.被所有对象所共享
		4.可以直接被类名所调用。

	实例变量和类变量区别：
		存放位置：
		1.类变量随着类的加载而存在于方法区中
		2.实例变量随着对象的建立而存在于堆内存中
		生命周期：
		1.类变量生命周期最长，随着类的消失而消失（其次是对象）
		2.实例变量生命周期随着对象的消失而消失

	静态使用注意事项：
		静态可以修饰变量也可以修饰方法
		1.静态方法只能访问静态成员，非静态方法可以访问非静态成员、静态成员
		2.静态方法中不可以定义this，super关键字，因为静态优先于对象存在，所以静态方法中不可以出现this
		3.主函数是静态的

	静态优缺点：
		优点：
		1.对 对象共享的数据进行单独空间的存储，节省空间。没有必要每个对象中都存储一份。
		2.可以直接被类名调用而不进行实例化
		缺点：
		1.生命周期过长
		2.访问出现局限性（静态虽好，但是不能访问非静态成员）
*/

class Person{
	String name; // 成员变量（实例变量）随实例而存在
	//String country = "china"; 
	static String country = "china"; // 被static修饰后的country不在堆内存中了
	public void show(){
		System.out.println(name + "::" + country);
	}
}

class StaticDemo{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "赵四";
		p.show();

		System.out.println(Person.country);
	}
}