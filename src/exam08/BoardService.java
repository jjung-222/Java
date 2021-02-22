package exam08;

public class BoardService {
	//Field
	String[][] boards;
	int count = 0;
	/*
	 {
	 	{"1", "제목", "내용", "글쓴이", "3"},
	 	.....
	 }
	 */
	
	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}
	
	int getNewBno() {
		return ++count;
	}
	//Method
	void create(int bno, String title, String content, String writer,int hitcount) {
		bno = getNewBno();
		String[] board = {
				""+bno, //int를 string으로 바꾸는 방법1
				title,
				content,
				writer,
				String.valueOf(hitcount) //int를 string으로 바꾸는 방법1
		};
		for(int i=0; i<boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	void showList(int bno, String title, String content, String writer,int hitcountv) {
		for(int i=0; i<100; i--) {
			 for(int k=0; k<5; k++) {
				 System.out.print(boards[i][k] + "\t");
			 }
         System.out.println();
		}
	}
	
	String[] read(int bno) {
		String[] result = null;
		String strBno = "" +bno;
		for(int i=0; i<100; i++) {
				if(boards[i][0] == null) {
					if(boards[i][0].equals(strBno))
						result = boards[i];
						break;
				}
			}
//		}
		return result;
	}
	
}
