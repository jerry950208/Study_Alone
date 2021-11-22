// 배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성 해보시오
// 이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지를 묻는 문제이다

public class Array_Basic_003{

	public static void main(String[] args){

		// [1] : 배열 선언
		int[] sales_table = new int[5];

		// [2] : 선언한 배열 공간에 값 입력하기
		sales_table[0] = 3;
		sales_table[1] = 11;
		sales_table[2] = 22;
		sales_table[3] = 33;
		sales_table[3] = 44;

		//[3] : 값 출력하기
		for(int i=0; i<5; i++)
			System.out.println(sales_table[i]);
		
		System.out.println(sales_table.length);
	}
}
