/** 
这是一个可以对数组进行操作的工具类，该类中提供了获取最值排序等功能
@author 冬哥
@version V1.1
javadoc -d myhelp -author -version xxx.java

*/
// 凡是被public修饰符的功能都可以被文档注释描述，因为它们都可以被文档注释工具所提取
// 想给一个类生成帮助文档，这个类必须是被public修饰的
/* javadoc 。。。
正在加载源文件046-javadoc.java...
正在构造 Javadoc 信息...
046-javadoc.java:11: 错误: 类 ArrayTool 是公共的, 应在名为 ArrayTool.java 的文件中声明
public class ArrayTool{
       ^
1 个错误


正在生成myhelp/ArrayTool.html...
ArrayTool.java:59: 错误: @return 的用法无效
	@return 会返回一个该数组中最大值
	^
ArrayTool.java:74: 错误: @return 的用法无效
	@return 会返回一个该数组中最大值
	^
ArrayTool.java:90: 警告: arr没有 @param
	public static void printArray(int[] arr){
	                   ^
*/


// class ArrayTool{
public class ArrayTool{

	/**
	空参数构造函数
	*/
	private ArrayTool(){};
	/**
	获取一个整形数组中的最大值
	@param arr 接收一个int类型的数组
	@return 会返回一个该数组中最大值
	*/
	public static int getMax(int[] arr){

		int max = 0;
		for(int x = 1; x < arr.length; x++){
			if (arr[x] > arr[max]){
				max = x;
			}
		}
		return arr[max];
	}
	/**
	获取一个整形数组中的最小值
	@param arr 接收一个int类型的数组
	@return 会返回一个该数组中最大值
	*/
	public static int getMin(int[] arr){

		int min = 0;
		for(int x = 1; x < arr.length; x++){
			if (arr[x] < arr[min]){
				min = x;
			}
		}
		return arr[min];
	}

	/**
	给int数组选择排序
	@param arr 接收一个int类型的数组
	*/
	public static void selectSort(int[] arr){
		for (int x=0; x<arr.length-1; x++){
			for(int y=x+1;  y< arr.length; y++){
				if (arr[x] > arr[y]){
					swap(arr,x,y);
				}
			}
		}
	}

	/**
	给int数组冒泡排序
	@param arr 接收一个int类型的数组
	*/
	public static void bubbleSort(int[] arr){
		for (int x=0; x<arr.length+1; x++){
			for (int y=0; y<arr.length-x-1; y++){
				if (arr[y]>arr[y+1]){
					swap(arr, y, y+1);
				}
			}
		}

	}
	
	/**
	用于打印数组中的元素。打印形式是：[elemet1, elem2...]
	@param arr 接收一个int类型的数组
	*/
	public static void printArray(int[] arr){
		for (int x = 0; x < arr.length; x++){
			if (x == arr.length-1){
				System.out.println(arr[x]);
				return;
			}
			System.out.print(arr[x]);
		}
	}
	/**
	给数组中元素进行位置的置换
	@param arr 接收一个int类型的数组
	@param a 要置换的位置
	@param b 要置换的位置
	*/
	private static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}