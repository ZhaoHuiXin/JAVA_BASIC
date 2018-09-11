/*
	查表法十进制转十六进制
	0 1 2 3 4 5 6 7 8 9 A B C D E F 十六进制中的元素
	0~15 角标
*/

class SearchTable
{
	public static void main(String[] args)
	{
		toHex(60);
		toHex(-60);
		toBin(6);
		toBin(-6);
	}

	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		// 除StringBuffer reverse 存储结果，也可以用临时容器来存储
		char[] arr = new char[8];

		int pos = arr.length;
		for(int x = 0; x < 8; x++)
		{
			if (num == 0)
			{
				break;
			}
			int temp = num &15;
			num = num >>> 4;
			arr[--pos] = chs[temp];
		}

		for(int x = pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}

	public static void toBin(int num)
	{
		char[] chs = {'0','1'};
		char[] arr = new char[32];
		int pos = arr.length;

		while (num != 0)
		{
			int temp = num & 1;
			arr[--pos] = chs[temp];
			num = num >>> 1;

		}

		for (int x = pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}