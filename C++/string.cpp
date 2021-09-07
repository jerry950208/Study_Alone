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

	//---------------------------------------------------------------------
	//s.substr(start, length)
	
	//Example
	/*
	#include <iostream>
	#include <string>
	using namespace std;
	
	int main(void){
		
		string s = "";
		string output_s = "";
		cin >> s;
		
		//case 1
		output_s = s.substr(2, 2);
		
		//case 2
		output_s = s.substr(s.length()/2, 2);

		return 0;
	}
	*/


	//---------------------------------------------------------------------
	
	//toupper(), tolower()
	//문자를 인자로 받는다. 문자를 넣게되면 아스키 코드표에 기반한 10진수로 변환되어 들어가며 
	//숫자로 들어가게 되어도 아스키 코드표에 기반한 숫자로 인식한다

	//int toupper(int c) : 매개변수로 들어온 인자가 소문자인 경우 대문자로 반환한다
	//int tolower(int c) : 매개변수로 들어온 인자가 대문자인 경우 소문자로 반환한다
	// *다른 모든 문자는 그대로 반환해준다.
	
