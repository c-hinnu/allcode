package javanew;

import java.io.*;
import java.util.*;
import java.text.*;
class Circle {
    private double radius;
    private String color;
    public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	public void getArea()
	{
		System.out.format("%.2f",(Math.PI*getRadius()*getRadius()));
		System.out.println();
	}

	
    
   
    @Override
    public String toString() {
        return "Circle: radius=" + radius + " color=" + color;
    }
}
class Cylinder extends Circle { 
    private double height; 
  
    public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
    public void getArea() {
        System.out.format("%.2f",(2*Math.PI*getRadius()*height) + (2*getRadius()*getRadius()*Math.PI));
        System.out.println();
    }
    public void getVolume() 
    {
    	System.out.format("%.2f",(Math.PI*getRadius()*getRadius()*getHeight()));
    	System.out.println();
    }
    

    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius() + " color=" + getColor() + " height=" + getHeight();
    }

}
public class prog {
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
    	double r= sc.nextDouble();
    	double h= sc.nextDouble();
    	Circle c = new Circle();
    	Cylinder cy = new Cylinder();
    	c.setRadius(r);
    	cy.setHeight(h);
    	cy.setRadius(1.0);
    	c.setColor("red");
    	cy.setColor("red");
    	System.out.println(c);
    	System.out.println(cy);
    	c.getArea();
    	cy.getArea();
    	cy.getVolume();
    	
    	
    	
    	
       
    }
}

