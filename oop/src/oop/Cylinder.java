package oop;

public class Cylinder implements ICylinder {
		
		double radius;
		double height;
		double rectanglearea;
		double circlearea;
		double area;
		
	public void rectanglearea() {
			
			rectanglearea =  2 * (height * radius);
		
		}
		
	public void circlearea() {
		
		circlearea = 3.14 * (radius * radius);
		
	}
	
	public void area() {
		
		area = (2 * circlearea) + ((3.14) * rectanglearea);			
			
				System.out.println(area);
		}

}
