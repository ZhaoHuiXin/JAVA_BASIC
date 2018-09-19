class Body{

	class Heart{
		void jump(){
			MyUtil.println("噗通 噗通");
		}
	}

	static class Eye{
		void look(){
			MyUtil.println("✨ ✨");
		}
	}

	static class Mouth{
		static void kiss(){
			MyUtil.println("👄");
		}
	}

	void function(final int a){
		final String who = "冬哥";
		class Leg{
			void run(){
				MyUtil.println(who + " Running..." + a + " kilometres");
			}
		}

		new Leg().run();
	}
}


class TestInner{
	public static void main(String[] args){
		Body.Heart h = new Body().new Heart();
		h.jump();
		// anonymous
		new Body().new Heart().jump();

		Body.Eye e = new Body.Eye();
		e.look();
		// anonymous
		new Body.Eye().look();
		
		Body.Mouth.kiss();

		new Body().function(3);
	}
}