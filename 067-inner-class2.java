/*
	内部类定义在局部时：
		1.不可以被成员修饰符修饰
		2.可以直接访问外部类中的成员，因为还持有外部类中的引用，但是不可以访问它所在的局部中的变量，
	只能访问被final修饰的局部变量。

*/
class Outer{
	int x = 3;
	void method(int a){  // 现在这么写不报错，之前版本得写成 final int a | a是局部变量，进栈内存，函数结束就释放了
		int y = 4; //之前版本这样的话会报错（从内部类中访问局部变量y；需要被声明为最终类型），但是现在版本好像不报错了
		// final int y = 4;  
		// new Inner().function(); 不能放到这个位置，因为new的时候jvm还没读到 class Inner...
		// 局部的内部类，不能定义静态成员的，静态修饰符无法修饰局部成员
		// 局部内部类都是非静态的，所以都得通过对象访问
		class Inner{ 
			void function(){
				System.out.println("this is  outer's x:" + Outer.this.x);
				System.out.println(y);
				System.out.println(a);
			}
		}
		new Inner().function();
	}
}


class InnerClass2{
	public static void main(String[] args){
		new Outer().method(7);  
	}
}