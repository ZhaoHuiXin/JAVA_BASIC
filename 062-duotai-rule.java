class Fu{
	int num = 5;
	void method1(){
		System.out.println("fu method_1");
	}

	void method2(){
		System.out.println("fu method_2");
	}

	static void method4(){
		System.out.println("fu method_4");
	}
}

class Zi extends Fu{
	int num = 8;
	void method1(){
		System.out.println("zi method_1");
	}

	void method3(){
		System.out.println("zi method_3");
	}

	static void method4(){
		System.out.println("zi method_4");
	}

}

class DuoTaiDemo3{
	public static void main(String [] args){

		Fu f = new Zi();
		f.method1(); 
		f.method2(); // fu method2
		// f.method3(); // Fu类没有 method3方法；编译的时候，编译器只看f所属的类有么有该方法,所以编译不过
		/* zi method1；
		在多态中成员函数（非静态static）的特点：
		   		在编译时期：参阅引用型变量所属的类中是否有调用的方法。（编译时看Fu类中有么有method1，2）
		    如果有，编译通过，如果没有，编译失败
		   		在运行时期：参阅对象所属的类中是否有调用的方法.（运行时看Zi类中有没有method1，2；
		   	有的话运行自己的，没有的话运行父类的）
		   		简单总结：
		   	函数在多态调用时，"编译看左边，运行看右边。" ❗❗❗❗❗❗❗❗❗❗❗❗❗❗

		*/
		

		System.out.println(f.num); // 5
		Zi z = new Zi();
		System.out.println(z.num); // 8
		/*
		在多态中成员变量的特点：
			多态中的成员变量，无论编译和运行，都参考等号左边（即引用型变量所属的类 Zi z = new Zi();）
		*/

		f.method4(); // fu method_4;
		z.method4(); // zi method_4;
		/*
		在多态中静态成员函数的特点（static），静态变量也如是:
			无论编译和运行，都参考等号左边（引用型变量所属的类 Zi z = new Zi();）
		*/

		/*
		方法区{
			静态区：Fu. Zi. static
			非静态区：this,  super
		}
		总结：对象在调用非静态方法时，访问的是对象中那些数据；
		而静态方法本身不访问对象特有数据，所以都可以只用类名调用，这样的话，
		只需看这个引用型变量所属类中的成员（找的是静态区的方法，不参考右边的对象）
		*/

		/*
		静态绑定：
		当method4方法一进内存，因为是静态方法，它就已经被绑定在method4方法所属的类上，（在静态区）
		动态绑定：
		method1 被具体的对象调用，在方法区的非静态区，须通过new一个对象来调用
		*/

		/*
		父类引用指向自己的子类对象，对于静态方法来讲是不一样的，父类走父类、子类走子类。
		*/

	}
}








