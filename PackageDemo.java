/*
	package:
		对文件进行分类管理
		给类提供多层命名空间
		卸载程序文件的第一行
		类的全称是  包名.类名
		包也是一种封装形式

		javac -d .(类文件要存放的目录) PackageDemo.java
*/
package pack; // 定义包名，所有字母小写

class PackageDemo{
	public static void main(String[] args){
		System.out.println("hello world");
		packa.DemoA d = new packa.DemoA();
		d.show();
		d.method();
	}
}		

/*
1.不使用包名报错：
PackageDemo.java:16: 错误: 找不到符号
		DemoA d = new DemoA();
		^
  符号:   类 DemoA  错误原因类名写错，此时类名的全名是   包名.类名
  位置: 类 PackageDemo
PackageDemo.java:16: 错误: 找不到符号
		DemoA d = new DemoA();
		              ^
  符号:   类 DemoA
  位置: 类 PackageDemo
2 个错误

2.非 public 类报错
PackageDemo.java:16: 错误: DemoA在packa中不是公共的; 无法从外部程序包中对其进行访问
		packa.DemoA d = new packa.DemoA();
		     ^
PackageDemo.java:16: 错误: DemoA在packa中不是公共的; 无法从外部程序包中对其进行访问
		packa.DemoA d = new packa.DemoA();
		                         ^
2 个错误

3.非public方法报错
PackageDemo.java:17: 错误: show()在DemoA中不是公共的; 无法从外部程序包中对其进行访问
		d.show();
		 ^
1 个错误

*/