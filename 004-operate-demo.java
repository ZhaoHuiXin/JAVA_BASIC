class OperateDemo
{
	public static void main(String[] args)
	{
		int x = 4720;

		x = x/1000 * 1000;
		System.out.println(x); 
		// 结果是4000,因为x是int型，1000也是int型，x/1000 结果是int型
		System.out.println(-1%5);      // 正负号只和左边有关
		System.out.println(1%-5);

		int a = 3, b;
		// b得初始化后才能进行运算
		// ++给a变量中的值进行+1操作，并把+1操作后的值重新赋给a
		b = a++; // 先把a的值赋给b，然后a再自增，所以b是3，a是4
		System.out.println(a);
		System.out.println(b);

		b = ++a; // a先自增，然后把a的值赋给b，所以b是3，a是4
		System.out.println(a);
		System.out.println(b);

		// 字符串连接符，字符串数据和任何数据使用+都是连接，最终都会变为字符串
		System.out.println("hhhhhhhhhhhhhh" + "aaaaaaaaaaaa");
		System.out.println("5+5="+5+5);
		System.out.println(a + "," +b);

		// 转义字符 通过 \ 符号转变后面字母或符号的含义
		// \b退格，\r按下回车键，\n换行，\t制表符
		// linux系统中换行用一个字符表示\n;
		// 在windows中，换行是\r\n;DOS中直接能识别\n
		// println  ln会在结尾换行一次
		System.out.print("hello world \n");
		System.out.println("hello java"); 

		short s = 4;
		// s = s + 5; 无法运算，2两装4两
		s += 5; //只做赋值运算，内部有自动转换动作

		/*
			== 是比较运算符，结果要么true要么false
		*/
		System.out.println(3>4);
		System.out.println(3==4);
		System.out.println(3!=4);
	}
}