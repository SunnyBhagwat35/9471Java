abstract class Shape{
	String color;

	public Shape(String color){
		this.color = color;
	}

	abstract double area();
	public abstract String details();

	public String getColor(){
		return color;
	} 
}
class Circle extends Shape{
	double radius;
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	@Override double area(){
		return Math.PI * Math.pow(radius, 2);
	}
	@Override public String details(){
		return  "Circle color is " + super.getColor() + " and area is : " + area();
	}
}

class Abs{
	public static void main(String args[]){
		Shape c = new Circle("Purple", 2.2);
		System.out.println(c.details());
	}
}