package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	public MyBase() {
	}

	public void service (String state) {
		if (state.equals("낮")) {
			super.day();
		}
		else if (state.equals("밤")) {
			super.night();
		}
		else if (state.equals("오후")) {
			this.afternoon();
			}
		}
		public void afternoon() {
			System.out.println("오후는 낮과 마찬가지로 공부해야 합니다.");
		
		}
	}
	
