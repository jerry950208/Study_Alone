// if ~ else if ~ else 조건문의 사용법을 예제로 설명해보시오
// 이 문제는 자바의 if ~ else if ~ else 조건문을 사용할수 있는지에 대해서 묻는 문제이다


public class If_Basic003{

	public static void main(String[] args){

		// [1] : 변수 선언
		int kor = 70, eng = 70, math = 70;
		int total_score;
		total_score = kor + eng + math;

		// [2] : if ~ else if ~ else조건문 사용하기
		if(total_score >= 270)
			System.out.printf("당신의 토탈 점수는 " + total_score + "입니다%n축하해요");

		else if(total_score >= 240)
			System.out.printf("당신의 토탈 점수는 " + total_score + "입니다%n잘했어요%n");

		else if(total_score >= 210)
			System.out.printf("당신의 토탈 점수는 " + total_score + "입니다%n노력하세요%n");

		else	
			System.out.printf("당신의 토탈 점수는 " + total_score + "입니다%n음........ㅜ.ㅠ");
	}
}
