class OperateLogic // 逻辑运算符
{
	public static void main(String[] args)
	{
		int x = 4;

		// 6 > x > 3; X
		// 逻辑运算符用于连接布尔类型的表达式 与&  或|  非!  异或^(XOR)
		// x > 3 & x < 6 // 结果是true or false
		// ^ 和 | 有一点不一样 true ^ true = false;
		System.out.println(x > 3 ^ x < 6 );
		// && ||  短路
		int a = 4;
		System.out.println(a > 3 & a < 6);	  // 左边为假时，还要去运算；不会快速失败
		System.out.println(a > 3 && a < 6);   // a=4时这俩目前没区别，a=2时 &&右边不运算，速度更快
		/*
			双&，左边为假，那么右边不参与运算
			双||，左边为真，右边不参与运算
		*/
	}
}