abstract class GetRuntime{

	public final void getRuntime(){
		long start = System.currentTimeMillis();

		runcode();

		long end = System.currentTimeMillis();

		System.out.println("毫秒: " + (end - start));
	}

	public abstract void runcode();
}

class TestGetTime extends GetRuntime{
	public void runcode(){
		int a = 0;
		for (int i = 0; i < 10000000; i++){
			a ++ ;
		}
		MyUtil.println(a);
	}
}


class TemplateMethodDemo{
	public static void main(String[] args){
		TestGetTime tg = new TestGetTime();
		tg.getRuntime();
	}
}