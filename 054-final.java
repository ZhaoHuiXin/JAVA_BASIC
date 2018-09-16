/*
	final:最终，作为一个修饰符
		1.可以修饰函数，变量。
		2.被 "final" 修饰的 "类" 不可以被继承。（继承打破了封装性）
	为了避免被子类继承复写"功能"，可以使用final
		3.被final修饰的"方法"不能被复写的。
		4.被final修饰的变量是一个"常量"，只能赋值一次，既可以修饰成员变量，又可以修饰局部变量；
	当在描述事物时，一些数据的出现，值是固定的，这时为了增强阅读性，都给这些值起个名字，方便阅读。
	而这个值不需要改变，所以加上final修饰。
		作为常量：常量的书写规范是所有字母都大写，如果由多个单词组成，单词间用_连接。
		publiic static final double PI = 3.14;
		5.内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量。
*/

class FinalDemo{
	public static void main(String[] args){

	}
}

final class Demo{
	void show(){
	}
}

// 054-final.java:19: 错误: 无法从最终Demo进行继承
class SubDemo extends Demo{

}