class VarTransfer
{
	public static void main(String[] args)
	{
		//类型转换
		byte b = 3; // 会判断3是否在byte范围内，做自动类型转换

		// java是强类型语言，byte占1个8位，2是整数类型默认占4个8位
		// 不同类型间不能直接进行运算，自动 类型提升，以大的为主，小的向大的提升（向上转型）
		// b = b + 2; // b+2是个不确定的整数，不一定在byte范围内，所以报错
		// 运算结果是4两的碗，不能赋值给b（byte类型1两的碗）	
		// 想这么干，做强制类型转换
		b = (byte)(b + 2);	
		System.out.println(b);


		/*
		1.int 和 float都是4个8位，运算结果是float
		2.char类型是可以进行运算的，对应ascii码表有数字
		*/

		System.out.println('a');
		System.out.println('a' + 1); // ascii码 98
		System.out.println((char)('a' + 1)); // 转ascii码为 char
	}
}