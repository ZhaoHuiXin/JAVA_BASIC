interface Inter{
	public abstract void show(int a, int b);
	public abstract void func();
}

class Demo{
	public static void main(String[] args){
		Inter i = new Inter(){
			public void show(int a, int b){
				MyUtil.println("a=" + a + ", b=" + b);
			}

			public void func(){
				MyUtil.println("ping pong ");
			}
		};
		i.show(100, 200);
		i.func();
	}
}