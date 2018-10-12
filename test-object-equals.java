class DiyEquals{
	int num = 100;
	public boolean equals(Object obj){
		if (!(obj instanceof DiyEquals)){
			return false;
		}

		DiyEquals other = (DiyEquals)obj;
		return other.num == this.num;
	}
}

class MainDiyeEquals{
	public static void main(String[] args){
		DiyEquals a = new DiyEquals();
		DiyEquals b = new DiyEquals();
		b.num = 101;
		System.out.println(a.equals(b));
	}
}