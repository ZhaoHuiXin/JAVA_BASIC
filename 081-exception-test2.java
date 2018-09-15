/*
	有一个圆形和一个长方形。
	都可以获取自己的面积，对于面积如果出现非法的数值，视为获取面积时出现的问题。
	问题通过异常来表示。
先要对程序进行基本的设计：

	try catch 把正常流程代码和问题处理代码分开，try是正常流程的代码，看正常逻辑只要看try部分内容将就行
而出了问题，只要看catch 部分内容就行；如果都用if来做的话，相当麻烦，有了try catch只要判断条件后跳转(抛
出)到异常处理逻辑就行
	以后遇到问题，全用异常描述进行封装对象
*/

// 这里把面积视为扩展功能；如果认为图形面积是基本功能的话，那就使用抽象类abstract而不要使用接口
// 如果图形建立不成功那么接下来的工作都么有意义，所以用RuntimeException


class IllegalArgumentException extends RuntimeException{
	IllegalArgumentException(String message){
		super(message);
	}
}

interface Shape{
	void getArea();
}

class Rec implements Shape{

	private int len, wid;

	Rec(int len, int wid){
		if (len <= 0 || wid <=0){
			throw new IllegalArgumentException("图形构造参数有负数或0");
		}
		this.len = len;
		this.wid = wid;
	}

	public void getArea(){

		System.out.println(len * wid);
	}
}

class Circle implements Shape{
	private int radius;
	public static final double PI = 3.14; // PI常量作为共享数据了，使用static方便其他类调用

	Circle(int radius){
		if (radius <= 0){
			throw new RuntimeException("非法"); 
			// 直接抛父类RuntimeException也是可以的(那我还要自定义异常干嘛？个性化啊，比如名字更具有标示性)
		}
		this.radius = radius;
	}

	public void getArea(){
		System.out.println(this.radius * this.radius * PI);
	}
}

class ExceptionTest1{
	public static void main(String[] args){
		// Rec r = new Rec(3, -4);
		// r.getArea();

		Circle c = new Circle(-1);
		c.getArea();
	}
}






