// 크기 5의 정수형과 실수형 배열을 생성하고 각각의 주소 겂을 출력해보시오
// 주소 값은 다른 말로 참조 값이라고도 한다
// 이 문제는 배열 변수에 들어있는 값이 참조형 타입인지에 대해서 알고 있는지를 묻는 문제이다


public class Array_Basic_006{

	public static void main(String[] args){

		//[1] : 정수형과 실수형 배열 변수 선언
		
		int[] arr;							//	선언만 했을 경우에는 실제 메모리 공간상에 저장공간 생성 X
		arr = new int[] {3, 3, 3, 3, 4};	//	초기화를 했을 경우에 저장공간이 생정된다
		//int[] arr = {3, 3, 3, 3, 4};
		double[] arr2 = {9.8, 2.45, 5.98, 5.11, 3.14};


		//[2] : 마지막 배열 요소 값 출력
		System.out.println(arr[arr.length - 1]);		//4
		System.out.println(arr2[arr2.length - 1]);		//3.14


		//[3] : 배열명 자체를 찍어서 출력 --> 주소(참조) 값 --> I : 정수형 배열, D : 실수형 배열을 각각 의미함
		System.out.println(arr); 	//정수형 배열 --> I
		System.out.println(arr2);	//실수형 배열 --> D
	
	}
}
