/*
	函数是 java中最小的封装体
	封装：指隐藏对象的属性和实现细节，仅对外提供访问方式
	原则：	
		把属性都隐藏，提供公共方式对其访问。 	私有 private static void ....
		将不需要对外提供的内容都隐藏起来。
		private -- 私有，权限修饰符，用于修饰类中的成员（成员变量，成员函数）
	私有只在本类中有效，就是说被私有修饰符修饰的成员，只能在本类中调用
		将age私有化后，类以外即使建立了对象也不能直接访问
	但是人应该有年龄，就需要在Person类中提供对应访问age的方式

		注意：私有仅仅是封装的一种表现形式；

		之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句，对访问的数据进
	行操作，提高代码的健壮性

		注意：成员变量在堆内存中，定义完后就有默认值；而局部变量不同，它在栈内存中，只是定
	义而没有初始化的话它是没有默认值的。
*/

class Encapsulation{
	public static void main(String [] args){
		Person p = new Person();
		p.setAge(-20);
		p.speak();
	}
}

class Person{
	private int age;
	// 设置私有变量的值；可以对传入的变量进行判断，而不是直接赋值
	public void setAge(int a){
		if(a > 0 && a < 120){
			age = a;
			return;
		}
		System.out.println("valiud age!");
	}
	// 获取私有变量的值
	public int getAge(){
		return age;
	}

	void speak(){
		System.out.println("age="+age);
	}
}

