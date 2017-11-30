package oop;

public class Circle implements IArea{
	
	double radius;
	float diameter;
	double area;
	double circumference;
	
 public	void calculatearea() {
		
		area=(3.14)*Math.pow(radius,2);
	}
	
 public void circumference() {
	 
	 circumference = 2 * (3.14) * radius;
 }
 
 public	void printdetails() {
		
		System.out.println(area);
		System.out.println(circumference);
		
	}

}
