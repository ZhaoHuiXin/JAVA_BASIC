/*
	静态代码块
	格式：
	static
	{
		静态代码块中的执行语句
	}
	特点：
		随着类的加载而执行，并只执行一次
		用于给类进行初始化的
*/

class StaticCode{
	static{
		System.out.println("a");
	}
	public static void show(){
		System.out.println("halo");
	}
}

class StaticCodeDemo{
	static{
		System.out.println("b");
	}
	public static void main(String[] args){
	// 	new StaticCode();
	// 	new StaticCode();
		StaticCode.show();
		System.out.println("over");

	} 
	static{
		System.out.println("c");
	}
}
/*
预期结果： b,c,a,halo,over
实际结果： b,c,a,halo,over
*/