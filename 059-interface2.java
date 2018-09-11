/*
	接口的特点：
		1.接口是对外暴露的规则
		2.提高功能的扩展性
		3.降低耦合度
	需求：

*/

interface BadHobby{
	public static void smoke();
}

abstract class Student{
	abstract void study();
	void sleep(){
		System.out.println("sleep");
	}
}

// 在学生意外的，体系意外的 "功能扩展"，即继承了学生的功能，又实现了附加的坏习惯
// 继承 是 is a； 接口是 like a
class ZhangSan extends Student implements BadHobby{
	void study(){}
	public void smoke(){}
}

class Lisi extends Student{

}



class {
	public static void main(String[] args){

	}
}

// 玩什么不确定，确定的是学java肯定不是play中的内容
abstract class Sporter{
	// 假如有运动员学java，那么这个就是运动员的扩展功能，应该写成接口
	abstract void play();
}

interface StudyJava{
	public static void study();
}

class WangWu extends Sporter implements StudyJava{

}





