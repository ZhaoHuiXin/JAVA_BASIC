class ToBinTest
{
	public static void main(String [] args){
		Test.toBin(60);
	}	
}

class Test{
	private Test(){};
	public static void toBin(int num){
		trans(num, 1,1);
	}

	public static void toHex(int num){
		trans(num, 15, 4);
	}

	public static void toOct(int num){
		trans(num, 7, 3);
	}

	private static void trans(int num, int base, int offset){
		char[] charArr = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[32];
		if (num == 0){
			System.out.println('0');
			return;
		}
		int pos = arr.length;
		while (num >0){
			int index = num & base;
			arr[--pos] = charArr[index];
			num = num >>> offset;
		}
		for (int i=pos; i<arr.length; i++){
			if (i == arr.length-1){
				System.out.println(arr[i]);
			}
			System.out.print(arr[i]);
		}
	}
}