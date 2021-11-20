// 중첩된 if 조건문을 사용하는 예제를 만들어보시오
// 이 문제는 if 조건문을 중첩하여 사용하는 방법에 대해서 알고 있는지를 묻는 문제이다


public class If_Basic004{

	public static void main(String[] args){

		//[1] : 변수 선언
		int kor = 60, eng = 60, math = 59;
		int total_score;
		total_score = kor + eng + math;

		//[2] : if ~ else if ~ else 조건문 사용하기
		if(total_score >= 270)
			System.out.printf("당신의 토탈점수는 "  + total_score + "입니다 매우매우 잘했어요~ %n축하해요~%n");
			
		else if(total_score >= 240)
			System.out.printf("당신의 토탈점수는 "  + total_score + "입니다%n잘했어요~%n");
		
		else if(total_score >= 210)
			System.out.printf("당신의 토탈점수는 "  + total_score + "입니다%n노력하세요~%n");
		
		else
			
			if(math >= 60)
				System.out.printf("당신의 토탈점수는 %d이고, 수학점수는 %d점 입니다. %n수학점수가 60점 이상이므로 재수강 대상자가 아닙니다%n",total_score, math);
			
			else
				System.out.printf("당신의 토탈점수는 %d이고, 수학점수는 %d점 입니다. %n수학점수가 60점 이하 이므로 재수강 대상자 입니다%n",total_score, math);
		
	}
}
