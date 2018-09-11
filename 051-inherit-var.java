/*
	子父类出现后，类中成员的特点

	类中成员：
		1.变量
		2.函数
		3.构造函数
	变量:
		如果子类中出现非私有的同名成员变量时，此时子类要访问蓓蕾中的变量，用this
		子类要访问父类中的变量，用super，super的使用和this几乎一致

		this代表本类对象的引用；
		super代表父类对象的引用
*/

class Dad{
	int num = 4;
}

class Son extends Dad{
	int num = 5;
	void show(){
		System.out.println(this.num); // 打印子类num
		// 打印父类num; 如果父类该变量是private，那么不能访问
		// 父类的num在哪片内存呢？
		// 答案：在堆内存哦，在new的时候给了默认值；加载Son.class之前先加载Dad.class，先有父再有子
		System.out.println(super.num); 
		// this和super都存在方法区的非静态区域
	}
}

class InheritDemo{
	public static void main(String[] args){

		Son s = new Son();
		s.show();
		System.out.println(s.num + "..." + s.num);
	}
}