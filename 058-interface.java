/*
	class 用于定义类
	interface 用于定义接口

	接口定义时，格式特点：
		1.接口中常见定义：常量，抽象方法；
		2.接口中的成员都有固定修饰符
			常量：public static final
			方法：public abstract
		记住：接口中的成员都是public的。
	接口：是不可以创建对象的，因为有抽象方法。
	它需要被子类实现，子类对接口中的 “抽象方法” “全部” 覆盖后，子类才可以实例化。
	否则子类是一个抽象类。

	接口可以被类多实现，也是对多继承不支持的转换形式。java支持多实现
	,不可以多继承，但是可以多实现，是因为接口中的方法都没有方法体
	，即使多个接口都有同名方法，子类只实现一个就是都实现了

	接口与接口间也有关系，是继承关系
	类与类是继承关系
	类与接口是实现关系
*/

interface Inter{
	public static final int NUM = 3;
	public abstract void show();
}

interface InterA{
	public abstract void method();
}

class Demo{
	public void function(){}
}

// abstract class Test implements Inter{
// 	public abstract void show(){};
// }

// 多实现，接口没有方法主体，可以由子类任意定义
// class Test implements Inter, InterA{
// 更牛逼的，一个类在继承一个类的同时还能多实现接口，通过接口来增加自己功能
class Test extends Demo implements Inter, InterA{
	public void show(){}
	public void method(){}
}



class InterfaceDemoOne{
	public static void main(String[] args){
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
		D d = new D();
		d.methodA();
		// t.NUM = 4; 不能对常量赋值哦 
	}
}

interface A{
	void methodA();  // 隐式的 public static void methodA()
}

interface B extends A{
	void methodB();
}

interface C extends B{
	void methodC();
}
// 接口之间可以多继承，如果B没有继承自A的话，C可以直接继承自A跟B。前提是A和B同名方法返回值类型是相同的
// 因为没有方法体，不会冲突
// interface C extends B, A{
// 	void methodC(){};
// }


class D implements C{
	public void methodA(){  // 接口中是隐式的 public static void methodA()，所以实现的时候要显示的写出
	System.out.println("hello method A");
	}
	public void methodB(){};
	public void methodC(){};
}







