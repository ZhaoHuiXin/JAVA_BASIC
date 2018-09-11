class OperateBit
{
	public static void main(String[] args)
	{
		// 3<<2    0011-->1100
		System.out.println(3<<2);
		System.out.println(12>>2);
		// 规律左移： n*2^位移  右移： n/2^位移
		// 最快的运算时位运算，局限性是以2为基数增长

		// >>右移，最高位按原有最高位值来定 补什么(是1补1负数，是0补0)
		// >>>无符号右移，无论最高位是0还是1，都拿0来补位
	}
}