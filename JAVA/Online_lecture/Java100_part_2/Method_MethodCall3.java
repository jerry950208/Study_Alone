// 메인 메서드에서 정수 100을 Call by reference 방식으로 메서드 호출하는 코드를 수현하시오
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다
// a 값이 같은 결과가 나오도록 코드를 수정해보시오
// 단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다

class TestNumber{

	int num;
	TestNumber(int num){	// 이 클래스의 객체가 생성될때 가장 먼서 실행되는 메서드
		this.num = num;	// 해당 객체를 의미한다
	}
}

public class Method_MethodCall3{
	
	public static void ref_sum(TestNumber a){	// 주소에 들어있는 값을 바꾸기 때문에 c에서 전역변수로 계산하던거 생각하면 된다

		//System.out.println("ref_sum() 메서드안에서의 a값 --> " + a);	//---a값(TestNumber 주소)을 출력해보면 주소가 들어있음을 알 수 있다---;;;
		System.out.println("ref_sum 메서드 안에서 값을 변경하기 전 --> " + a.num);	//100
		a.num += 400;
		System.out.println("ref_sum 메서드 안에서 값을 변경한 후 --> " +  a.num);	//500
	}

	public static void main(String[] args){

		//[1] : 객체 변수 선언
		TestNumber ref = new TestNumber(100);	// 객체가 생성이 되고 그 주소를 반환을 해준다(ref는 주소값을 가지고 있다)
		
		System.out.println("ref_sum 메서드 호출 전 : " + ref.num);	// 100
		ref_sum(ref);			//주소값에 의해서 ref_sum 메서드를 호출 하고 있다
		System.out.println("--------------------------------");
		System.out.println("ref_sum 메서드 호출 후 : " + ref.num);	//500
	}
}


/*
class TestNumber{

	int num;
	TestNumber(int num){	// 이 클래스의 객체가 생성될때 가장 먼서 실행되는 메서드
		this.num = num;	// 해당 객체를 의미한다
	}
}

public class Method_MethodCall3{
	
	public static void sum(int a){
		a += 400;
		System.out.println(a);		//500		
	}
	

	public static void sum2(Integer b){

		b += 400;
		System.out.println(b);		//100
	}
	
	public static void ref_sum(TestNumber a){

		System.out.println("ref_sum() 메서드안에서의 a값 --> " + a);	//---a값(TestNumber 주소)을 출력해봄녀 주소가 들어있음을 알 수 있다---;;;
	}

	public static void main(String[] args){

		//[1] : 변수 선언
		int a = 100;		//Call by value
		sum(a);

		Integer b = new Integer(100);
		sum2(b);
		System.out.println(b);

		System.out.println(a);

		//[1] : 객체 변수 선언
		TestNumber ref = new TestNumber(100);	// 객체가 생성이 되고 그 주소를 반환을 해준다(ref는 주소값을 가지고 있다)
		ref_sum(ref);			//주소값에 의해서 ref_sum 메서드를 호출 하고 있다

		System.out.println(ref);
	}
}*/
