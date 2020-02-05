package com.vastika.circle;

public class Circle {
	double radius = 1;
	Circle(){
	
	}
	Circle(double newRadius){
	radius = newRadius;
	}

	double getArea(){
		return radius*radius*3.14;
	}
	double getPerimeter(){
		return 3.14*radius;
		
	}
	void setRadius(double newRadius){
	radius= newRadius;
	}
}
