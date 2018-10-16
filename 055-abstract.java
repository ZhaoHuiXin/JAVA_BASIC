/* 抽象类
	当多各类中出现相同功能，但是功能主体不同，这时也可以进行向上抽取。
	此时只抽取功能定义，而不抽取功能主体
	抽象类特点：
		1.抽象方法"一定"定义在"抽象类中"
		2.抽象方法和抽象类都"必须被abstract关键字修饰"
		3."抽象方法不能用new创建对象"，因为调用抽象方法没意义(所以要想在抽象类中定义直接使用的方法，
	要使用static修饰)
		4.抽象类中的抽象方法要被使用，必须由子类复写“所有”的抽象方法后，建立子类对象调用
		5.如果子类方法"只覆盖了部分抽象方法"，那么该子类"还是一个抽象类"。
		6.抽象类还可以调用父类的"非抽象功能"
	注意：
		1.抽象类和一般类没有太大不同，该如何描述事物就如何描述，只不过，该事物出现了一些看不懂的东西
		2.这些不确定的部分也是该事物的功能，需要明确出现。但是无法定义主体。通过抽象方法来表示。
		3.抽象类比一般类多了抽象方法，在类中可以定义抽象方法。（抽象类也可以不定义抽象方法）
		4.抽象类不可以实例化哟
*/
abstract class Student{ // 有抽象方法的类必须也是抽象的，并且不能创建实体
	abstract void study(); // 没有{},只抽取功能定义，而没有方法体。必须用关键字 abstract 修饰为抽象方法，它的类必须也是抽象的，不能创建对象
	abstract void sing();
	// void sleep(){ // 每个子类中功能定义和功能主体都相同,可以在抽象类中统一定义
	static void sleep(){  
		System.out.println("睡觉");
	}

}

abstract class BaseStudent extends Student{  // 子类只复写了部分抽象方法，子类还是一个抽象类

	void study(){
		System.out.println("base study.");
	}
	abstract void sing();
}

class AdvStudent extends Student{  // 子类复写了所有抽象方法，子类可以创建对象调用方法。

	void study(){
		System.out.println("adv study.");
	}

	void sing(){
		System.out.println("adv sing.");
	}
}

class AbstractDemo{
	public static void main(String [] args){ // 抽象类并不影响静态方法的调用
			Student.sleep();
			AdvStudent s = new AdvStudent();
			s.study();
			s.sing();
	}
}







