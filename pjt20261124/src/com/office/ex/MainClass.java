package com.office.ex;

public class MainClass {

	//프로그램의 시작
	public static void main(String[] args) {
		
		//콘솔에 데이터를 출력
		System.out.println("Hello java~");
		
		
		//: 한 줄 주석
		
		/* 여러 줄 주석 
		 class란,
		 클래스는 프로그램을 구성하는 단위 
		 - 클래스들이 모여 하나의 프로그램이 만들어짐
		 -> 자바 프로그램에서는 '반드시' 하나 이상 있어야 함
		 */
		
		/*
		 클래스 기본 형식
		 public class 클래스이름 {
		 
		 }
		 */
		
		/*
		 키워드란,
		 특정한 목적으로 정의된 예약를 말함
		 개발자는 함부로 사용할 수 없음
		 */
		
		/*
		 * 클래스 이름 작명 규칙
		  
		 1. 클래스 이름은 영문 대문자로 시작
		 	Hello(O), H2llo(O), Hello2(O)
		 	2Hello(X)
		 2. 특수문자 사용 금지, 단, $ / _ 는 사용가능(비추천)
		 	_Hello(O), H_ello(O), Hello_(O)
		 	$Hello(O), H$ello(O), Hello$(O)
		 	@Hello(X), ^^Hello(X)
		 3. 클래스 이름은 클래스의 기능을 알 수 있도록 작명
		 	ex) 계산기 - Calculator, 예약(Reservation), 결제(Payment)
		 		파일업로드(FileUpload)
		 */
		
		/*
		 ;이란?
		 종결자라고 한다 영어로 세미콜론 ;
		 안녕하세요.의 '.'처럼 프로그램 구문 끝을 나타낼 때 '으로 구문의 끝을 나타낸다.
		 */
		
		System.out.println("Hello 자바!");
		
	}
	
}
