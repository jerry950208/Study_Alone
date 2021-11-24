// 1, 2차원 배열의 생성 및 출력을 다양한 예제로 구현해보시오
// 이 문제는 자바 배열에 관해서 2차원 배열 위주로 생성 및 출력을 다양하게 해보는 종합문제입니다

import java.util.Arrays;

public class Array_OneTwoArray4{

	public static void main(String[] args){

		// [1] : String 1차원 배열 --> 3개의 문자열을 담을 수 있는 배열 생성하기
		// String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 --> 이때, 참조형 변수 각 요소는 기본값(null로 초기화)
		String[] province = new String[3];
		System.out.println(province[0]); 		//null출력
		System.out.println(province[1]); 		//null출력
		System.out.println(province[2]); 		//null출력
		

		// [2] : String 배열 초기화 --> 직접 입력
		province[0] = "강원도";
		province[1] = "전라도";
		province[1] = "경상도";
		System.out.println(province[1]);


		// [3] : String 배열 초기화 --> 배열 선언 및 생성시 {}로 동시에 초기화
		String[] nation = new String[] {"한국", "미국", "중국"};
		System.out.println(nation[1]);

		String[] flower = {"무궁화", "해바라기", "개나리"};
		System.out.println(flower[1]);

		
		//[4] : 반복문을 사용하여 배열 값 모두 출력
		for(int i=0; i<flower.length; i++)
			System.out.print(flower[i] + " ");
		
		System.out.println();
		

		//[5] : 향상된 for문으로 배열 요소 출력
		for(String str: flower)
			System.out.print(str + " ");		//기존 for문과는 다르게 flower[str]이 아닌 str로만 매개변수를 넣어도 된다

		System.out.println();


		//[6] : String 2차원 배열 만들기 --> 2x3 Shape
		//아시아 --> 동북아시아(한국, 중국, 일본), 동남아시아(태국, 베트남, 필리핀)	
		
		//String[][] asia_nations = {{"한국", "중국", "일본"}, {"태국", "베트남", "필리핀"}}		//이렇게 선언하고 초기화 해도 상관없음(대신 가독성이 떨어짐)
		String[][] asia_nations = {		//직관적으로 보기위해서 아래와 같이 하면 좋다
			{"한국", "중국"," 일본"}, 	//콤마(,) 잊지말기
			{"태국","베트남","필리핀"}

		};
		

		//System.out.println(asia_nations[0]);		//---동북아시아 국가를 저장하고 있는 1차원 배열의 주소를 참조하는 값이 출력;;	
		//System.out.println(asia_nations[1]);		//---동남아시아 국가를 저장하고 있는 1차원 배열의 주소를 참조하는 값이 출력;;	
		System.out.println(asia_nations[0][0]);		//한국 출력 : 실제 요소의값 출력
		System.out.println(asia_nations[0][1]);		//베트남 출력
		
		System.out.println(asia_nations.length);	// 2
		System.out.println(asia_nations[0].length);	// 3
	
		
		// [7] : 반복문을 사용한 String 2차원 배열 값 출력
		
		for(int i=0; i<asia_nations.length; i++){
			for(int j=0; j<asia_nations[i].length; j++)
				System.out.print(asia_nations[i][j] + " ");
			System.out.println();
		}


		// [8] : charAt() 메서드 사용 --> 해당 인덱스에 있는 값을 반환(굉장히 많이 사용) --> 단어를 char배열에 한글자씩 저장할 수 있음
		String[] strArr = {"hong", "kim", "park"};
		System.out.println(strArr[0].charAt(2));	//---n만 출력, 2번째 idx에 있는 글자를 출력하라
		System.out.println(strArr[1].charAt(0));
		System.out.println(strArr[2].charAt(strArr.length - 1));
		

		//[9] : 반복문에서 charAt() 메서드 사용
		
		//[9-1] 잘못된 예1
		//기대값 : hongkimpark

		for(int i=0; i<strArr.length; i++)
			System.out.print(strArr[i].charAt(i));		// ---hir --> 이중 반복문을 사용해줘야 한다;;
		System.out.println();

		//[9-2] 잘못된 예2
		for(int i=0; i<strArr.length; i++){
			for(int j=0; j<strArr.length; j++)
				System.out.print(strArr[i].charAt(j));	//honkimpar
			System.out.println();
		}

		//[9-3]
		System.out.println(strArr.length);	//3
		//System.out.println(strArr[0].length); 	//Err --> 1차원 배열이기에 불가능하다
		
		System.out.println(strArr[0].length());		//hong --> 4
		//length뒤에 ()를 해주면 해당 인덱스의 길이를 계산해서 리턴해준다
		

		//[9-4] 
		for(int i=0; i<strArr.length; i++)
			for(int j=0; j<strArr[i].length(); j++)
				System.out.print(strArr[i].charAt(j));
		
		System.out.println();
	

		//[10] : length vs length()
		//length = 배열의 길이
		//length() = 문자열의 길이

		int[] aaa = new int[10];
		System.out.println(aaa.length); 	// ----10

		String bbb = "Welcome to Seoul";
		System.out.println(bbb.length());	// ----16(공백도 포함해준다)
		

	}
}
