//	정수, 실수. 문자형 타입 변수 사용에서 틀린곳을 찾아서 모두 수정하시오
//	혹,  에러가 안나더라도 올바르게 수정해주시오
//	이 문제는 변수 선언과 사용시 주의할 점에 대해서 알고 있는지를 묻는 문제이다

public class DataType1{

	public static void main(String[] args){
		
		//[1] : 변수 선언
		int a;			// 정수가 저장된 변수 이름을 a로 만들어라
		int b; int c = 90;
		double d;		// 실수가 저장된 변수 이름을 d로 만들어라
		char e;			// 문자가 저장된 변수 이름을 e로 만들어라

		//[2] : 선언된 변수에 값을 대입
		a = 10;
		d = 10;			// 정수 10을 입력하면 10.0으로 출력
		e = 'A';		// 쌍따옴표 하면 에러

		//[3] : 출력
		System.out.println(a);	// 10
		System.out.println(b);	// Err -> 초기화 되어있지 않기 때문에 에러가 나온다
		System.out.println(c);	// 90
		System.out.println(d);	// 10.0 -> 10으로 초기화 했지만 실수형(double)이기 때문에 출력은 10.0
		System.out.println(e);	// A

		//[4] : 여러 개 변수 선언 및 초기화 --> 선언 후 값을 세팅
		//[4-1]
		int w; 				// 선언만 해둔 상태에서는 에러X, 초기화를 하지 않은 상태에서 해당 변수를 사용하려고 하면 에러O
		  
		int x,y,z = 900; 	// z만초기화가 되고 x,y 는 초기화 안됨
		
		//[4-2]
		int x,y,z;			//다같이 선언후 따로 초기화 해주는건 가능
		x = 900;
		y = 900;
		z = 900;			
		
		//[4-3]
		int x = 300, y = 400, z = 500;

		//[4-4] : 같은 값으로 초기화
		//String str1, str2, str3;
		//str1, str2, str3 = "korea";	//str3만 초기화(korea)로 되고 str1이나 str2는 초기화 안됨
		
		// 여러 문자열 변수 한꺼번에 초기화
		String str1, str2, str3;
		str1 = str2 = str3 = "Korea"	//이와 같이 사용하는건 가능 (str1, str2, str2가 모두 Korea로 초기화)
		
		// 여러 정수형 변수 한꺼번에 초기화
		int i, j, k;
		i = j = k = 100;				//정수형 변수도 동일하다
	}
}
