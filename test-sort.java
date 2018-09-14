class SortDemo{
	public static void main(String[] args){
		int[] arr = {1,10,0,100,20,5,3};
		Sort.selectSort(arr);
		Util.printArray(arr);
		Sort.bubbleSort(arr);
		Util.printArray(arr);
	}
}

class Sort{
	/**
	选择排序
	@param arr 接收一个int类型的数组
	*/
	static void selectSort(int[] arr){

		for(int x = 0; x < arr.length - 1; x++){
			for(int y = x+1; y < arr.length; y++ ){
				if (arr[x] > arr[y]){
					Util.swap(arr, x ,y);
				}
			}
		}
	}

	/**
	冒泡排序
	@param arr 接收一个int类型的数组
	*/
	static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length - i - 1; j++){
				if (arr[j] < arr[j + 1]){
					Util.swap(arr, j, j+1);
				}
			}
		}
	}
}


class Util{

	/**
	交换数组中元素位置
	@param arr 接收一个int类型的数组
	@param a 要置换的位置
	@param b 要置换的位置
	*/
	static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	/**
	用于打印数组中的元素。打印形式是：[elemet1, elem2...]
	@param arr 接收一个int类型的数组
	*/
	static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			if (i == arr.length - 1){
				System.out.println(arr[i]);
				return;
			}
			System.out.print(arr[i] + ", ");
		}
	}
}