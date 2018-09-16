class TestSingle{
	public static void main(String[] args){
		Single a = Single.getInstance();
		System.out.println("a.getNum=" + a.getNum());
		Single b = Single.getInstance();
		System.out.println("b.getNum=" + b.getNum());
		b.setNum(100);
		System.out.println("a.getNum=" + a.getNum());
		System.out.println("b.getNum=" + b.getNum());
	}
}

class Single{
	private int num;
	private Single(){}

	private static Single si = new Single();
	public static Single getInstance(){
		return si;
	}

	public void setNum(int num){
		this.num = num;
	}

	public int getNum(){
		return this.num;
	}
}