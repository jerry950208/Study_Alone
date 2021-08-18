//	큐는 First In First Out (FIFO)구
	#include <queue>		//큐 헤더

queue<int> q; 	//큐 선언할때는 스택과 같은 형태
queue<string> q;
//	추가 및 삭제
	q.push(X)	// 큐의 가장 뒤에 데이터 추가
	q.pop() 	// 큐에 가장 앞에 있는 데이터 삭제

//	확인(조회)
	q.front() 	// 큐 제일 앞에 있는 원소를 반환
	q.back() 	// 큐 제일 뒤에 있는 원소를 반환

//	기타
	q.empty() 	// 큐가 비어있으면 true 아니면 false를 반환
	q.size() 	// 큐의 사이즈를 반환
	swap(queue1, queue2)	//큐1 과 큐2의 내용을 바꾼다
