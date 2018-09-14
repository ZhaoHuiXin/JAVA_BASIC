class Main99{
	public static void main(String[] args){
		Test t = new Test();
		t.function();
	}
}

class Test{
	static void function(){
		for(int x = 1; x < 10; x++){
			for(int y = 1; y <= x; y++){
				System.out.print(y + "*" + x + "=" + x*y + "\t");
			}
			System.out.println();
		}
	}
}