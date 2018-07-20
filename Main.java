package com.javatraining.deloitte.assessment1;

abstract class Shape {
	public abstract double area(double length, double width, double height);
	
	public abstract double volume(double length, double width, double height);
	

}
	class Cube extends Shape
	{
		public double area(double length, double width, double height) {
			double area = 2*length*width + 2*length*height + 2*width*height;
			return area;
		}
		public double volume(double length, double width, double height) {
			double volume = length * width * height;
			return volume;
		}
		
	}
	class Rectangle extends Shape
	{

		@Override
		public double area(double length, double width, double height) {
			double area = length*width;
			return area;
			
		}

		@Override
		public double volume(double length, double width, double height) {
			return -1;
			
		}
	}
		class Triangle extends Shape
		{
			public double area(double base, double height, double width) {
				double area = 0.5 * base * height;
				return area;
			}

			@Override
			public double volume(double length, double width, double height) {
				return -1;
				
			}
			
		}
		class Sphere extends Shape
		{
			public double area(double radius, double height, double width)
			{
				double area = 4 * 3.14 * radius * radius;
				return area;
			}

			
			public double volume(double radius, double width, double height)
			{
				double volume = 1.33 * 3.14 * radius * radius * radius;
				return volume;
			}
		}
	


		public class Main {
			public static void main(String[] args) {
				Cube cube = new Cube();
				double a = cube.area(12, 7, 3);
				double v = cube.volume(12, 7, 3);
				System.out.println("Area of the cube is:" + a);
				System.out.println("Volume of the cube is:" + v);
				
				Rectangle rect = new Rectangle();
				double a1 = rect.area(12, 7, 3);
				double v1 = rect.volume(12, 7, 3);
				System.out.println("Area of the cube is:" + a1);
				System.out.println("Volume of the cube is:" + v1);
				
				Triangle tri = new Triangle();
				double a2 = tri.area(12, 7, 3);
				double v2 = tri.volume(12, 7, 3);
				System.out.println("Area of the Triangle is:" + a2);
				System.out.println("Volume of the Triangle is:" + v2);
				
				Sphere sph = new Sphere();
				double a3 = sph.area(12, 7, 3);
				double v3 = sph.volume(12, 7, 3);
				System.out.println("Area of the Triangle is:" + a3);
				System.out.println("Volume of the Triangle is:" + v3);
			}
	
}
	
	
