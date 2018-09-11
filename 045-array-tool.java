/*
	两个java文件，045中有主函数main，并且它调用了044中的ArrayTool，
正常顺序是先编译044再编译045；如果想省事，那么可以将044命名为ArrayTool.java，
此时直接编译045即可，它会自动找ArrayTool的java包进行编译
*/
class ArrayToolDemo{
	public static void main(String[] args){
		int[] arr = {3,1,87,32,8};
		/*ArrayTool tool = new ArrayTool();

		int max = tool.getMax(arr);
		System.out.println("max=" + max);

		int min = tool.getMin(arr);
		System.out.println("Min=" + min);

		tool.printArray(arr);
		tool.selectSort(arr);
		tool.printArray(arr);*/

		// ArrayTool中的特有数据一点都没用到，还得去实例化它，有点多此一举
		/*
		发现问题：
			1.对象是用来封装数据的，可是ArrayTool对象并未封装特有数据
			2.操作数组的每一个方法都没有用到ArrayTool对象中的特有数据
			attention！此时就应该考虑，让程序更加严谨，不需要实例化对象的。
		可以将ArrayTool中的方法都定义成static的，直接通过类名调用即可。
			像ArrayTool这种类通常我们称为工具类（通常工具类里都是定义的静态方法）
		它也是可以创建对象的，但是没什么意义。
			当方法都静态后可以方便于使用，但是该类还是被其他程序建立对象的，为了更为严谨，
		强制该类不能建立对象，（将构造函数私有化！！）
		*/
		int max = ArrayTool.getMax(arr);
		System.out.println("max=" + max);
	}
}