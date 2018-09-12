/*
	Object：是所有对象的直接或者间接父类，传说中的上帝
	该类中定义的肯定是所有对象都具备的功能。

	Object类中已经提供了对 对象是否相同的比较方法
	如果自定义类中也有比较相同的功能，没有必要重新定义。
	只要沿袭父类中的功能，建立自己特有的比较内容即可；即覆盖Object的equals方法
*/
class Demo{  // extends Object
	private int num;
	Demo(int num){
		this.num = num;
	}

	// 覆盖Object的equals方法，个性化
	public boolean equals(Object obj){ // 所有类向上转型为Object(Obejct obj = new Demo();)，
		// 而Object中没有num
		if (!(obj instanceof Demo)){
			return false;
		}
		Demo d = (Demo)obj;
		return this.num == d.num;
	}

	// 覆盖Object的toString方法，个性化
	public String toString(){
		return "demo:" + this.num;
	}
}

class ObjectDemo{
	public static void main(String[] args){
		Demo a = new Demo(3);
		System.out.println(a.toString());
		Demo b = new Demo(4);
		System.out.println(b.toString());
		System.out.println(a.equals(b));

		System.out.println(Integer.toHexString(a.hashCode())); // 获得对象的哈希值（内存地址）并转为16进制
		System.out.println(a.toString());
		System.out.println(a.getClass());

		Class c = a.getClass();
		System.out.println(c.getName());
		System.out.println(c.getMethods());
		// toString 的实现
		System.out.println(c.getName() + "@@" + Integer.toHexString(a.hashCode()));
	}
}