class Shape {
	private double length;
	private double width;

	//getters
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}

	//setters
	public void setLength(double len) {
		length = len;
	}
	public void setWidth(double wid) {
		width = wid;
	}

	// methods
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
}

public class Rectangle {
	public static void main(String[] args) {

		Shape square = new Shape();
		square.setLength(5.5);
		square.setWidth(5.5);

		System.out.printf("Area of this shape is %.2f\n", square.getArea());
		System.out.printf("The perimeter of this shape is %.2f\n",square.getPerimeter());
	}
}
