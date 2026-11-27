package com.office.ex;

public class Constant {

	public static void main(String[] args) {
		
		// 상수란, 변하지 않는 데이터로 한번 만들어지면 이후 데이터변경이 불가, 변수의 반댓말

		int num1 = 10;	// 변수 선언 및 초기화
		final int NUM2 = 10;	// 상수 선언 및 초기화 -> "상수는 상수명을 대문자로 표기"
		
		// NUM2 = 30; // 에러
		
		
		/*
		// 우리반 학생 수
		OUR_CLASS_STUDENT_NUMBER = 10;
		*/
		
		// 상수를 다루는 방법
		// 1. 선언과 초기화를 동시에 한다.
		final int NUMBER1 = 20;
		
		// 2. 선언과 초기화 이후 데이터를 수정한다. -- 오류상황 (안됨)
		final int NUMBER2 = 20;
		// NUMBER2 = 30; error
		
		// 3. 선언과 초기화를 별도로 한다. -- (O)
		final int NUMBER3; // 선언
		NUMBER3 = 20; // 가능 
		
		
		final int PENCIL_PRICE = 1000;
		final float STUDENT_HEIGHT = 175.5f;
		final char GRADE = 'A';
		final String COUNTRY = "Korea";
		
		System.out.printf("PENCIL_PRICE: %d원%n", PENCIL_PRICE);
		System.out.printf("STUDENT_HEIGHT: %fcm%n", STUDENT_HEIGHT);
		System.out.printf("GRADE: %c등급%n", GRADE);
		System.out.printf("COUNTRY: %s%n", COUNTRY);
		
		// 리터럴(literal) 상수
		/*
		 * 리터럴의 사전적 의미는 '문자 그대로'라는 뜻으로 
		 * 프로그래밍 언어에선 데이터 자체를 뜻함
		 * 
		 * 변수: 데이터가 저장된 메모리 공간을 데이터 수정 가능
		 * 상수: 데이터가 저장된 메모리 공간을 데이터 수정 불가
		 * 리터럴: 데이터(문자) 자체를 뜻한다. 
		 */
		
		
		
	}
	
}
