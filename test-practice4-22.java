
class Circle {
	private static double pi = 3.14;
	private double radius;

	public Circle(double r){
		this.radius = r;
	}

	public static double compare(Circle[] cir){
		double maxR = cir[0].radius;
		for (int i =1; i< cir.length; i++){
			if (cir[i].radius > maxR){
				maxR = cir[i].radius;
			}
		}
		return maxR;
	}
}

class TC{
	public static void main(String [] args){

		Circle cir[] = new Circle[3];
		cir[0] = new Circle(1.0);
		cir[1] = new Circle(2.0);
		cir[2] = new Circle(4.0);
		MyUtil.println("最大的半径是： " + Circle.compare(cir));
	}
}