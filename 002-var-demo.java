class VarDemo
{
	public static void main(String[] args)
	{	
		/*  
			byte 1两
			short 2两
			int  4两
			long 8两

			float 4两
			double 8两
			
			char 2两
		*/
		//定义变量的格式：
		// 数据类型	变量名 = 初始化值
		int x = 4;
		System.out.println(x);
		// 已经有内存空间，直接改值即可
		x = 10;
		System.out.println(x);


		byte b = 2; //-128 ~ 127
		byte b1 = 127;

		short s = 30000; // -32768~32767

		long l = 4l;	// l标识是long

		float f = 2.3f;	// 小数默认是double，用f标识

		double d = 34.56;

		char ch = '4'; // char 占2个8位
		char ch1 = 'a';
		char ch2 = '+';
		char ch3 = ' ';
		boolean bo = true;
		boolean bo1 = false;

		/*
		当数据不确定时，需要对数据进行存储时，就定义一个变量来完成存储操作。
		*/
		int a = 5;
		a = a + 6;
		System.out.println(a);
	} // 同一区间不能使用同名变量，一个大花括号就是一个区间
}
