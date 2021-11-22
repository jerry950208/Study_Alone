//자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오
//정수형 타입과 문자형 타입에 대해서만 구현한다
//이때. 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오

public class Primitive_Data_Type{
	
	public static void main(String[] args){
		
		//byte, short, int, long. char
		//System.out.println(Byte.BYRES);		//바이트 계산
		//System.out.println(Byte.SIZE);		//비트 계산
		System.out.println("Byte:\t" + Byte.BYTES + "(바이트)"  + " " + Byte.SIZE + "(비트)\t" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE );
		System.out.println("Short:\t" + Short.BYTES + "(바이트)"  + " " + Short.SIZE + "(비트)\t" + Short.MIN_VALUE + "~" + Short.MAX_VALUE );
		System.out.println("Int:\t" + Integer.BYTES + "(바이트)"  + " " + Integer.SIZE + "(비트)\t" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE );
		System.out.println("Long:\t" + Long.BYTES + "(바이트)"  + " " + Long.SIZE + "(비트)\t" + Long.MIN_VALUE + "~" + Long.MAX_VALUE );
		System.out.println("Char:\t" + Character.BYTES + "(바이트)"  + " " + Character.SIZE + "(비트)\t" + Character.MIN_VALUE + "~" + Character.MAX_VALUE );
		System.out.println("Char:\t" + Character.BYTES + "(바이트)"  + " " + Character.SIZE + "(비트)\t" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE );
		
	}
}

//short와 char의 범위가 다른 이유는 short는 정수형 타입이기 때문에 음수를 가지고 있고 char는 문자이기 때문에 음수가 없다(양수만 가질수 있다)
