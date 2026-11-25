package com.office.ex;

public class DataType {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입(Data Type)이란,
		 * 메모리에 데이터가 저장될 때 데이터에 따라서 할당 받는 메모리 크기가
		 * 다르게 되는데, 예를 들어 정수는 1~8byte, 실수는 4~8byte의 크기가 할당됨,
		 * 이런 것을 데이터타입 이라고 함
		 */
		
		
		// 1. 정수 데이터 타입
		// 1-1 byte		1byte		-128 ~ 127
		byte byteVar = 127;
		System.out.println("byteVar: " + byteVar);
		// byteVar = 128;
		// byteVar = -129;
		
		// 1-2. short	2byte		-32,768 ~ 32,767
		short shortVar = 32767;
		System.out.println("shortVar: " + shortVar);
		// shortVar = 32768;
		
		// 1-3. int		4byte		-2,147,483,648 ~ 2,147,483,647  
		int intVar = 2147483647;
		System.out.println("intVar: " + intVar);
		
		// 1-4 long		8byte		약 -900경 ~ 900경 (아예 거의 안씀)
		long longVar = 9223372036854775807L; //뒤에 대문자 L을 붙여야함
		System.out.println("longVar: " + longVar);
	
		// 2. 실수형 데이터 타입
		// 2-1. float	4byte
		float floatVar = 3.14f; //뒤에 소문자 f 붙이기
		System.out.println("floatVar: " + floatVar);
		
		// 2-2: double	8byte
		double doubleVar = 3.141592; //d를 붙이든 생략하든 상관 없음 
		System.out.println("doubleVar:" + doubleVar);
		
		
		floatVar = 3.12345678901234567890f;
		System.out.println("floatVar: " + floatVar);
		
		doubleVar = 3.12345678901234567890;
		System.out.println("doubleVar: " + doubleVar);
		
		System.out.println(0.1 + 0.2); // 0.3이여야 하는데 가비지 데이터 발생
		
		
		// 3. 논리형(boolean)	1byte		참(true) or 거짓(false)
		boolean booleanVar = true;
		System.out.println("booleanVar: " + booleanVar); // true
		
		booleanVar = false;
		System.out.println("booleanVar: " + booleanVar); // false
		
		boolean isMember = true;
		isMember = false;
		
		
		// 4. 문자형 데이터 타입
		// char		2byte
		char charVar ='A'; //작은 따옴표 쓰기
		System.out.println("charVar: " + charVar);
				
		// charVar = 'AA'; // ' '  " " (X)
		
		// charVar = 'A" (X)
		
		
		// 참고
		// 빈(empty) 문자, 공백(space) 문자
		// '' -> 빈 문자
		// ' ' -> 공백 문자
		
		// char ch1 = ''; //error
		char ch2 = ' ';
		// char ch3 = '  '; //문자열이라 char는 에러
		
		// 유니코드
		//	세상의 모든 문자를 숫자로 표현한 것
		
		char char1 = 'A';
		System.out.println("char1 : " + char1); //A
		
		int unicode1 = char1;
		System.out.println("unicode1: " + unicode1); //65
		
		char char2 = 65; //A
		System.out.println("char2: " + char2);
		
		char char3 = 12593; //ㄱ
		System.out.println("char3: " + char3);
		
		
		// 5. 문자열 String
		String str1 = "Hello";
		System.out.println("str1: " + str1);
		
		str1 = "";
		str1 = " ";
		str1 = "A";
		
		System.out.println("str1; " + str1);
		
	}
		
		
		
}
