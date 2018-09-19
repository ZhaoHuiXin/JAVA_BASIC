interface Heart{
	public abstract void jump();
}

abstract class Eye{
	abstract void look();
}

class Mouth{
	void kiss(){
		MyUtil.println("👄");
	}
}

class Body{
	public static void function(){
		Heart h = new Heart(){ // 引用interface 也可以指向一个实例
			public void jump(){
				MyUtil.println("jumping !");
			}
		};
		h.jump();

		new Eye(){
			void look(){
				MyUtil.println("👀");
			}
		}.look();

		new Mouth().kiss();

		new Mouth(){
			void kiss(){
				MyUtil.println("👄 👄 👄 👄 👄");
			}
		}.kiss();
	}
}

class TestAnC{
	public static void main(String[] args){
		Body.function();
	}
}