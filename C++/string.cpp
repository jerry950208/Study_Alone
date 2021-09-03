#include <iostream>
#include <string>
using namespace std;

int main(void){
	
	int num;
	string s = "";
	cin >> num;
	
	//std::to_string();
	//to_string(int num);
	//to_string(long num);
	//to_string(long long num);
	//to_string(float num);
	//to_string(double num);
	//등등 여러가지 변수형이 매개변수로 올수 있다
	// 숫자 타입의 데이터를 안전하게 스트링 타입으로 변경하도록 하는 함수
	
	//Example
	/*
	//Example
	#include <iostream>
	#include <string>
	using namespace std;

	int main(void){
		
		s += to_string(num);
		cout << s << endl;
		
		return 0;
	}
	*/
	//---------------------------------------------------------------------

	//stoi : string 타입의 문자열을 숫자(int)로 바꿔준다

	//stoi = string to int
	//stof = string to float
	//stod = stirng to double
	//stol = string to long
	//stoll = string to long long
	
	/*
	//Example
	#include <iostream>
	#include <string>
	using namespace std;

	int main(void){
		
		cin >> s;
		int i = stoi(s);
		cout << i << endl;
		
		return 0;
	}
	*/
	//---------------------------------------------------------------
	//isdigit() : 숫자를 판단하는 함수 	//인터넷에는 #include <cctype> 선언하라 되어있으나 안해도 사용가능
	int isdigit (int c);				//함수의 원형
	//0 ~ 9에 해당하는 ASCII값이 입력으로 들어오면 0이 아닌값(True), 숫자에 해당하지 않는 값이 들어오면 0(False)을 반환한다
	
	/*
	//Example
	#include <iostream>
	#include <string>
	using namespace std;

	int main(void){
		
		string s = "";
		cin >> s;
		
		for(int i=0; i<s.size(); i++)
			cout << isdigit(s[i]);
		
		return 0;
	}
	*/
}
