package com.exception.number;

import java.util.Scanner;

/**
 * /**
 * <문제 2>
- 패키지명 : com.exception.number
 1. 사용자정의 예외 클래스 : NumberRangeException
 2. 클래스 : NumberProcess
    기본 생성자
    메소드
    // 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
    배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
    //단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
    NumberRangeException 발생시킴
    에러메시지 : "1부터 100사이의 값이 아닙니다."
    public boolean checkDouble(int a, int b){}
 3. 클래스 Run : 실행메소드에서 test() 메소드 실행 
    public void test(){}
    //2 개의 정수를 입력받아, checkDouble 메소드로 전달하면서 실행함
    리턴된 결과로  결과로 "ooo의 배수이다/배수가 아니다." 출력함
 * @author juj04
 *
 */

public class Run {public static void main(String[] args) {
	new Run().test();
}		

public void test() {
	Scanner sc = new Scanner(System.in);
	System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
	int a = sc.nextInt();
	System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
	int b = sc.nextInt();
	
	try {
		boolean bool = new NumberProcess().checkDouble(a, b);
		
		if(bool) System.out.println(a+"는 "+b+"의 배수입니다.");
		else System.out.println(a+"는 "+b+"의 배수가 아닙니다.");
		
	} catch (NumberRangeException e) {
		System.out.println(e.getMessage());
	}
	
}

}


