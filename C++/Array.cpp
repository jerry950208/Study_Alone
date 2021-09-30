#include <iostream>
#include <string>
using namespace std;

int main(void){
	
	string s = "";
	
	for(int i=0; i<5; i++)
		s = "12345"[i] + s;		// 뭐라고 검색을 해야하는지는 모르겠지만 string이 reverse됨(reverse함수 필요없나?)

	cout << s << endl;
	return 0;
}
