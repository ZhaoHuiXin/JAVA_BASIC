

class T{
	private T(){};
	private static int secret = 1;

	public static void changeX(int x){
		secret = x;
	}

	public static void getX(){
		System.out.println(secret);
	}
}

class TestStaticVar{
	public static void main(String[] args){
		T.getX();
		T.changeX(5);
		T.getX();
	}
}