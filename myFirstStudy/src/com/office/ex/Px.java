package com.office.ex;

import java.util.Scanner;

public class Px {
	
	public static void main(String[] args) {
		
		
		// 변수 정의 (변수 선언 + 변수 초기화)
		int age = 22;
		float height = 1.81f;
		char blood = 'A';
		String introduce = "안녕하세요 제 이름은 홍길동입니다.";
		boolean married = false;
		
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		System.out.println("blood: " + blood);
		System.out.println("introduce: " + introduce);
		System.out.println("married: " + married);
		
		
		//변수 데이터 수정
		age = 34;
		System.out.println("age: " + age);
		
		//변수 데이터 복사
		int myNum = 30;
		int yourNum = myNum; // a = 30
		System.out.println(yourNum); //30
		
		//데이터 스왑
		
		int n1 = 20;
		int n2 = 10;
		
		// n1을 10으로 n2를 20으로
		
		int temp = n1; //값을 새 변수에 저장
		
		n1 = n2;
		n2 = temp;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		
		//정수 자료형
		
		byte byteType = 123;
		System.out.println("byteType: " + byteType);
		short shortType = 12345;
		System.out.println("shortType: " + shortType);
		int intType = 123456776;
		System.out.println("intType: " + intType);
		long longType = 1233254353465L;
		System.out.println("longType: " + longType);
		
		//실수 자료형
		
		float floatType = 3.14f;
		System.out.println("floatType: " + floatType);
		double doubleType = 3.213124124;
		System.out.println("doubleType: " + doubleType);
		
		
		//논리 자료형
		
		boolean boolType = true;
		boolType = false;
		System.out.println("boolType: " + boolType);
		
		//문자 자료형
		char charType = 'A';
		System.out.println("charType: " + charType);
		char chrType2 = ' '; //공백도 문자취급함
		System.out.println("chrType2: " + chrType2);
		
		
		//문자열 자료형
		String strType = "HiHIHIHIHI"; 
		System.out.println("strType: " + strType);
		
		
		//형식 문자열 출력
		
		//지정자
		/*
		 * %d = int
		 * %f = float
		 * %b = boolean
		 * %c = char
		 * %s = String
		 * %n = <br>
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		
		System.out.println("str1: " + str1);
		
		
	}
	
	
	
}
