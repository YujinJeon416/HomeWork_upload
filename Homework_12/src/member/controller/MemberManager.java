package member.controller;

import java.util.Scanner;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

/**
 * @실습문제1-포인트관리시스템 구축
Has A  포함관계 기법을 활용하여 포인트 관리 시스템을 만들어라
1. Has a 포함 관계로 만들것
2. Entity  와 Control 클래스를 명확히 구분할것
    * entity 클래스 이름 : member.model.vo.Silver , member.model.vo.Gold
    * control 클래스 이름 ; member.controller.MemberManager
    
Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
Control 클래스 이름 : MemberManager
MemberManager 멤버변수 : Silver 등급을 최대 10명, Gold 등급을 최대 10명 관리할수 있는  객체배열 , 인덱스 추가
MemberManager 멤버메소드 : silverInsert, goldInsert, printData 
주의할점 : 적절한 접근제어 지시자 사용 (private,public)
실행클라스 : member.run.Run 
    
    public class Run {
        public static void main(String[] args){
            MemberManager m = new MemberManager();
            m.silverInsert(new Silver("홍길동", "Silver",1000));
            m.silverInsert(new Silver("김말똥", "Silver",2000));
            m.silverInsert(new Silver("고길동", "Silver",3000));
            m.goldInsert(new Gold("김회장", "Gold",1000));
            m.goldInsert(new Gold("이회장", "Gold",2000));
            m.goldInsert(new Gold("오회장", "Gold",3000));
            m.printData();
        }
    }
출력결과 :
    ---------------------------<<회원정보>>---------------------------
    이름              등급              포인트             이자포인트          
    -----------------------------------------------------------------
    홍길동             Silver          1000            20.00          
    김말똥             Silver          2000            40.00          
    고길동             Silver          3000            60.00          
    김회장             Gold            1000            50.00          
    이회장             Gold            2000            100.00         
    오회장             Gold            3000            150.00  
@실습문제2 - 회원등급추가
회원관리에 vip, vvip등급을 추가.
---> vip 등급은 10% 를 곱한값이 이자 포인트
---> vvip 등급은 15% 를 곱한값이 이자 포인트
실행클라스 : member.run.Run.main메소드에 추가
    //vip추가
    m.vipInsert(new Vip("최순실", "Vip",10000));
    //vvip추가
    m.vvipInsert(new VVip("박근혜", "VVip",100000));
 * @author juj04
 *
 */


public class MemberManager {

	public static final int MAX_MEMBER_COUNT = 10;
	Silver[] s= new Silver[MAX_MEMBER_COUNT];
	Gold[] g = new Gold[MAX_MEMBER_COUNT];
	Vip[] v = new Vip[MAX_MEMBER_COUNT];
	VVip[] vv = new VVip[MAX_MEMBER_COUNT];
	
	int silverIndex = 0;
	int goldIndex = 0;
	int vipIndex = 0;
	int vvipIndex = 0;
	
	
	public void silverInsert(Silver s) {
		this.s[silverIndex++] = s;
	}
	public void goldInsert(Gold g) {
		this.g[goldIndex++] = g;
	}
	public void vipInsert(Vip v){
		this.v[vipIndex++] =  v;
	}
	public void vvipInsert(VVip vv){
		this.vv[vvipIndex++] =  vv;
	}
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i=0; i<silverIndex;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getEjapoint());			
		}
		for(int i=0; i<goldIndex;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getEjapoint());
		}
		for(int i=0; i<vipIndex; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getEjapoint());
		}
		for(int i=0; i<vvipIndex; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", vv[i].getName(), vv[i].getGrade(), vv[i].getPoint(), vv[i].getEjapoint());
		}
	}
}
