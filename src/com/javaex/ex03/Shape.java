package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape(String fillColor, String lineColor) {
		
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void showInfo() {
		System.out.println("====도형====");
		System.out.println("#면색:"+fillColor);
		System.out.println("#선색:"+lineColor);
	
	}
}

