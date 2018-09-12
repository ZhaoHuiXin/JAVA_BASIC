/*
	基础班的学生：
		学习，睡觉
	高级班学生：
		学习、睡觉
	可以将这两类事物进行抽取
*/

abstract class Student{
	public abstract void study();
	public void sleep(){
		// 如果子类有个别的不一样，那么只将那个子类重写该方法就行
		// ，而不是定义为抽象，让大多数的子类都重复的重写
		System.out.println("一般躺着睡"); 
	}
}

class BaseStudent extends Student{
	public void study(){
		System.out.println("base study");
	}
	public void sleep(){
		System.out.println("基础班站着睡"); 
	}
}

class AdvStudent extends Student{
	public void study(){
		System.out.println("adv study");
	}
}

class DoStudent{
	private DoStudent(){};
	public static void doSome(Student s){
		s.study();
		s.sleep();
	}
}

class DuoTaiDemo2{
	public static void main(String[] args){
		// doSome(new BaseStudent());
		// doSome(new AdvStudent());
		DoStudent.doSome(new BaseStudent());
		DoStudent.doSome(new AdvStudent());
		// 多态将对象调用变简单了。
	}

	/*
	public void doSome(Student s){
061-duotai.java:35: 错误: 无法从静态上下文中引用非静态 方法 doSome(Student)
		doSome(new BaseStudent());
		^
061-duotai.java:36: 错误: 无法从静态上下文中引用非静态 方法 doSome(Student)
		doSome(new AdvStudent());
	*/
	/*	
	可以抽取出去单独封装
	public static void doSome(Student s){
		s.study();
		s.sleep();
	}
	*/
}