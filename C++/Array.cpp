#include <iostream>
#include <string>
using namespace std;

int main(void){
	
	string s = "";
	
	for(int i=0; i<5; i++)
		s = "12345"[i] + s;		// 뭐라고 검색을 해야하는지는 모르겠지만 string이 reverse됨(reverse함수 필요없나?)
		//s = "123456"[i] + s;	//이렇게 하면 54321 출력
		//s += "12345"[i];		//이건 안됨
		//s = "!@#$%"[i] + s; 	// 가능	
		//s = "abcde"[i] + s; 	// 가능
		//s = "가나다라마"[i] + s; 	// 불가능
		//s = "ㄱㄴㄷㄹㅁ"[i] + s; 	// 불가능
	cout << s << endl;
	return 0;
}

//	일단 char형으로 들어가는듯?
//	근데 한글은 적용이 안됨(아스키 코드표 기준으로만 적용이 되는듯?)
