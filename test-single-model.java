class SingleHungry{
	private int num = 10;

	private SingleHungry(){};

	private static final SingleHungry s = new SingleHungry();

	public static SingleHungry getInstance(){
		return s;
	}

	public int getNum(){
		return num;
	}

	public void setNum(int x){
		this.num = x;
	}
}

class SingleFull{
	private SingleFull(){};

	private int num = 9;

	private static SingleFull s = null;

	public static SingleFull getInstance(){
		if (s == null){
			synchronized(SingleFull.class){
				if (s == null){
					s = new SingleFull();
				}
			}
		}
		return s;
	}

	public int getNum(){
		return this.num;
	}

	public void setNum(int num){
		this.num = num;
	}

}




class SingleModelTest{
	public static void main(String[] args){
		SingleHungry sh = SingleHungry.getInstance();
		System.out.println(sh.getNum());
		sh.setNum(100);
		System.out.println(sh.getNum());


		SingleFull sf = SingleFull.getInstance();
		System.out.println(sf.getNum());
		sf.setNum(99);
		System.out.println(sf.getNum());
	}
}