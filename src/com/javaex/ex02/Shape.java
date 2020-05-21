package com.javaex.ex02;

public class Shape {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
	
	
	//getter/setter
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//일반 메소드
	public void draw() {
		System.out.println("면색:" + fillColor + "," + "선색:" + lineColor);
	}
	
	//toString()
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
	
	
	
	
	
}

