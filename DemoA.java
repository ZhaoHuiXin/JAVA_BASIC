package packa;

public class DemoA extends packb.DemoB {
	public void show(){
		System.out.println("hello package");
	}
}



/*
PackageDemoA.java:3: 错误: 类 DemoA 是公共的, 应在名为 DemoA.java 的文件中声明
public class DemoA{
       ^
1 个错误


！类共有后， 类中的成员也要被共有才能被访问
*/

/*

	总结：
		1.包与包之间进行访问，被访问的包中的类及类中的成员，需要public修饰；
		2.不同包之间可以进行类的继承
		3.protected 不同包中子类成员的 保护权限，只能被继承，不能被直接调用

	包与包之间可以使用的权限有2中：public  static

	权限问题：
		    public    protected    default    private

同一个类中      ok         ok           ok         ok

同一个包中      ok         ok           ok          

子类           ok         ok

不同包中       ok

	注意：
		1.一个.java文件中不能出现2个及以上的共有类或接口，应再创建一个java文件，让它们package相同就行了
		2.package可以多层，packb.haha.hehe.hiahia;
*/