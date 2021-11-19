//정수형(int)을 문자열(String)로 변환하여 정수의 자릿수를 구하는 코드를 구현해보시오
//정수 12345를 입력하면 자릿수가 "5"로 출력되도록 한다
//이 문제는 정수형을 문자열로 문자열을 정수형으로 변환하는 방법에 대해서 아는지를 묻는 문제이다

// [!] : 바꾸는 이유?
// 정수형끼리의 연산이 아닌경우 더하기 연산 등을 수행했을 때 문자가 합쳐지는 결과가 나올 수 있기 대문
// 연산 외에도 메서드 호출시 인자값을 정수로 보내서 문자열로 처리하는 또는 반환하는 경우에도 필요
// 변환하는 방법은 여러가지가 있다


// 새로 알게되는 메서드
// int a = Integer.valueOf(문자형);				// 문자형 -> 정수형으로 변환해주는 메서드
// String str = String.valueOf(정수형);			// 정수형 -> 문자형으로 변환해주는 메서드

public class Type_IntString{

	public static void main(String[] args){

		//[1] : 정수 선언
		int a = 12345;
		String str = "12345";
		//System.out.println(a.length());		//Err(정수형이기 때문에)
		System.out.println("[1] --> " + str.length());	// 5(문자의 길이를 알려주는 메서드)
		
		//[2] : 정수 --> 문자열로 변환 --> 자릿수 구하기
		String stra = String.valueOf(a);		// 문자열로 변환을해서 리턴해준다
		System.out.println("[2] --> " + stra.length());		// a를문자열로 변환을 해줬기 때문에 Err가 안나온다 	
		
		//[3] : 문자열 + 정수형 = ?
		System.out.println("[3] --> " + (12345+1));	// 12346
		System.out.println("[3] --> " + (str + 1));	// 123451로 출력(문자열 12345 뒤에 바로 정수형 1이 붙음)

		//[4] : 문자열 --> 정수로 변환
		int b = Integer.valueOf(str);	// 정수형으로 변환을 해서 리턴해준다
		System.out.println("[4] --> " + (b + 1));		// 12346으로 출력
	}
}
