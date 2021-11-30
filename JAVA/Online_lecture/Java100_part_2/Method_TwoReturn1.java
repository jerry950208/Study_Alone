// 2개의 정수형 값을 리턴하는 메서드를 구현히시오
// 이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다

import java.util.Arrays;
public class Method_TwoReturn1{
	
	public static int[] testMethod(){	// 반환되는 타입이 정수형 배열이기 때문에 맞춰준다

		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		return new int[] {num1, num2, num3};	// 배열로 리턴을 해주면 된다

		// 파이썬은 return num1, num2; 가능
	}

	public static void main(String[] args){

		//[1] : 변수 선언 --> 메서드로 부터 반환받을 값이 배열이기 때문에 선언을 배열로 한다
		int[] result = testMethod();
		
		//[2] : 출력
		//System.out.println(result);	//참조형 타입인 배열이기 때문에 주소값이 출력된다
		System.out.println(result[0] + " " + result[1]);	// 각각 출력
		System.out.println(result[0] + result[1]);			// 연산도 가능하다
		System.out.println(Arrays.toString(result));		// 모든 요소를 출력 --> 반복문 사용 없이
	}
}
