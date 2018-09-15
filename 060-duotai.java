/*
	多态：可以理解为事物存在的多种体现形态
	动物：阿猫阿狗
	猫 x = new 猫();
	动物 a = new 猫();
	1.多态的体现：
		父类的引用指向了自己的子类对象；
		父类的引用也可以接收自己的子类对象。
	2.多态的前提：
		必须是类与类之间的关系。要么继承（类、抽象类），要么实现（接口）。
		通常还有一个前提：存在覆盖（父类的方法要有被子类覆盖个性化的才有意义）
	3.多态的好处：
		多态的出现提高了程序的扩展性
	4.多态的弊端：
		提高了扩展性，但是只能使用父类的引用访问父类中的成员（要想访问子类中的成员，需要做向下转型）
								060-duotai.java:51: 错误: 找不到符号
								x.catchMouse();
								 ^
								  符号:   方法 catchMouse()
								  位置: 类型为Animal的变量 x
								1 个错误
	5.多态的应用：
		061-duotai.java
	6.多态的出现代码中的特点（多态使用的注意事项）：
		

		
*/

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}

	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("狗吃骨头");
	}

	public void kanJia(){
		System.out.println("狗看家");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		function(new Cat());
		function(new Dog());
		Animal x = new Cat(); 
		/* 
		类型提升(向上转型)，把猫提升为了动物
		如果想要调用猫的特有方法时，如何操作？
		可以 强制将父类的引用转成子类类型(向下转型)
		但是如果父类可以实例化，并且他实例化了一个对象，那么不能强制将他转成Cat类型
		只对那些从下面上来的可以强制向下转型
		千万不要将父类对象转成子类类型，
		能转换的是父类的引用指向了自己的子类对象时，该引用可以被提升也可以被转换
		多态自始至终都是子类的对象在做着变化，一会变猫一会儿变Animal
		*/
		Cat c = (Cat)x;
		x.eat();
		c.catchMouse();
		// x.catchMouse(); 体现了多态的弊端，
		// 只能使用父类的引用访问父类中的成员，即使是使用子类创建的实例
	}

	public static void function(Animal a){
		a.eat();
		// instanceof （判断对象是谁的实例）
		// 通常子类型是有限的；或者某个类型有特殊的应用，使用instanceof
		if (a instanceof Cat){ 
			Cat b = (Cat)a;
			b.catchMouse();
		}else if (a instanceof Dog){
			Dog c = (Dog)a;
			c.kanJia();
		}
	}
}






