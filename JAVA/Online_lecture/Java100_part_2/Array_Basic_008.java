// 다음중 다중 배열의 선언으로 맞는 것을 골라보시오
// 이 문제는 배열 선언을 여러개 해야하는 경우 한줄에 모두 선언하고 만들수 있는지를 묻는 문제이다

import java.util.Arrays;

public class Array_Basic_008{

	public static void main(String[] args){

		//[1] : a, b, c 모두 정수형 배열 선언을 해주는게 맞다
		int[] a, b, c;

		//[2] : d, e, f 모두 정수형 배열 선언을 해주는게 맞다(각각 따로 선언)
		int d[], e[], f[];

		//[3] : g[]는 맞지만 그 뒤에 있는 h, i는 배열로 선언이 되는 것이 아니고 정수형 배열로 선언된 것이다
		int g[], h, i;


		// 배열 사용이 가능한지 체크
		a = new int[3];
		b = new int[3];
		c = new int[3];
		//h = new int[3];	// x

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	
		d = new int[6];
		e = new int[6];
		f = new int[6];
		g = new int[9];
		h = 100;
		i = 200;

		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(g));
		System.out.println(h);
		System.out.println(i);
	}
}
