// 메인 베서드에서 100을 보냈을 때 값이 수정 되게끔 Call by reference 방식으로 코드를 수정하시오
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 내보내라는 의미다
// a 값이 같은 결과가 나오도록 코드를 수정해보시오


public class Method_MethodCall2{
	
	public static void sum(Integer a){

		System.out.println("sum() 메서드 안에서 a값 출력 --> " + a);	//---참조(주소) 값(100)
	}

	public static void main(String[] args){

		// [1] : 변수 선언 및 메서드 호출
		// Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소값을 메서드로 보낸다
		Integer a = new Integer(100);		//여기서 new의 역할은 변수를 넣는 공간을 만들뿐만이 아니고 해당 주소값을 반환(return) 해준다
		//Method_MethodCall2 a = new Method_MethodCall2();
		sum(a);

		// [2]  : 출력
		System.out.println("main() 메서드 안에서 a값 출력 --> " + a);
	}
}

// Call by reference 는 주소값을 부르기때문에 같은 값을 가진다
// Call by value 는 말그대로 값을 부르기 때문에 값이 달라질수 있다

//Java 2-21강 나중에 다시한번 보기
