/*	模板方法模式：
	需求：获取一段程序运行的时间
	原理：获取程序开始和结束的时间并相减即可。
	获取时间： System.currentTimeMillis();

	当代码完成优化后，就可以解决这类问题，
	它称为模板方法设计模式；
		在定义功能时，功能的一部分是确定的，但一部分是不确定的，而确定的部分在使用不确定的部分，
	那么这时就将不确定的部分暴露出去，由该类的子类去完成。（但是被暴露的部分不一定是抽象的，如模板在一个方法中有一部分默认的实现）
		1.提高扩展性
		2.提高复用性

*/

class TemplateMethod{
	public static void main(String[] arg){

		SubTime gt2 = new SubTime();
		gt2.getTime();
	}
}

abstract class GetTime{
	// 只让子类复写runcode，不让子类复写getTime(不能使用private哦，否则子类也访问不到getTime了)，skr
	public final void getTime(){  
		long start = System.currentTimeMillis();

		runcode();

		long end = System.currentTimeMillis();

		System.out.println("毫秒: " + (end - start));
	}
	public abstract void runcode();
}

class SubTime extends GetTime{
	public void runcode(){
		for(int x=0; x<4000; x++){
			System.out.println(x);
		}
	}
}