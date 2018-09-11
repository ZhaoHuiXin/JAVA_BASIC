class ToBin
{
	public static void main(String[] args)
	{
		toBin(6);
		
		toHex(60);

	}

	// 十进制转二进制
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();
		while (num > 0)
		{
			// System.out.println(num % 2);
			sb.append(num % 2);
			num = num / 2;
		}

		System.out.println(sb.reverse());
	}

	// 十进制 转  十六进制
	public static void toHex(int num)
	{	StringBuffer sb = new StringBuffer();
		for (int x = 0; x < 8; x ++)
		{
			int temp = num & 15;
			if (temp > 9)
			{
				sb.append((char)(temp-10+'A'));
				num = num >>> 4;
				continue;
			}
			num = num >>> 4;
			sb.append(temp);
		}
		System.out.println(sb.reverse());

	}
}