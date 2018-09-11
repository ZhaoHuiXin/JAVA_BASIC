/*
	单例模式，第二种写法

*/

/*
开发一般用饿汉式，安全简单，
懒汉式有个小问题，当多个人同时调用的时候，就可能有问题
（cpu处理到s=null切换了，另外一个程序执行这段代码，到null也停了，
等到2个程序都活了就创建了2个实例；使用同步锁解决这个问题synchronized）


(饿汉式)Single类一进内存就已经创建好了对象 Single. 的时候就有实例
class Single{
	private static Single s = new Single();
	private Single(){};
	public static Single getInstance(){
		return s;
	}
}
*/

// （懒汉式）方法被调用时才初始化，也叫做对象的延时加载，Single. 的时候还没有实例
// （Single类进内存对象还没有存在，只有调用了getInstance方法的时候，才建立对象）。
class Single{
	private static Single s = null;
	private Single(){};
	// public static Single getInstance(){
	// public static synchronized Single getInstance(){ 
	// 加了同步锁，效率就降低了,最终解决方案如下
	public static Single getInstance(){
		if (s == null){  
			synchronized(Single.class){ // s为null，锁文件
				// 如果a到这挂了，此时有个b执行，b成功创建实例后，a又活了，
				//会再进行一次判断，此时s已经不是null，a就不会重复创建实例了
				if(s==null){
						s = new Single();
				}
			}
		}
		return s;
	}
}

class SingleDemoTwo{

}




