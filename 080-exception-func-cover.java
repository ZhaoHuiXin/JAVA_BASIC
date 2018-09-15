/*
	异常在子父类中的体现：
		1.子类在覆盖父类时，如果父类的方法抛出异常，
	那么子类的覆盖方法只能抛出父类的异常或者该异常的子类或者不抛。
		2.如果父类方法抛出多个异常 ，那么子类在覆盖该方法时，
	只能抛出父类异常的子集（别超过父类就行，不抛都行，但自己能处理）。
		3.如果父类或接口的方法中没有异常抛出，那么子类在覆盖方法时，
	也不可以抛出异常；如果子类方法发生了异常，就必须要进行try内部处理。
	绝对不能抛出。

*/

class AException extends Exception{

}

class BException extends AException{
	
}

class CException extends Exception{
	
}
/*
Exception
	|--AException
		|--BException
	|--CException
*/

class Fu{
	void show() throws AException{

	}
}

// 就是说子类继承父类的时候不能比父类还有问题，只能是父类的问题或父类的子问题，不能抛出父类都没有的异常
// 所以如果子类真的避免不了新异常C，那么只能在子类中内部处理，不能抛，只能try
class Zi extends Fu{
	void show() throws { // 此处子类只能抛出A或B异常（或不抛），但是不能抛出 C异常

	}
}

// 为什么会这样要求？
class Test{
	void function(Fu f){   // Test类的function方法，能处理父类的A异常，
		// 但是如果传入子类，子类有自己的新异常，它无法处理（早期的程序不能处理后期产生的新异常）
		// 所以不让子类抛新的异常
		try{
			f.show();
		}
		catch(AException e){}
	}
}


class TestDemo1{
	public static void main(String [] args){
		Demo d = new Demo();
		d.method();
	}
}







