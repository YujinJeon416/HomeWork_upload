package com.kh.test.condition;

import java.util.Scanner;

/**
 * - 메소드명 : public void test()
    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************  
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************
       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”

 * 
 *
 */
public class Test9 {

		public static void main (String[] args) {
			Test9 t = new Test9();
			
			t.test();
		}
		
		public void test() {
			
			String menu = "*********주메뉴*********\n"
					+ "a. 불고기버거 ------------5000\n"
					+ "b. 새우버거 --------------4000\n"
					+ "c. 치킨버거 --------------4500\n"
					+ "d. 한우버거 -------------10000\n"
					+ "e. 디버거 ----------------7000\n"
					+ "***********************\n";
				System.out.println(menu);	
			Scanner sc = new Scanner(System.in);
			System.out.print("주메뉴를 선택해주세요(a~e) : ");
			char mmenu=sc.next().charAt(0);
		
			String sidemenu =  "    *******사이드메뉴********    \n "
					+ " 1. 콜라 -------------------1500\n"
					+ " 2. 사이다 -----------------1500\n"
					+ " 3. 밀크쉐이크-------------2500\n"
					+ " 4. 레드불------------------3000\n"
					+ " ***********************\n";
			System.out.println(sidemenu);
			System.out.print("사이드메뉴를 선택해주세요(1~4) : ");
			int smenu = sc.nextInt();
			
			int sum =0;
			String mmenuStr = "";
			String smenuNo = "";
			
			switch(mmenu){
			case 'a': 	mmenuStr ="불고기버거"; sum += 5000; break;
			case 'b': 	mmenuStr ="새우버거"; sum += 4000;break;
			case 'c': 	mmenuStr ="치킨버거"; sum += 4500;break;
			case 'd': 	mmenuStr ="한우버거"; sum += 10000;break;
			case 'e': 	mmenuStr ="디버거"; sum += 7000;break;
			default: System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		switch(smenu) {
			case 1: smenuNo ="콜라"; sum += 1500;break;	
			case 2: smenuNo ="사이다"; sum += 1500;break;	
			case 3: smenuNo ="밀크쉐이크"; sum += 2500;break;	
			case 4: smenuNo ="레드불"; sum += 3000;break;	
			default: System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		System.out.printf("%s, %s는 총%d원입니다",mmenuStr,smenuNo,sum);
	}

	}



