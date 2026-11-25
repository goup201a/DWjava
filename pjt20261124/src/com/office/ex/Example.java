package com.office.ex;

public class Example {

	public static void main(String[] args) {
		
		// 변수 정의 = 변수 선언 + 변수 초기화
		// 변수 선언
		int num1;
		
		// 변수 초기화
		num1 = 5;
		
		System.out.println("num1 : "+ num1);
		
		// 변수 데이터 수정
		num1 =50;
		
		System.out.println("num1 : " + num1);
		
		// 정수: int
		// 실수: float
		// 문자: char
		// 문자열: string
		
		/*
		 * 변수 이름 작명
		 */
		
		// 1. 변수명의 시작은 일반적으로 소문자를 사용
		int money = 1000;
		// int Money = 1000; // 엄연히 소문자와 대문자는 다른 문자다
		
		// 2. 변수명은 일반적으로 영문자를 사용
		int myMoney = 500;
		// int 나의돈 = 500; /(X) 하지마라. 인식은 되지만 쓰면 안됨
		
		// 3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 작명 (*****)
		int score = 100;
		// int s = 100; 
		
		String player = "son";
		// String p = "park"; 안된다
		
		// 4. 2개 이상의 단어가 조합된 경우 낙타표기법(cameL)을 사용, (뱀'_'표기법도 있지만 Java에선 잘 안쓴다) (*****)
		int currentLocation; // 두번째 문자부터는 대문자를 쓴다
		int myCurrentLocation; // 낙타의 등같이 오르락 내리락
		int totalScore;
		int highScore;
		int maxScore;
		String newItem;
		
		// 5. 키워드(== 예약어)는 변수명으로 절대 사용할 수 없음
		// int public = 100;
		
		// 6. '_(언더바)' or '$(달러)'를 제외한 특수문자를 사용할 수 없음
		// int score!;
		// int score^^;
		// int score@;
		int sco_________________r_____________e; // 언더바나 달러라면 이렇게 써도 상관없음
		
		// 7. 변수명에는 공백문자는 사용할 수 없다
		// int my          score;;
		
		// 8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용할 수 있다
		int sco1re; //가능
		int score7; //가능
		// int 7socre; 불가능 
		
		
		/*
		 변수 데이터 변경
		 */
		int myNum = 10;
		System.out.println("myNum: " + myNum); // 10
		
		// int myNum = 20; //(X)
		
		// 데이터 복사
		int yourNum = myNum; //가능 새롭게 할당시킨 것 뿐이기 때문
		
		//python
		// 기초 데이터 타입, 참조 데이터 타입 - 진도가 아직 안나감.
		
		System.out.println("myNum: " + myNum);
		System.out.println("yourNum: " + yourNum);
		
		yourNum = 200;
		System.out.println("myNum: " + myNum);
		System.out.println("yourNum: " + yourNum);
		
		
		//데이터 스왑(swap)
		int n1 = 10;
		int n2 = 20;
		
		System.out.println("n1: " +n1);
		System.out.println("n2: " +n2);
		
		n1 = n1 + n2;
		n2 = n1 - n1;
		n1 = n2 - n1;
		
		System.out.println("n1: " +n1);
		System.out.println("n2: " +n2);
		
		n1 = 10;
		n2 = 20;
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("n1: " +n1);
		System.out.println("n2: " +n2);
	}
	
	
	
}
