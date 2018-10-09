class TestToBin{
	public static void main(String[] args){
		TransTool.toHex(60);
		TransTool.toOct(60);
		TransTool.toBin(60);
	}
}


class TransTool{
	public static void toHex(int num){
		trans(num, 15, 4);
	}

	public static void toOct(int num){
		trans(num, 7, 3);
	}

	public static void toBin(int num){
		trans(num, 1, 1);
	}

	public static void trans(int num, int base, int offset){
		char[] dicArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] result = new char[32];
		int pos = result.length;
		while(num != 0){
			int index = num & base;
			result[--pos] = dicArray[index];
			num = num >> offset;
		}

		for (int i=pos;i<result.length;i++){
			if (i == result.length-1){
				System.out.println(result[i]);
				return;
			}
			System.out.print(result[i]);
		}
	}
}