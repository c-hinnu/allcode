package javanew;

import java.util.Scanner;

abstract class Shape{
	 abstract void rectangleArea();

	 abstract void squareArea();

	 abstract void circleArea();
	
}
 class Area extends Shape{
	  void rectangleArea(int l,int b)
	 {
		  int a=l*b;
			System.out.println(a);
	 }
	  void squareArea(int c) 
	
	  {
		 int d=c*c; 
		 System.out.println(d); 
	  }
	  void circleArea(double r)
	  {
		double e=  3.14*r*r;
		System.out.format("%.2f",(e));
		System.out.println();
	  }
	@Override
	void rectangleArea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void squareArea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void circleArea() {
		// TODO Auto-generated method stub
		
	}
	  
 }

public class ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b= sc.nextInt();
		int s=sc.nextInt();
		double r=sc.nextDouble();
		Area a = new Area();
		a.rectangleArea(l, b);
		a.squareArea(s);
		a.circleArea(r);

	}

}
