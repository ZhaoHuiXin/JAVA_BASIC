abstract class Person{
	String name;
	int age;
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}

	abstract void introduce();
}

interface Love{
	public static final String LOVER = "killer";
	// public abstract void confession();
	public abstract void confession(String name); // 这里在实现的时候，形参名可以不一样的哦
}


class Man extends Person implements Love{
	Man(String name, int age){
		super(name, age);
	}

	void introduce(){
		MyUtil.println("hello everyone! my name is "+ this.name +", I'm "+ this.age +" old.");
	}

	// public void confession(String who){      错误: Man不是抽象的, 并且未覆盖Love中的抽象方法confession()
	// 	MyUtil.println(who + ", I love you.");
	// }
	/**
	Man类实现父类Person的introduce功能
	*/
	public void confession(String who){
		MyUtil.println(who + ", I love you.");
	}
}

class Woman extends Person implements Love{
	Woman(String name, int age){
		super(name, age);
	}

	/**
	Woman类实现父类Person 的introduce功能
	*/
	void introduce(){
		MyUtil.println("hello everyone! my name is "+ this.name +", I'm "+ this.age +" old.");
	}

	public void confession(String who){
		MyUtil.println(who + ", I love you.");
	}
}

class TestDuoTai1{
	public static void main(String[] args){
		function(new Man("冬哥", 18));
		function(new Woman("小南", 17));
	}

	static void function(Person p){
		p.introduce();
		if (p instanceof Man){
			Man mp = (Man)p;
			mp.confession("小南");
		}
		if (p instanceof Woman){
			Woman wmp = (Woman)p;
			wmp.confession("冬哥");
		}
	}
}

