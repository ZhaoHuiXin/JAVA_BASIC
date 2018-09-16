abstract class Base{
	String name;
	int number;
	int salary;
	abstract void getName();
	abstract void getNumber();
	abstract void getSalary();

	Base(String name, int salary, int number){
		this.name = name;
		this.salary = salary;
		this.number = number;
	}
}

class Staff extends Base{
	Staff(String name, int salary, int number){
		super(name, salary, number);
	}
	void getName(){
		MyUtil.println(this.name);
	}

	void getSalary(){
		MyUtil.println(this.salary);
	}

	void getNumber(){
		MyUtil.println(this.number);
	}

	
}

class Manager extends Base{
	private int omg;
	Manager(String name, int salary, int number, int omg){
		super(name, salary, number);
		this.omg = omg;
	}
	void getName(){
		MyUtil.println(this.name);
	}

	void getSalary(){
		MyUtil.println(this.salary);
	}

	void getNumber(){
		MyUtil.println(this.number);
	}

	void getOmg(){
		MyUtil.println(this.omg);
	}

}

class TestAbstract
{
	public static void main(String[] args)
	{
		Staff sta = new Staff("lucy ", 10000, 12);
		sta.getNumber();
		sta.getName();
		sta.getSalary();

		Manager ma = new Manager("lucy ", 10000, 12, 1000000);
		ma.getNumber();
		ma.getName();
		ma.getSalary();
		ma.getOmg();
	}

}












