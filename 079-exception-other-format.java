/* 异常-处理语句的其他格式
格式1
	try{
	
	}catch(){
	
	}finally{
	
	}
格式2
	try{
	
	}catch(){
	
	}
格式3
	try{
	
	}finally{
	
	}


注意：
	catch 是用于处理异常的。如果没有catch就代表异常没有被处理过，
如果该异常是编译时异常。那么必须被声明
*/

class Demo{
	public void method(){ // 不用throws， 问题在内部被解决，程序可以编译通过
		try{  
			throw new Exception();
		}catch(Exception e){  
			// 只要问题被解决，问题可以不声明；问题没有被解决就一定要声明出去；
			// （有catch就是解决问题）

		}
	}
}


class Demo{
	public void method(){
		try{  
			throw new Exception();
		}catch(Exception e){  
			throw e; // 编译无法通过，虽然有catch，但是又把 问题抛了出去
		}
	}
}

class Demo{
	public void method(){
		try{  
			throw new Exception();
		}catch(Exception e){  
			try{
				throw e;  // 编译可以通过。e被处理了
			}
			catch(Exception e_b){

			}
		}
	}
}

class Demo{
	public void method(){
		try{  
			throw new Exception(); // 没有catch，要声明出去
		}
		finally{
			// 关资源。
		}
		// 如果你在一个功能当中定义了一些必须要执行的代码的话，
		// 那么就用try finally的形式把一定要执行的代码存放在 finally 当中
	}
}














