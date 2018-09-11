/*
	什么时候使用静态？
	从两方面下手：
	1.什么时候定义静态变量（类变量）❓
		对象中出现共享数据（数据指的是具体值，张三，而不是属性，name），
		该数据被静态所修饰，存在于 内存共享区（数据区）；
		而对象中特有的数据要定义成非静态存在于堆内存
	2.什么时候定义静态函数❓
		当功能内部没有访问到非静态数据（ 对象特有的数据，
		对象还没创建，主要意思是拿不到的数据，像在它之前出现在栈中的数据都是可以的），
		那么该功能可以定义为静态的。

	静态的应用
		若每一个应用程序中都有共性的功能，可以将这些功能抽取，独立封装，以便复用
*/
// class StaticDemo{
// 	public static void main(String[] args){
// 		int[] arr = {3,4,1,8};

// 		int max = getMax(arr);
// 		System.out.println("max=" + max);
// 	}

	// public static int getMax(int[] arr){
	// 	int max = 0;
	// 	for(int x = 1; x < arr.length; x++){
	// 		if (arr[i] > arr[max]){
	// 			max = x;
	// 		}
	// 	}
	// 	return arr[max];
	// }
// }

// class Test{

// }

class ArrayTool{
	// 将ArrayTool作为一个工具类，禁止其进行实例化。
	private ArrayTool(){};
	// 获取最大值
	// public int getMax(int[] arr){
	public static int getMax(int[] arr){

		int max = 0;
		for(int x = 1; x < arr.length; x++){
			if (arr[x] > arr[max]){
				max = x;
			}
		}
		return arr[max];
	}
	// 获取最小值
	// public int getMin(int[] arr){
	public static int getMin(int[] arr){

		int min = 0;
		for(int x = 1; x < arr.length; x++){
			if (arr[x] < arr[min]){
				min = x;
			}
		}
		return arr[min];
	}
	// 选择
	public static void selectSort(int[] arr){
		for (int x=0; x<arr.length-1; x++){
			for(int y=x+1;  y< arr.length; y++){
				if (arr[x] > arr[y]){
					swap(arr,x,y);
				}
			}
		}
	}
	// 冒泡
	public static void bubbleSort(int[] arr){
		for (int x=0; x<arr.length+1; x++){
			for (int y=0; y<arr.length-x-1; y++){
				if (arr[y]>arr[y+1]){
					swap(arr, y, y+1);
				}
			}
		}

	}
	

	// 打印数组
	public static void printArray(int[] arr){
		for (int x = 0; x < arr.length; x++){
			if (x == arr.length-1){
				System.out.println(arr[x]);
				return;
			}
			System.out.print(arr[x]);
		}
	}

	// 交换index功能
	// 小细节，它是工具类内部调用的，没必要提供出去，将不需要暴露出去的都隐藏起来，将其私有化
	// 但是static还是要的，因为本工具类已经被禁止实例化了，
	// 所有的方法都是静态的，静态内容只能调用静态内容
	// public static void swap(int[] arr, int a, int b){
	private static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}







