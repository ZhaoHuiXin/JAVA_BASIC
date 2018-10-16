class IllegalLengthException extends Exception{
	private int l;
	IllegalLengthException(String message, int l){
		super(message);
		this.l = l;
	}

	void getString(){
		System.out.println("您输入的数 "+l+" 不合理");
	}
}


interface Shape{
	public abstract void getArea();
}


class Circle{
	public static final Double PI = 3.14;
	private int radius;
	Circle(int r) throws IllegalLengthException{
		if (r <= 0){
			throw new IllegalLengthException("输入的半径长度非法", r);
		}
	}
	public void getArea(){
		System.out.println(PI * this.radius * this.radius);
	}
}

class TestShapeException{
	public static void main(String[] args){
		try{
			Circle c = new Circle(0);
		}catch (IllegalLengthException e){
			System.out.println(e.toString());
			e.getString();
		}
	}
}