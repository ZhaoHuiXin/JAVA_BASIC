/*
	内部类的访问规则：
	互相访问方式
		1.内部类可以直接访问外部类中的成员，包括私有（private）
			之所以可以直接访问外部类中的成员，是因为内部类中默认隐式的持有了一个外部类的引用，格式：外部类名.this
		2.外部类要访问内部类，必须建立内部类对象

	内部类特点：
		1.能被 private 修饰,内部类可以被私有修饰，当内部类在外部类的成员位置上时；外部类绝对不能哦

	访问格式：
		1.当内部类定义在外部类的成员位置上，并且 ”非私有“,”非静态“，可以在外部其他类中(比如ClassNest就是外部其他类)，
	直接建立内部类对象，格式： 外部类名.内部类名  变量名 = 外部类对象.内部类对象
									Outer.Inner in = new Outer().new Inner();
		  当内部类定义在外部类成员位置上并且为静态时，外部类调用它就像调用成员变量一样，此时创建内部静态类的实例格式：
		  							Outer.Inner in = new Outer.Inner();
		2.当内部类在成员位置上，就可以被成员修饰符所修饰，
			比如：
				private：将内部类在外部类中进行封装
				static：内部类可以被静态修饰，内部类就具备了静态的特性,当内部类被静态修饰后，只能直接访问"外部类"中的"静态成员"，
			出现了访问局限性。
		3.在外部其他类中如何直接访问"静态内部类的非静态成员"呢？
			new Outer.Inner().function();  Outer一加载静态内部类Inner就加载了，所以不用对象，使用Inner类名直接调用；
		但是function是非静态的，就得使用new创建一个内部类的对象再调用function方法；
		4.在其他类中，如何直接访问static内部类的静态成员呢？
			如果function也是静态的， Outer.Inner.function();不用new一个内部类对象。
			
	注意：
		1.当内部类中定义了静态成员，那么内部类必须静态的（static class）
		2.当外部类中的静态方法访问内部类时，内部类必须也是静态的

	内部类定义原则：
		当描述事物时，事物的内部还有事物，该事物用内部类来描述，因为内部事物在使用外部事物中的内容；
		当一个类需要直接访问另一个类中的成员时，可以写成内部类，写完后争取将它封装在另一个类中，不对外暴露，只提供方法访问；
	代码设计最优：人体中含有心脏
	class Body{
		private class Heart{  心脏不需要对外暴露，可以提供访问方式
	
		}

		public void show(){
			new Heart().
		}
	}
*/



class Outer{
	// int x = 3;
	private int x = 3;

	void method(){
		// System.out.println(x);
		Inner in = new Inner();
		in.function();

		Outer.Inner2 oi = new Outer.Inner2();
		oi.show();
	}




	// 内部类,一个类放入另一个类中；注意不是类放到函数中
	// private class Inner{ // 内部类
	static class Inner{ // 静态内部类
		int x = 4;
		// 如果Inner想访问Outer中的method和Outer中的变量x，方便了许多，不用创建Outer的外部对象
		// void function(){
		static void function(){
			int x = 6;
			// 即使x是private的，Inner中也能访问到，因为Inner在Outer类中
			System.out.println("inner : " +  x); // 6
			// System.out.println("inner : " +  this.x); // 4
			// System.out.println("inner:" + Outer.this.x); // 3 
			// 外部类成员变量都被外部类对象访问，所以内部类想访问外部类成员变量时，必须有外部类的引用）
		}
	}

	class Inner2{
		void show(){
			System.out.println("inner2 show: ");
		}
	}

	public static void method2(){
			Inner.function();
	}
}

class ClassNest{
	public static void main(String[] args){
		Outer out = new Outer();
		out.method();
		
		// 创建内部类的实例： 外部类.内部类
		// Outer.Inner in = new Outer().new Inner();
		// in.function();

		// 4.在外部其他类中如何直接访问静态内部类中静态成员呢？
		// 直接访问内部类中的成员：
		Outer.Inner.function();

		// Outer.method();
	}
}










