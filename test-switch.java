class TestSwitch{
	public static void main(String[] args){
		int x = 4;
		// can't use == ...
		switch(x){
			case 2:
			System.out.println("a");
			break;
			case 3:
			System.out.println("b");
			break;
			default:
			System.out.println("c");
			break;
		}
	}
}