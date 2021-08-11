//https://hwan-shell.tistory.com/119(참고)

#include <iostream>
#include <vector>

using namespace std;

int main(void){
	
	int N;
	cin >> N;
	vector<int> v1(N);					// N만큼 벡터 생성 후 0으로 초기화
	vector<int> v2 = {1, 2, 3};			// 벡터 생성후 1, 2, 3으로 초기화
	vector<int> v3 = {{1, 2},{3, 4}};	// 2차원 벡터 선언 및 초기화
	vector<vector<int>> v4				// 2차원 벡터 생성


	//v.begin()		// 벡터 시작점의 주소 값 반환
	//v.end()		// 벡터 끝부분 + 1 주소값 반환
	
	//v.[i] 		//벡터의 i번째 요소 접근
	//v.front		//벡터의 첫번째 요소 접근
	//v.back		//벡터의 마지막 요소 접근

	//v.push_back() //벡터의 마지막 부분에 새로운 요소 추가
	//v.pop_back() 	//벡터의 마지막 부분 제거
	//v.insert(삽입할 위치의 주소 값, 변수 값)	//사용자가 원하는 위치에 요소 삽입
	//v.emplace(삽입할 위치에 주소 값, 변수 값)	//사용자가 원하는 위치에 요소 삽입(복사 생성자x)
	//v.emplace_back() 							//벡터의 마지막 부분에 새로운 요소 추가(복사 생성자x)
	//v.erase(삭제할 위치)
	//v.erase(시작위치, 끝 위치)				//사용자가 원하는 index	값을 지운다
	//v.clear()			//벡터의 모든 요소를 지운다
	//v.swap(벡터변수)	//벡터와 벡터를 스왑한다
}
