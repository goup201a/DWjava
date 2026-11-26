package com.office.ex;

public class Variable {
	
	public static void main(String[] args) {
		
		//	변수
		int mynum = 1;			// 변수 정의(define)
		int mynum2 = 2;		
		
		System.out.println(mynum + mynum2);
		
		/*
		 변수는 메모리의 특정 공간을 뜻한다
		 변수명은 메모리 주소 대신 인간이 붙인 이름이다 
		 
		 * 변수 정의문 문법
		 	(데이터 타입) 변수명 = 데이터;
		 	
		 	 변수 정의 = 변수 선언 + 변수 초기화
		 	 변수 선언: int mynum
		 	 변수 초기화: mynum = 1
		 	 
		 	 메모리 주소칸에 명찰을 달아놓는 과정 = 변수 선언
		 	 (호텔 방을 예약하고 예약자 이름을 설정)
		 	 값들이 명찰이 달린 주소칸에 들어가는 것 = 변수 초기화
		 	 (예약한 방 안에 입실)
		 	 = : 할당 연산자
		 */
		
		// 변수 선언 
		int num1;
		// 변수 선언 과정에서 변수명을 똑같이 넣으면 새롭게 할당한 값으로 덮어써진다
	
		// 변수 초기화
		num1 = 10;
		
		// 정수: int
		// 실수: float
		// 문자: char
		// 문자열: String
		
		int score = 100;
		// int는 정수만

		float pi = 3.14f;
		// float는 소수를 쓰고 뒤에 f을 붙인다
		
		char a = 'a';
		// 문자는 ''안에
		
		String str = "abcdefg";
		// 문자열은 ""안에
		
		
		// 예제 문법
		String myName = "홍길동";
		
		int myScore = 85;
		
		float myHeight = 1.88f;
		
		char myFavorityAlphabet = 'J';
		
	}
	
	
}
