
interface Inter{
	public abstract void method();
}

class Test{
	/* 通过静态内部类实现
	static class Inner implements Inter{
		public void method(){
			System.out.println("hello anonymous class");
		}
	}

	static Inner function(){
		return new Inner();
	}
	*/

	// 补足代码，通过匿名内部类实现
	static Inter function(){
		return new Inter(){
			public void method(){
				System.out.println("hello anonymous class");
			}
		};
	}
}

class InnerClassTest{
	public static void main(String[] args){
		// Test.function():Test类中有一个静态的方法function
		// .method():function这个方法运算后的结果是一个对象。而且是一个Inter类型的对象
		// 因为只有是Inter类型的对象，才能调用method方法。
		Test.function().method();
		// 等同于
		// Inter in = Test.function();
		// in.method();
	}

	/* 匿名内部类常用于：当使用的参数是接口类型时，
	并且接口的方法很少不超过3个？可以定义一个匿名内部类做参数传入

	publics static void show(Inter in){
		in.method();
	}
			 现撸一个匿名类对象作为参数
	show(new Inter(){
		public void method(){
			System.out.println("hello anonymous class");
		}
	});
	*/
}


/*在没有父类、没有接口的情况是是否可以使用匿名类？
	可以，有请上帝类 Object
	
*/
class InnerTest{
	public static void main(String[] args){
		// new Object(); // new一个Ojbect对象

		// 可以用Object直接创建匿名子类对象调用子类对象的方法new Object(){.....}.function();
		// 不能使用父类引用 Object ob = new Object(){.....}，
		// 因为Object上帝类没有几个方法，使用父类引用的话自定义的很多方法都不能用
		new Object(){  
			public void function(){

			}
		};
	}
}



































