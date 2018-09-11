/*
	需求：需要在开发系统时对员工进行建模，员工包含3个属性：
		姓名、工号、工资。经理也是员工，但他除了含有员工的属性外，还有一个奖金属性。
		请使用继承方法实现员工类和经理类，要求类中提供必要的方法进行属性访问。

	分析：
		员工类：name id salary
		经理类：继承员工，并有自己特有的奖金属性（bonus）
*/
class AbstractDemo2{
	public static void main(String[] args){
		Staff s = new Staff(1000,"lucy", "001");
		s.work();
		Manager m = new Manager(100000,"jack", "002", 50000);
		m.work();
	}
}

abstract class Base{
	private int salary;
	private String name;
	private String id;
	Base(int s, String n, String id){
		this.salary = s;
		this.name = n;
		this.id = id;
	}

	public abstract void work();
}

class Staff extends Base{
	
	Staff(int s, String n, String id){
		super(s, n, id);
	}
	public void work(){
		System.out.println("staff work");
	}
}


class Manager extends Base{
	private int bonus;
	Manager(int s, String n, String id, int b){
		super(s, n, id);
		this.bonus = b;
	}
	public void work(){
		System.out.println("manager work");
	}
}