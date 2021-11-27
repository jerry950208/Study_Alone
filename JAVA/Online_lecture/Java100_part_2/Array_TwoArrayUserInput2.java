// 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오
// 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오
// 이 문제는 배열 생성시 사용자로 부터 입력을 받아서 2차원 배열을 만들 수 있는지를 묻는 문제이다


import java.util.Scanner;

public class Array_TwoArrayUserInput2{

	public static void main(String[] args){

		//[1] : 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		//[2] : 2차원 배열의 행과 열 선언 --> 사용자 입력으로 처리
		System.out.print("행의 개수를 입력하고 [Enter] 치세요 : ");
		int Row = sc.nextInt();		//행
		System.out.print("열의 개수를 입력하고 [Enter] 치세요 : ");
		int Column = sc.nextInt();	//열
		
		//[3] : char 2차원 배열 선언 --> 사용자로 부터 Row, Column을 입력받아 --> gameMap[Row][Column] 생성
		char[][] gameMap = new char[Row][Column];

		//[4] : 사용자 입력을 받아서 저장할 String 배열 선언 --> 이때 크기를 [Row]로 해주도록 한다***
		//크기를 Row만큼만 해주는 이유?? -> 어차피 사용자가 입력한 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문이다
		String[] strAr = new String [Row];
		
		//[5] : 2차원 배열 요소 --> 사용자가 입력하는 값으로 셋팅
		for(int i=0; i<Row; i++){
			
			System.out.printf("%d번째 행에 입력할 문자 %d개를 차례대로 입력하고 [Enter] 치세요 : ", i+1, Column);
			strAr[i] = sc.next();

			for(int j=0; j<Column; j++){

				gameMap[i][j] = strAr[i].charAt(j);		// j인덱스에 있는 값을 하나씩 가져와서 --> gameMap 좌표에 입력하기
				
			}
		}
		
		//[6] : 2차원 배열에 들어있는 값 출력하기
		//System.out.println(strAr);		//strAr의 주소값 출력
		

		System.out.println("-------------------------------------");
		for(int i=0; i<Row; i++){
			for(int j=0; j<Column; j++)
				System.out.print(gameMap[i][j]);
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
	}
}
