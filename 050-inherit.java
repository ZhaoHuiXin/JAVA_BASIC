/*
	将学生和工人的共性描述提取出来，单独使用一个类进行描述
	只要让学生和工人与单独描述的这个类有关系，就可以了
	继承：
		1.提高了代码的复用性
		2.继承让类与类之间产生了关系。有了这个关系，才有了多态的特性。

	注意：千万不要为了获取其他类的功能，简化代码而继承；必须是类与类之间有所属关系(is a)才可以继承


	Java语言中：java只支持单继承，不支持多继承（同时继承）。
	因为多继承容易带来安全隐患。（不同父类的方法冲突），优化了c++部分，c++支持多继承
	但是java保留了这种机制，并用了另一种体现形式来完成表示————多实现（多继承的改良）

	Java支持多层继承。也就是一个集成体系
	如何使用一个继承体系中的功能呢？
		想要使用体系，先查阅体系中父类的描述，因为父类中定义的是该体系中的共性功能。
		通过了解共性功能，就可以知道该体系的基本功能。
		那么这个体系已经可以基本使用了。
		但是在具体调用时，要创建最子类的对象，为什么呢？
			一是因为有可能父类不能创建对象
			二是创建子类对象可以使用更多的功能，包括父类的也包括子类特有的

	简单一句话：查阅父类功能，创建子类对象（使用功能）。


	聚集关系：has a  球队和球员
	聚合：

	组合： 人和心脏
*/


// class Student{
// 	private String name;  // private不会被继承
// 	private int age;
// 	void study(){
// 		System.out.println("good study");
// 	}
// }

// class Worker{
// 	private String name;
// 	private int age;
// 	void work(){
// 		System.out.println("good work");
// 	}
// }

class Person{
	String name;
	private int age; // 私有不会被继承
}

class Student extends Person{

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

	void study(){
		System.out.println("good study");
	}
}

class Worker extends Person{
	void work(){
		System.out.println("good work");
	}
}

class ExtendsDemo{
	public static void main(String[] args){
		Student st = new Student();
		MyUtil.println(st.getName());
		st.setName("apple");
		MyUtil.println(st.getName());

	}
}








