// 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후를 출력하도록 구현해보시오
// 이 문제는 삼항 연산자의 사용법에 대해서 아는지를 묻는 문제이다
// 삼항 연산자를 쓰는 이유는 한줄로 깔끔하게 끝내고자 하기 때문에 굳이 번거롭게는 할 필요는 없다

public class If_ThreeOperator{

	public static void main(String[] args){

		// [1] : 변수 선언
		int hour = 10;

		
		// [2] : 삼항 연산자 테스트 --> 10보다 작거나 같으면 100을 곱하시오
		int test = hour <= 10 ? hour * 100 : hour;
		System.out.println(test);

		
		// [3] : 삼항 연산자를 이용하여 12시 보다 작으면 오전, 크면 오후를 출력하시오
		String str1 = "오전";
		String str2 = "오후";
		String ampm = hour < 12 ? str1 : str2;
		//String ampm = hour < 12 ? "오전" : "오후";		//반환값에 맞춰서 자료형 알맞게 써주기
		System.out.println("[3] : " + ampm);
		
	}
}
