/*
	接口的特点：
		1.接口是对外暴露的规则
		2.提高功能的扩展性
		3.降低耦合度
	需求：

*/

interface BadHobby{
	public abstract void smoke();
}

abstract class Student{
	abstract void study();
	void sleep(){
		System.out.println("sleep");
	}
}

// 在学生以外的，体系以外的 "功能扩展"，即继承了学生的功能，又实现了附加的坏习惯
// 继承 是 is a； 接口是 like a
class ZhangSan extends Student implements BadHobby{
	void study(){
		System.out.println("张三继承并实现 Student 的抽象方法 study");
	}
	public void smoke(){
		System.out.println("张三实现了接口 BadHobby 的方法smoke");
	}
}

class Lisi extends Student{
	void study(){
		MyUtil.println("LiSi study but LiSi don't smoke");
	}
}


// 玩什么不确定，确定的是学java肯定不是play中的内容
abstract class Sporter{
	// 假如有运动员学java，那么这个就是运动员的扩展功能，应该写成接口
	abstract void play();
}

interface StudyJava{
	public abstract void study();
}

class WangWu extends Sporter implements StudyJava{
	void play(){
		MyUtil.println("Wang Wu play with butterfly");
	}

	public void study(){
		MyUtil.println("wang wu study very hardly");
	}
}


class InterfacePracticeDemo{
	public static void main(String[] args){
		ZhangSan zs = new ZhangSan();
		zs.study();
		zs.smoke();

		Lisi ls = new Lisi();
		ls.sleep();
		ls.study();

		WangWu ww = new WangWu();
		ww.play();
		ww.study();

	}
}






