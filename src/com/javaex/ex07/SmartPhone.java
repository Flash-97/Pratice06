package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		// 코드작성
		if (str.equals("앱")) {
			app();
		} else if (str.equals("음악")) {
			playMusic();
		} else if (str.equals("통화")) {
			super.execute(str);   //부모에서 가져옴
		}
	}

	// 메소드작성
	public void app() {
		System.out.println("앱실행");
	}

	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	/*
	public void call() {
		System.out.println("통화기능시작");
	}
	*/
}
