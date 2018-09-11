class Opti{
	public static void main(String[] args){
		toBin(48);
	}
	public static void toBin(int num){
		trans(num, 1, 1);
	}

	public static void trans(int num, int base, int offset){
		if (num == 0){
			System.out.println(0);
		}

		char[] numArr = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		char[] arr = new char[32];

		int pos = arr.length;

		while (num > 0){
			int tempNum = num & base;
			arr[--pos] = numArr[tempNum];
			num = num >>> offset;
		}
		
		for (int i = pos; i < arr.length; i++){
			if (i == arr.length - 1){
				System.out.println(arr[i]);
			}
			System.out.print(arr[i]);
		}
	}

	public static void trans2(int num, int base, int offset)
	{	
		if  (num == 0)
		{
			System.out.println(0);
			return;
		}

		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		char[] arr = new char[32];

		int pos = arr.length;

		while (num != 0)
		{
			int temp =num & base;
			// 末尾索引正好是length-1，所以先-- 再使用
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
		// 此时pos经过多次 --pos，已经在首个非0位置
		for(int x=pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
