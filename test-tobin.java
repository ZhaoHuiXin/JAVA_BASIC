class ToBinDemo{
	public static void main(String[] args){
		ToBinUtil.toBin(60);
	}
}


class ToBinUtil{

	public static void toBin(int n){
		base(n, 1, 1);
	}

	public static void base(int n, int base, int offset){
		char[] table = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		char[] res = new char[32];
		int position = res.length;
		while (n >0){
			int index = n & base;
			res[--position] = table[index];
			n = n >>> offset;	
		}
		for(int i = position; i<res.length; i++){
			if(i == res.length - 1){
				System.out.println(res[i]);
				return;
			}
			System.out.print(res[i] + " ");
		}
	}
}