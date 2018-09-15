

/*	异常练习
	需求：
	毕老师用电脑上课
	（名字提炼法）
	开始思考上课中出现的问题：
		比如：1.电脑蓝屏，冒烟
	要对问题进行描述，封装成对象。

	可是当冒烟发生后，会出现讲课进度无法继续，此时就出现了(老毕的问题，课时计划无法完成)
*/
// 蓝屏发生后能处理，所以没有继承RuntimeException
class LanPingException extends Exception{
	LanPingException(String message){
		super(message);
	}
}

// 冒烟
class MaoYanException extends Exception{
	MaoYanException(String message){
		super(message);
	}
}

// 可是当冒烟发生后，会出现讲课进度无法继续，此时就出现了(老毕的问题，课时计划无法完成)
class NoPlanException extends Exception{
	NoPlanException(String message){
		super(message);
	}
}

class Computer{
	private int state = 3; // 1代表正常，2代表蓝屏，3代表冒烟
	// throws的都是编译时被检测异常，如果没声明，那么会编译失败
	public void run() throws LanPingException, MaoYanException{
		if(state == 2){
			throw new LanPingException("蓝屏了");
		}
		if (state == 3)
			throw new MaoYanException("冒烟了");
		System.out.println("电脑运行");
	}

	public void reboot(){
		this.state = 1;
		System.out.println("电脑重启");
	
	}
}


class Teacher{
	private String name;
	private Computer cmpt;

	Teacher(String name){
		this.name = name;
		this.cmpt = new Computer();
	}

	public void prelect() throws NoPlanException{ // 抛出去就要在函数定义时声明的
		try{
			this.cmpt.run();
		}catch(LanPingException e){
			System.out.println(e.toString());
			this.cmpt.reboot();	
		}catch(MaoYanException e){ // 冒烟处理不了，那么抛出去;抛出去就要在函数定义时声明的
			test(); 应该把test放到 throw 上面哦
			throw new NoPlanException("课时无法继续" + e.getMessage()); // 谨记：throw和return是程序结束的标志
			// test(); 如果发生了NoPlanException，那么抛异常程序结束，test是没机会运行的
		}
		
		System.out.println("讲课");
	}

	public void test(){

	}
}


class ExceptionTest{
	public static void main(String[] args){
		Teacher t = new Teacher("老毕");
		try{
			t.prelect(); // 不能抛出冒烟异常给校长(main)，要把它转为我的异常(讲课不能继续)再把它抛给校长
		}catch (NoPlanException e){
			System.out.println(e.toString());
			System.out.println("换老师，🌶");
		}
		
	}
}

















