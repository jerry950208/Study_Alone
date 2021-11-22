//수치 연산자를 사용한 연산에서 소숫점 곃과가 다르게 나오는 것에 대해서 설명해보시오
//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제이다

public class Operator_ArithmeticOperators2{
	
	public static void main(String[] args){

		//[!] : 연산의 결과 --> 정수끼리라도 나누기의 경우 소숫점 형태가 나올수 있음
		int a = 60, b = 8;
		int rst1;

		rst1 = a / b;
		System.out.println(rst1); 			//7.5가 아니라 7이 출력된다 --> 타입이 정수형이므로 --> 실수형으로 변환
		System.out.println((double)rst1);	//7.5가 아니라 7.0이 출력된다(int형의 rst1에 이미 7이 저장이 되었기 때문이다), 리턴받는 변수를 실수형으로 하더라도 원하는 결과를 얻지 못한다

		double rst2, rst3,  rst4;

		//rst2 = a / b;						// 7.0	(정수끼리 계산된 값이 저장됨)
		rst2 = a / (double)b;				// 어느 한쪽의 값을 double타입으로 변환
		System.out.println(rst2);			// 7.5

		rst3 = 100 / 3;	
		//rst3 = a / (double)b;				//어느 한쪽의 값을 double타입으로 변환
		System.out.println(rst3);			// 33.0 (정수끼리 계산된 값이 rst3에 저장이 되어서 출력이 33.0 된다)

		rst4 = 100 / 3.0;
		System.out.println(rst4);			//33.333.... (굳이 double을 사용하지 않고 소숫점을 표시해도 자동으로 게산이 됨)
		
		double score;
		score = 250 / 3.0;
		System.out.printf("세과목의 평균은 %.1f입니다%n",score);
	}
}
