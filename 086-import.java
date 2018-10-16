/*
	为了简化 带包名的类名书写，使用关键字import

	import packa.*，将 packa 包中根目录中的 类 全部导入，如果有子包，不会导入子包中的类；

	import时，若不同包中有同名类，那么在使用这个同名类的时候必须加 包名

	建议定义包名不要重复，可以使用url来完成定义，url是唯一的。

	package cn.itcast.demo
	package cn.itcast.test
*/

import packa.DemoA;

class ImportDemo{
	public static void main(String[] args){
		DemoA d = new DemoA();
		d.show();
	}
}