interface Area{
	public abstract void getArea();
}

class Rectangle implements Area{
	private int length;
	private int width;

	Rectangle(int l, int w){
		if (l <= 0 || w <= 0){
			throw new DiyArguementException("矩形的边长必须大于0");
		}
		this.length = l;
		this.width = w;
	}


	public void getArea(){
		MyUtil.println(this.length * this.width);
	}
}

class Circle implements Area{
	public static final Double  PI = 3.14;
	private double radius;

	Circle(double r){
		if (r < 0){
			throw new DiyArguementException("半径不能小于0");
		}
		this.radius = r;
	}

	public void getArea(){
		MyUtil.println(String.valueOf(radius * radius * PI));
	}
}

class DiyArguementException extends RuntimeException{
	DiyArguementException(String s){
		super(s);
	}
}

class TestArea{
	public static void main(String[] args){
		// Circle c = new Circle(-1);
		// c.getArea();

		Rectangle r = new Rectangle(0, 1);
		r.getArea();
	}
}