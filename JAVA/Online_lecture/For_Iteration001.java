// 자바의 반복문 종류를 열거해보시고, 각각의 기본적인 사용법을 코드로 구현해보시오
// 이 문제는 자바의 여러 반복문 종류와 각각의 개념과 기본 사용법에 대해서 아는지를 묻는 문제이다

// [!] : 자바의 반복문 종류 --> 크게 봤을때 4가지
// for
// while
// do ~ while
// 향상된 for문

// [1] : for
	//for(변수 초기식 ; 조건식; 증감식){
	
	//	조건식 --> 참인 동안 실행
	//}
public class For_Iteration001{
	
	public static void main(String[] args){

		for(int i=0; i<10; i++){

			System.out.print(i + " ");
		}
		System.out.println();
	}

}

