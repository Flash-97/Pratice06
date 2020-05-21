package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle () {
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		super("검정","검정");
		this.width = width;
		this.height = height;
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}

	//getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	//일반 메소드
	public void draw() {
		System.out.println("면색:" + fillColor + ", " + "선색:" + lineColor + ", " +"가로:" + width + ", " + "세로:" + height);
	}
	
	//toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	
	
	
	
	
	
	
}


