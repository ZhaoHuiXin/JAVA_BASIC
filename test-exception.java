

class BlueViewException extends Exception{
	BlueViewException(String s){
		super(s);
	}
}

class KeyWordException extends RuntimeException{
	KeyWordException(String s){
		super(s);
	}
}

class Teacher{

	void teaching(String lession) throws BlueViewException{
		if (lession == "rust"){
			throw new BlueViewException("oh my god, it's terrible, i'm dead.");
			// MyUtil.println("haha"); // 错误: 无法访问的语句
		}
		MyUtil.println("teaching " + lession);
	}

	void write(String word){ // RuntimeException 可以不throws哦
		if (word == "fennel"){
			throw new KeyWordException("Oh shit！ I don't like fennel, It's too bad.");
		}
		MyUtil.println("write " + word + " on blackboard.");
	}
}


class TestException{
	public static void main(String[] args){
		Teacher t = new Teacher();
		try{
			// t.teaching("语文");
			t.teaching("rust");
			MyUtil.println("haha"); // 如果出现异常，本剧本是执行不了的
		} catch(BlueViewException e) {
			MyUtil.println(e.toString());
		}

		t.write("大蒜"); 
		// t.write("fennel");  // JVM 默认处理RuntimeException  程序终止, 打印不了error ，但是finally 会执行
		try{
			t.write("fe+el"); 
		}finally{  // finally内容先执行，而后报错
			MyUtil.println("finally over");
		}

		try{  
			t.write("fennel"); 
		}catch(KeyWordException e){  // 捕获 RuntimeException， 一般不要这么干
			MyUtil.println(e.toString());
		}

		MyUtil.println("outer over");
	}
}