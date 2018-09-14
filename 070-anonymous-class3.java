/*
内部类只有被定义在成员位置上时，才能被私有或静态所修饰；一般内部类是不会被共有修饰
内部类可以写在类的任意位置上
*/

class Outer{
	int x = 3;
	void method(){
		class Inner{ // 局部内部类，不能被静态私有修饰，静态、私有只修饰成员，现在Inner在局部，不能被修饰
			void function(){ // 内部类中不能有静态成员，如果有，那么说明内部类也得是局部的，与以上相悖；
							// 它的成员都是非静态的，没对象不能运行
				System.out.println(Outer.this.x); // 可以访问外部成员；
			}
		}
		new Inner().function();
	}
}

class InnerClassDemo3{
	public static void main(String[] args){
		new Outer().method();
	}
}

// - _ -!