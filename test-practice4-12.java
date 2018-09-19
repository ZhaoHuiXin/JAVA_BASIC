interface A{
	public abstract void show();
}

interface B{
	public void add (int a, int b);
}

class C implements A,B{
	private int num;

	public void add(int a, int b){
		this.num = a + b;
	}

	public void show(){
		MyUtil.println("a + b = " + num);
	}
}

class D{
	public static void main(String[] args){
		C c = new C();
		c.add(4 ,2);
		c.show();
	}
}