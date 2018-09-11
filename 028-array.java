/*
数组：同一种类型数据的集合。其实数据就是一个容器。可以装任意类型元素，但一次只能装同一种类型
定义格式：
	1. 元素类型[] 数组名 = new  元素类型[元素个数或数组长度];
		int[] arr = new int [5];
		int arr[] = new int [5]; 这种写法也是可以的
	2. 元素类型[] 数组名 = new 元素类型[]{元素1， 元素2， ...}；
		int[] arr = new int[]{3, 4, 1, 7};  不要写长度，容易出错啊
		int[] arr = {3, 5, 1, 7}
*/

class ArrayDemo
{
	public static void main(String[] args)
	{
		// 需求：想定义一个可以存储3个整数的容器。
		// x是数组类型，也是3中种引用类型的一种
		int[] x = new int[3];  
		/* JAVA启动时一共在内存中划分了5片空间进行自己数据的存储
		1.栈内存：
			用于存储“局部变量”（定义在方法中的变量，方法参数上的变量，for循环中的变量全都是局部变量），当数据使用完，所占用空间会自动释放
		2.堆内存：
			数组和对象，通过“new建立的实例（实体）”都存放在堆内存中
			每一个实体都有内存地址值
			实体中的变量都有默认初始化值(int 0; double 0.0; float 0.0f; boolean false; )
			实体不再被使用，会在不确定的是时间内被垃圾回收器回收
		3-5  方法区；本地方法区；寄存器
		*/

		// 打印数组中角标为0的元素的值
		System.out.println(x[0]);
		x[0] = 90;
		System.out.println(x[0]);

		// 不想让x引用数组了，使用null解绑，只有引用数据类型才能使用null
		// 此时数组在栈内存中没有任何引用所使用它，它就变为垃圾了，
		// 会在不定时间内启动垃圾回收机制被堆内存清除（c++得程序员手动回收）
		x = null;
		System.out.println(x[0]);
	}
}





