#include <iostream>
#include <string>
#include <stack>//스택 헤더파일

using namespace std;

stack<int> s;

int main(void){
	
	int N,num;
	string str;
	cin >> N;

	for(int i=0; i<N; i++){
		
		cin >> str;

		if(str == "push"){
			cin >> num;
			s.push(num);
		}

		else if(str == "pop"){
			
			if(s.empty())
				cout << "-1" << "\n";
			
			else{
				cout << s.top() << "\n";
				s.pop();
			}
		}

		else if(str == "size")
			cout << s.size() << "\n";

		else if(str == "empty")
			cout << s.empty() << "\n";

		else{
			
			if(s.empty())
				cout << "-1" << "\n";
			
			else
				cout << s.top() << "\n";
		}
	}
}
