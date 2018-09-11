/*
	子父类中函数的特点：
	1.重写（覆盖）：
	当子类中出现和父类一模一样的函数时，
	当子类调用该函数，会运行子类函数的内容。
	如同父类的函数被覆盖一样

	注意：
		1.子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败
		2.静态只能覆盖静态。
		3.重载 只看同名函数的参数列表；
		重写 子父类方法一模一样，包括返回值类型。
*/
class Fu{
	void show(){
		System.out.println("fu show");

	}
	void speak(){
		System.out.println("vb");
	}
}

class Zi extends Fu{
	void speak(){
		System.out.println("java");
	}

	void show(){
		super.show();
		System.out.println("i show when fu show over");
	}
}

class InheritFunc
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.show();
		z.speak();
	}
}