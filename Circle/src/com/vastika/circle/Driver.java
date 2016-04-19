package com.vastika.circle;

import org.omg.Messaging.SyncScopeHelper;

public class Driver {
	public static void main(String[] args) {
		Circle c8 = new Circle();
		c8.radius=44;
		Circle c1 = new Circle(1);
		c1.setRadius(5);
		c1.radius= 3;
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(3);
		double b1 = c1.getArea();
		double b2 = c2.getArea();
		double b3 = c3.getArea();
		System.out.println(b1 + " " + b2 +" "+ b3);
 c1.setRadius(5);
 System.out.println("mmmmmmmmmmmmmm");
 System.out.println("mmmmmmmmmmmmmm");
 System.out.println("66666666");
System.out.println();
	}
}