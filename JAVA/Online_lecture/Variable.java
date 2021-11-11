//변수와 변수 선언이란 무엇이고, 변수의 용도와 왜 필요한지 설명해보시오.
//1. 변수란 무엇인가?
//2. 변수 선언이란 무엇인가?
//3. 변수의 용도는 무엇이고 왜 필요한가?



//[1] : 변수란 무엇인가? 
//		-> 데이터를 저장하는 메모리 공간이다(변하는수)
//		-> 반대되는 개념음 상수 이다


//[2] : 변수 선언이란 무엇인가?
//		-> 변수를 사용하기 위해서는 먼저 변수타입에 맞는 선언을 해줘야 한다
//		-> 각각의 타입에 맞는 데이터 타입을 선언해주고 사용해야 한다


//[3] : 변수의 용도? 
//		-> 어떤 연산을 수행할 때 값들을 저장해 놓아야 하는데 그때 변수를 활용한다


//[4] : 왜 필요한가?
public class Variable{
	
	public static void main(String[] args){
		
		int number;		// 정수가 저장될 변수 이름을 number로 만들어라
		int a;			// 정수가 저장된 별수 이름을 a로 만들어라
		int sum;

		number = 3;
		a = 4;
		sum = number + a;
		

		System.out.println(number);
		System.out.println(a);
		System.out.println(number + a);
		System.out.println(sum);
	}
}	
