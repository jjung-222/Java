package exam07;

public class BoardService {
	//Field
	int count;
	
	//Constructor
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void save(String title, String content){
		int bno = getNewBno();
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "을 저장합니다.");
	}
	
	int getBoards(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	int getSum1(int[] values) {
	      int result = 0;
	      for(int value : values) {
	         result += value;
	         
	      }
	      return result;
	   }
	   
	   int getSum2(int ... values) {
	      int result = 0;
	      for(int value : values) {
	         result += value;
	         
	      }
	      return result;
	   }
}
