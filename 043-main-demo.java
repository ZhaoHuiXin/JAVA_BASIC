/*
	public static void main(String[] args)
	主函数：是一个特殊的函数，可以被jvm调用，作为程序的入口
	主函数的定义：
		1.public 代表该函数访问权限是最大的
		2.static 代表主函数随着类的加载就已经存在了（虚拟机直接来了个 类名.main() ）
		3.主函数没有具体的返回值
		4.main 并不是关键字，但是是一个特殊的单词，它可以被JVM识别
		5.函数的参数	(String[] args)；参数类型是一个数组，该数组中的元素是字符串。字符串类型的数组（存储字符串类型元素的数组）
		6.主函数是固定格式的：jvm识别，主函数唯一能改的就是 args 变量名；早期版本是arguments
	虚拟机调用main的时候传的什么参数？
		[Ljava.lang.String;@2437c6dc --- 真往里传了个字符串类型的数组(长度为0)
		JVM在调用主函数时，传入的是 new String[0]; 有啥用呢？
			那就是我们也可以向main主函数中传值，传数据， 命令行加参数 java MainDemo haha hehe heihei ....

*/
class MainDemo{
	public static void main(String[] args){
		System.out.println(args.length);
		for(int x = 0; x<args.length; x++){
			System.out.println(args[x]);
		}
	}
}