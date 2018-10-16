class AreaException extends RuntimeException{
	AreaException(String message){
		super(message);
	}
}

interface Shape{
	public abstract void getArea();
}

class Circle implements Shape{
	private int radius;
	public static final double PI = 3.14;

	Circle(int r){
		if (r <= 0){
			throw new AreaException("半径长度非法");
		}
	}

	public void getArea(){
		System.out.println(PI * radius * radius);
	}
}

class TestShape{
	public static void main(String [] args){
		Circle c = new Circle(0);
		c.getArea();
	}
}