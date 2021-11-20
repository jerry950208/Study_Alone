// 기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오
// 이 문제는 기본형 타입의 값을 초기화 하는 방법에 대해서 알고 있는지를 묻는 문제이다

public class DataType2{

	public static void main(String[] args){
		 
		//[1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
		byte b = 100;			
		short s = 30000;
		int i = 2100000000;
		long l = 7000000000L;	//다른 변수들과 달리 접미사를 붙혀줘야 한다(L or l) -> 소문자보단 대문자를 쓰는 편이다
		float f = 9.8F;			//다른 변수들과 달리 접미사를 붙혀줘야 한다(F or f)	-> 소문자보단 대문자를 쓰는 편이다
		double d = 3.14;
		char c = 'A';
		boolean bl = false;		//0과 1이 아닌 ture, fals(True, False는 안됨)

		//[2] : 출력
		System.out.println(b + " Byte의 최댓값 : " + Byte.MAX_VALUE);
		System.out.println(s + " Short의 최댓값 : " + Short.MAX_VALUE);
		System.out.println(i + " Int의 최댓값 : " + Integer.MAX_VALUE);
		System.out.println(l + " Long의 최댓값 : " + Long.MAX_VALUE);
		System.out.println(f + " Float의 최댓값 : " + Float.MAX_VALUE);
		System.out.println(d + " Double의 최댓값 : " + Double.MAX_VALUE);
		System.out.println(c);
		System.out.println(bl);
	}
}
