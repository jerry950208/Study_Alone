// switch 조건문의 사용법을 예제로 설명해보시오
// 사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드를 만들어 보시오
// 이 문제는 자바의 switch 조건문을 사용할 수 있는 지에 대해서 묻는 문제이다



public class Switch_Basic001{

	public static void main(String[] args){
		
		//[1] : 변수 선언
		int age  = 11;
		

		//[2] : 사용자 입력 예외 처리	
		
		if(age > 10 && age < 20){
			age = 10;														//잘못 입력이 됐을경우 age를 10으로 바꿔주는 방법
			//System.out.println("10이라고 다시 연령대를 입력해주세요");	//다시 입력하게 하는경우
			//System.exit(0);			//return 0;
		}
		else if(age > 20 && age < 30){
			System.out.println("20이라고 다시 연령대를 입력해주세요");
			System.exit(0);			//return 0;
		}
		else if(age > 30 && age < 40){
			System.out.println("30이라고 다시 연령대를 입력해주세요");
			System.exit(0);			//return 0;
		}
		else if(age > 40 && age < 50){
			System.out.println("40이라고 다시 연령대를 입력해주세요");
			System.exit(0);			//return 0;
		}
		else if(age > 50 && age < 60){
			System.out.println("50이라고 다시 연령대를 입력해주세요");
			System.exit(0);			//return 0;
		}
		else{

			if(age < 10){
				System.out.println("최소 10이상만 입력해주세요 프로그램을 종료합니다");
			}
		}


		//[3] : switch 조건문
		//변수 조건은 정수형이어야 한다 --> byte, short, int --> 그러나 long타입은 X --> 그러나 char타입은 O --< 'A'
		//break, default 빼먹지 않도록 주의~!

		switch(age){

			case 1:
				System.out.println(age + "대 입니다. 참고서 코너는 A구역입니다");
				break;

			case 2:
				System.out.println(age + "대 입니다. 취업 서적 코너는 B구역입니다");
				break;

			case 3:
				System.out.println(age + "대 입니다. 자기 계발 코너는 C구역입니다");
				break;

			case 4:
				System.out.println(age + "대 입니다. 재테크 코너는 D구역입니다");
				break;

			case 5:
				System.out.println(age + "대 입니다. 재취업 코너는 E구역입니다");
				break;

			default:
				System.out.println("60대 입니다. 건강/장수 코너는 F구역입니다");
				break;
		}
	}
}
