/*
	匿名内部类：
		1.就是内部类的简写格式
		2.定义匿名内部类的前提：内部类必须是继承一个类或实现接口。
		3.匿名内部类的格式：new 父类或接口(){对父类或接口的实现}    ------创建了一个父类或接口的匿名子类对象
		4.其实匿名内部类就是一个 "匿名子类对象"
		5.匿名内部类中定义的方法最好不超过3个

*/
abstract class AbsDemo{
	abstract void show();
}
class Outer
{
	int x = 3;
	/*
	class Inner extends AbsDemo
	{	
		int num = 90;
		void show(){
			System.out.println("show: " + num);
		}
	}

	public void function(){
		new Inner().show();
	}
	*/

	// 匿名的
	public void function(){
		new AbsDemo(){ // 加分号是实例化，这样写是匿名实现show()，并实例化
			void show(){
				System.out.println("show: " + x);
			}

			void abc(){
				System.out.println("hello world");
			}
		}.show(); // 调用AbsDemo的匿名子类对象的show();

		AbsDemo d = new AbsDemo(){ // 只能使用父类类型，即向上转型，无法使用子类特有方法
			void show(){
				System.out.println("show: " + x);
			}

			void abc(){
				System.out.println("hello world");
			}
		}
		d.show(); // 可以
		d.abc(); // 子类特有，不行
	}

}

class InnerClassDemo4{
	public static void main(String[] args){
		new Outer().function();
	}
}