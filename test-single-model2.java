

class TestSingle2{
	public static void main(String[] args){
		SingleFull s1 = SingleFull.getInstance();
		System.out.println("s1.getName = " + s1.getName());
		SingleFull s2 = SingleFull.getInstance();
		System.out.println("s2.getName = " + s2.getName());
		s2.setName("lucy");
		System.out.println("s1.getName = " + s1.getName());
		System.out.println("s2.getName = " + s2.getName());
	}
}

class SingleFull{
	private SingleFull(){}
	private static SingleFull s = null;
	public static SingleFull getInstance(){
		if (s == null){
			synchronized(Single.class){
				if(s == null){
					s = new SingleFull();
				}
			}
		}
		return s;
	}

	private String name;

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

}